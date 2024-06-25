
package Aux;

import Classes.*;
import java.io.*;
import java.util.Date;

/**
 * Programa per gestionar les incidencies (PART2)
 * 19/02/2020
 * @author GRUP 1
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class Filelog {//Classe per poder generar fitxer de LOGS del que esta passant amb el programa.

    public static File log = new File("log.txt");

    public static void createFile() {
        try {
            if (log.createNewFile()) {
                //System.out.print("File created");
                PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
                Date date = new Date();
                file.println("Log create [" + date + "];");
                file.println("--------------------------------------------------");
                file.println("Program started [" + date + "];");
                file.println("--------------------------------------------------");
                file.close();
            } else {
                //System.out.println("File exist");
                PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
                Date date = new Date();
                file.println("--------------------------------------------------");
                file.println("Program started [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (start)");
        }
    }
  
    
    
    public static void importExportTicket(int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            if (type == 0) {
                file.println("Tickets has been exported [" + date + "]");
            } else {
                file.println("Tickets has been imported [" + date + "]");
            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error (import/export)");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void importExportCompany(int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            if (type == 0) {
                file.println("Companies has been exported [" + date + "]");
            } else {
                file.println("Companies has been imported [" + date + "]");
            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error (import/export)");
        }
    }
    
    
    
    
        public static void importExportSchool(int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            if (type == 0) {
                file.println("Schools has been exported [" + date + "]");
            } else {
                file.println("Schools has been imported [" + date + "]");
            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error (import/export)");
        }
    }
        
        
    
        
        
        
        
        
        
     public static void importExportCategory(int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            if (type == 0) {
                file.println("Categories has been exported [" + date + "]");
            } else {
                file.println("Categories has been imported [" + date + "]");
            }
            file.close();

        } catch (IOException e) {
            System.out.println("Error (import/export)");
        }
    }
    
    
    
    
    
    
    
    /**
     *
     * CATEGORIES LOGS DE (CREAR / ELIMINAR / MODIFICAR CATEGORIES)
     *
     */
    public static void catAddDeleteLog(String name, int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            if (type == 0) {
                Date date = new Date();
                file.println("Category name: " + name + " has been added [" + date + "];");
                file.close();
            } else {
                Date date = new Date();
                file.println("Category name: " + name + " has been disabled [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (insert/remove)");
        }
    }

    public static void catModifyLog(String name, String aname, String desc, String adesc) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            file.println("Category has been modified [" + date + "] {");
            file.println("\t-Name: " + name + " => " + aname);
            file.println("\t-Desc: " + desc + " => " + adesc);
            file.println("};");
            file.close();

        } catch (IOException e) {
            System.out.println("Error (modify)");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     *
     * EMPRESA LOGS DE (CREAR / ELIMINAR / MODIFICAR EMPRESA)
     *
     */
    public static void entAddDeleteLog(String name, int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            if (type == 0) {
                Date date = new Date();
                file.println("Company name: " + name + " has been added [" + date + "];");
                file.close();
            } else {
                Date date = new Date();
                file.println("Company name: " + name + " has been disabled [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (insert/remove)");
        }
    }

    public static void entModifyLog(String name, String aname, String code, String acode, String contact, String acontact) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            file.println("Company has been modified [" + date + "] {");
            file.println("\t-Name: " + name + " => " + aname);
            file.println("\t-Code: " + code + " => " + acode);
            file.println("\t-Contact: " + contact + " => " + acontact);
            file.println("};");
            file.close();

        } catch (IOException e) {
            System.out.println("Error (modify)");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     *
     * INSTITUT LOGS DE (CREAR / ELIMINAR / MODIFICAR INSTITUT)
     *
     */
    public static void insAddDeleteLog(String name, int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            if (type == 0) {
                Date date = new Date();
                file.println("School name: " + name + " has been added [" + date + "];");
                file.close();
            } else {
                Date date = new Date();
                file.println("School name: " + name + " has been disabled [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (insert/remove)");
        }
    }

    public static void insModifyLog(String name, String aname, String code, String acode, String contact, String acontact) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            file.println("School has been modified [" + date + "] {");
            file.println("\t-Name: " + name + " => " + aname);
            file.println("\t-Code: " + code + " => " + acode);
            file.println("\t-Contact: " + contact + " => " + acontact);
            file.println("};");
            file.close();

        } catch (IOException e) {
            System.out.println("Error (modify)");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     *
     * INCIDENCIES LOGS DE (CREAR / ELIMINAR / MODIFICAR INCIDENCIES)
     *
     */
    public static void incAddDeleteLog(String topic, int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            if (type == 0) {
                Date date = new Date();
                file.println("Ticket topic: " + topic + " has been added [" + date + "];");
                file.close();
            } else {
                Date date = new Date();
                file.println("Ticket topic: " + topic + " has been disabled [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (insert/remove)");
        }
    }

    public static void incModifyLog(String topic, String atopic, String description, 
            String adescription, Categoria category, Categoria acategory, String user, String auser, Entitat entity, Entitat aentity) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            Date date = new Date();
            file.println("Ticket has been modified [" + date + "] {");
            file.println("\t-Topic: " + topic + " => " + atopic);
            file.println("\t-Desc: " + description + " => " + adescription);
            file.println("\t-Category: " + category + " => " + acategory);
            file.println("\t-User: " + user + " => " + auser);
            file.println("\t-Entity: " + entity + " => " + aentity);
            file.println("};");
            file.close();

        } catch (IOException e) {
            System.out.println("Error (modify)");
        }
    }
    
    
    
}
