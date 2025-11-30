#=====================================================#
# File-based Contact CRUD # Create Read Update Delete #
#=====================================================#

contacts_file = "contacts.txt"

def load_contacts():
    """Read contacts from file into list / array of contacts"""
    contacts = []
    try:
        with open(contacts_file, "r") as f:
            for line_num, line in enumerate(f, 1):
                line = line.strip()
                if not line:
                    continue
                parts = line.split(",")
                if len(parts) != 3:
                    print(f"Warning: Skipping invalid line {line_num}: {line}")
                    continue
                contact = {
                    "id": int(parts[0]),
                    "name": parts[1],
                    "email": parts[2]
                }
                contacts.append(contact)
    except FileNotFoundError:
        print("No contacts file found, starting fresh.")
    return contacts

def save_contacts(contacts):
    with open(contacts_file, "w") as f:
        for i, conact in enumerate(contacts, 1):
            f.write(f"{i},{conact['name']},{conact['email']}\n")

def show_menu():
    print("\n=== Contact App ===")
    print("1) List contacts")
    print("2) Add contact")
    print("3) Update contact")
    print("4) Delete contact")
    print("5) Exit")

def list_contacts():
    contacts = load_contacts()
    print("\n--- Contacts ---")
    if not contacts:
        print("No contacts found.")
    else:
        for contact in contacts:
            print(f"{contact['id']}: {contact['name']} <{contact['email']}>")

def add_contact():
    contacts = load_contacts()
    next_id = len(contacts) + 1
    name = input("Name: ").strip()
    email = input("Email: ").strip()

    if name and email:
        new_contact = {
            "id": next_id,
            "name": name,
            "email": email
        }
        contacts.append(new_contact)
        save_contacts(contacts)
        print(f"Added contact {next_id}: {name}")
    else:
        print("Name and email required!")

def update_contact():
    contacts = load_contacts()
    if not contacts:
        print("No contacts!")
        return

    while True:
        id_input = input("Enter ID to update: ").strip()
        if not id_input:
            print("ID required!")
            continue
        try:
            contact_id = int(id_input)
            break
        except ValueError:
            print("Enter a valid number!")

    contact_found = None
    for contact in contacts:
        if contact["id"] == contact_id:
            contact_found = contact
            break

    if not contact_found:
        print("ID not found!")
        return

    print(f"Found: {contact_found['name']} <{contact_found['email']}>")

    new_name = input("New name (Enter to keep): ").strip()
    if new_name:
        contact_found["name"] = new_name

    new_email = input("New email (Enter to keep): ").strip()
    if new_email:
        contact_found["email"] = new_email

    save_contacts(contacts)
    print("Contact updated!")

def delete_contact():
    contacts = load_contacts()
    if not contacts:
        print("No contacts!")
        return

    while True:
        id_input = input("Enter ID to delete: ").strip()
        if not id_input:
            print("ID required!")
            continue
        try:
            contact_id = int(id_input)
            break
        except ValueError:
            print("Enter a valid number!")

    index_to_delete = -1
    for i, contact in enumerate(contacts):
        if contact["id"] == contact_id:
            index_to_delete = i
            break

    if index_to_delete == -1:
        print("Not found!")
        return

    confirm = input(f"Delete '{contacts[index_to_delete]['name']}'? (y/N): ").lower()
    if confirm == 'y':
        del contacts[index_to_delete]
        save_contacts(contacts)
        print("Contact deleted!")
    else:
        print("Cancelled.")

# Main #
while True:
        show_menu()
        choice = input("Choose (1-5): ").strip()

        if choice == "1":
            list_contacts()
        elif choice == "2":
            add_contact()
        elif choice == "3":
            update_contact()
        elif choice == "4":
            delete_contact()
        elif choice == "5":
            print("Goodbye!")
            break
        else:
            print("Invalid choice!")