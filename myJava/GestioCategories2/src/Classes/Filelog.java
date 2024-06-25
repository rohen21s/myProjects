
package Classes;

import java.io.*;
import java.util.Date;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
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

    public static void addRemoveLog(String name, int type) {
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
    
    public static void addRemoveLog2(int id, int type) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            if (type == 0) {
                Date date = new Date();
                file.println("Category id: " + id + " has been added [" + date + "];");
                file.close();
            } else {
                Date date = new Date();
                file.println("Category id: " + id + " has been disabled [" + date + "];");
                file.close();
            }
        } catch (IOException e) {
            System.out.println("Error (insert/remove)");
        }
    }

    public static void modificationLog(String name, String aname, String desc, String adesc) {
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
}
