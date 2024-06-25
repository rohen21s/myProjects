package Classes;

import java.io.*;
import java.util.*;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class CSV {//Classe necessaria per poder Exportar dades a un fitxer CSV i Importar dades des d'un CSV.

    private String filename;
    private Object list;
    private int type;

    public CSV(Object list) {
        if (list instanceof LlistaCategories) {
            this.filename = "categories.csv";
            this.type = 1;
        }
        this.list = list;
    }

    public void export() {
        File file = null;
        PrintWriter pw = null;
        try {
            file = new File("categories.csv");
            pw = new PrintWriter(file);

            
            ArrayList<Categoria> ll_i = LlistaCategories.ArrayTags;
            for (int i = 0; i < ll_i.size(); i++) {
                Categoria element = ll_i.get(i);
                pw.println(element.toStringCSV());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
   
    
    public static void importar(String route) {
        String csvFile = route;
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ":";
        Date date = new Date();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] tag = line.split(csvSplitBy);
                String nom = tag[1];
                String desc = tag[2];

                LlistaCategories.ArrayTags.add(new Categoria(nom, desc));

            }

        } catch (Error | IOException e) {

        }

    }


    
}
