import requests
from datetime import datetime, date
import re

# Base URL for the OpenHolidaysAPI
API_BASE_URL = "https://openholidaysapi.org/PublicHolidays"

# Function to fetch holidays from the OpenHolidaysAPI
def fetch_holidays(country_code, year=2024):
    """
    Fetch public holidays for a given country and year from OpenHolidaysAPI

    Args:
        country_code (str): Country code (e.g., 'ES', 'FR', 'IT')
        year (int): Year to fetch holidays for (default: 2024)

    Returns:
        list: List of holiday dictionaries or None if request fails
    """
    params = {
        'countryIsoCode': country_code,
        'validFrom': f'{year}-01-01',
        'validTo': f'{year}-12-31',
        'languageIsoCode': country_code  # Using country code as language code for simplicity
    }

    try:
        response = requests.get(API_BASE_URL, params=params, headers={'accept': 'application/json'})
        response.raise_for_status()  # Raise an exception for HTTP errors
        return response.json()
    except requests.exceptions.RequestException as e:
        print(f"Error fetching holidays for {country_code}: {e}")
        return None

# Dictionary to store holidays in memory
holidays_data = {
    'ES': [],
    'FR': [],
    'IT': []
}

def load_holidays():
    """Load holidays for all countries into memory"""
    for country in ['ES', 'FR', 'IT']:
        holidays = fetch_holidays(country)
        if holidays:
            holidays_data[country] = holidays
            print(f"Successfully loaded {len(holidays)} holidays for {country}")
        else:
            print(f"Failed to load holidays for {country}")

# Menu to select the country code
def show_menu():
    print("\n----- Holiday Checker -----")
    print("1. ES (Spain)")
    print("2. FR (France)")
    print("3. IT (Italy)")
    print("4. Reload all holidays")
    print("5. Quit")

# Getter functions for each country's holidays
def getES_holidays():
    """Get holidays for Spain"""
    return holidays_data.get('ES', [])

def getFR_holidays():
    """Get holidays for France"""
    return holidays_data.get('FR', [])

def getIT_holidays():
    """Get holidays for Italy"""
    return holidays_data.get('IT', [])

def is_valid_date(date_str):
    """Check if a date string is in YYYY-MM-DD format"""
    try:
        if not re.match(r'^\d{4}-\d{2}-\d{2}$', date_str):
            return False
        # Try to create a date object to validate the date
        year, month, day = map(int, date_str.split('-'))
        date(year, month, day)
        return True
    except (ValueError, AttributeError):
        return False

def is_public_holiday(date_input, country_code):
    """
    Check if a date is a public holiday in the specified country

    Args:
        date_input (str): Date in 'YYYY-MM-DD' format
        country_code (str): Country code ('ES', 'FR', or 'IT')

    Returns:
        tuple: (bool, str) - (True if holiday with holiday name, False otherwise, message)
    """
    if not is_valid_date(date_input):
        return False, "Invalid date format. Please use YYYY-MM-DD format."

    holidays = holidays_data.get(country_code.upper(), [])
    for holiday in holidays:
        # Check both possible date field names from the API response
        date_value = holiday.get('date') or holiday.get('startDate')
        if date_value and date_value.startswith(date_input):
            # Get the holiday name, handling different possible response formats
            name = holiday.get('name')
            if isinstance(name, list) and len(name) > 0:
                name = name[0].get('text', 'Unknown Holiday')
            elif isinstance(name, dict):
                name = name.get('text', 'Unknown Holiday')
            else:
                name = str(name) if name else 'Unknown Holiday'

            return True, name

    return False, "No holiday found on this date."

def get_country_name(code):
    """Get full country name from country code"""
    countries = {
        'ES': 'Spain',
        'FR': 'France',
        'IT': 'Italy'
    }
    return countries.get(code, 'Unknown')

def main():
    # Load holidays when the application starts
    print("Loading holiday data...")
    load_holidays()

    while True:
        show_menu()
        choice = input("\nEnter your choice (1-5): ").strip()

        # Define country code based on choice
        country_code = None
        if choice == '1':
            country_code = 'ES'
        elif choice == '2':
            country_code = 'FR'
        elif choice == '3':
            country_code = 'IT'
        elif choice == '4':
            print("\nReloading holiday data...")
            load_holidays()
            continue
        elif choice == '5':
            print("\nGoodbye!")
            break
        else:
            print("\nInvalid choice. Please try again.")
            continue

        # If we have a valid country code, ask for date input
        while True:
            print(f"\n--- Check Holiday in {get_country_name(country_code)} ---")
            print("Enter [[ 2024 YEAR ]] date in YYYY-MM-DD format (or 'back' to return to menu):")
            date_input = input("Date: ").strip()

            if date_input.lower() == 'back':
                break

            if not is_valid_date(date_input):
                print("\nInvalid date format. Please use YYYY-MM-DD format.")
                continue

            # Check if the date is a holiday
            is_holiday, message = is_public_holiday(date_input, country_code)

            if is_holiday:
                print(f"\n {date_input} is a public holiday in {get_country_name(country_code)}!")
                print(f"   Holiday: {message}")
            else:
                print(f"\n  {date_input} is not a public holiday in {get_country_name(country_code)}.")

            # Ask if user wants to check another date
            print("\nCheck another date? (yes/no):")
            if input("> ").lower() not in ['yes', 'y']:
                break

if __name__ == "__main__":
    main()
