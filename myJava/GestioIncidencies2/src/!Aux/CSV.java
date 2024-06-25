package Aux;

import java.io.*;
import java.util.*;
import Classes.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * Programa per gestionar les categories 04/02/2020
 *
 * @author svyatossemenyuk GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez -
 * Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */
public class CSV {//Classe necessaria per poder Exportar dades a un fitxer CSV i Importar dades des d'un CSV.

    private String filename;
    private Object list;
    private int type;

    public CSV(Object list) {
        if (list instanceof LlistaEntitats) {
            this.filename = "empreses.csv";
            this.type = 1;
        } else if (list instanceof LlistaEntitats) {
            this.filename = "instituts.csv";
            this.type = 2;
        } else if (list instanceof LlistaIncidencies) {
            this.filename = "incidencies.csv";
            this.type = 3;
        } else if (list instanceof LlistaCategories) {
            this.filename = "categories.csv";
            this.type = 4;
        }
        this.list = list;
    }

    //Metode per crear missatges/alertes.
    public static void msg(String missatge, String titol) {
        JOptionPane.showMessageDialog(null, missatge, titol, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * //Metode per poder exportar dades d'un ArrayList a un fitxer CSV
     *
     * @param
     */
    public void exportCat() {
        File file = null;       //Creem la variable de tipus File.
        PrintWriter pw = null;  //Inicialitzem el PrintWriter

        //Control d'excepcions
        try {

            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Exporta dades a un fitxer .CSV");
            chooser.setAcceptAllFileFilterUsed(false);

            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {

                file = new File(chooser.getSelectedFile() + ""); //Assignacio de nom al nostre fitxer. (filename canviat)
                pw = new PrintWriter(file);//Indiquem que el PrintWriter utilitzi el nostre arxiu,

                ArrayList<Categoria> ll_i = LlistaCategories.llistaCategoria; //Instanciem el ArrayList de Categories.
                for (int i = 0; i < ll_i.size(); i++) {     //Necessitem recorrer aquest ArrayList.
                    Categoria element = ll_i.get(i);        //Cada passada, recorre el ArrayList per obtindre l'element.
                    pw.println(element.toString());      //Aquest element s'escriu dins del fitxer CSV.
                }

                msg("S'han exportat les dades correctament a " + file.getName(), "");

            } else {
                msg("Has cancelat l'exportacio", "");
            }

            //Control d'excepcions
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

    /**
     * //Metode per poder exportar dades d'un ArrayList a un fitxer CSV
     *
     * @param
     */
    public void exportEnt() {
        File file = null;       //Creem la variable de tipus File.
        PrintWriter pw = null;  //Inicialitzem el PrintWriter

        //Control d'excepcions
        try {

            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Exporta dades a un fitxer .CSV");
            chooser.setAcceptAllFileFilterUsed(false);

            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {

                file = new File(chooser.getSelectedFile() + ""); //Assignacio de nom al nostre fitxer. (filename canviat)
                pw = new PrintWriter(file);//Indiquem que el PrintWriter utilitzi el nostre arxiu,

                ArrayList<Entitat> ll_i = LlistaEntitats.llistaEntitat; //Instanciem el ArrayList de Categories.
                for (int i = 0; i < ll_i.size(); i++) {     //Necessitem recorrer aquest ArrayList.
                    Entitat element = ll_i.get(i);        //Cada passada, recorre el ArrayList per obtindre l'element.
                    pw.println(element.toString());      //Aquest element s'escriu dins del fitxer CSV.
                }

                msg("S'han exportat les dades correctament a " + file.getName(), "");

            } else {
                msg("Has cancelat l'exportacio", "");
            }

            //Control d'excepcions
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

    /**
     * //Metode per poder exportar dades d'un ArrayList a un fitxer CSV
     *
     * @param
     */
    public void exportInc() {
        File file = null;       //Creem la variable de tipus File.
        PrintWriter pw = null;  //Inicialitzem el PrintWriter

        //Control d'excepcions
        try {

            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Exporta dades a un fitxer .CSV");
            chooser.setAcceptAllFileFilterUsed(false);

            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {

                file = new File(chooser.getSelectedFile() + ""); //Assignacio de nom al nostre fitxer. (filename canviat)
                pw = new PrintWriter(file);//Indiquem que el PrintWriter utilitzi el nostre arxiu,

                ArrayList<Incidencia> ll_i = LlistaIncidencies.llistaIncidencia; //Instanciem el ArrayList de Categories.
                for (int i = 0; i < ll_i.size(); i++) {     //Necessitem recorrer aquest ArrayList.
                    Incidencia element = ll_i.get(i);        //Cada passada, recorre el ArrayList per obtindre l'element.

//                    LlistaIncidencies.llistaIncidencia.get(i).getId();
//                    LlistaIncidencies.llistaIncidencia.get(i).getTopic();
//                    LlistaIncidencies.llistaIncidencia.get(i).getDescription();
//                    LlistaIncidencies.llistaIncidencia.get(i).getCategory().toString();
//                    LlistaIncidencies.llistaIncidencia.get(i).getUser();
//                    LlistaIncidencies.llistaIncidencia.get(i).getEntity().toString();
//                    LlistaIncidencies.llistaIncidencia.get(i).getStatus();
                    pw.println(element.toStringObject());      //Aquest element s'escriu dins del fitxer CSV.
                }

                msg("S'han exportat les dades correctament a " + file.getName(), "");

            } else {
                msg("Has cancelat l'exportacio", "");
            }

            //Control d'excepcions
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

    /**
     * //Metode per poder importar dades d'un CSV a un ArrayList
     *
     * @param route
     */
    public static void importarCategoria(String route) {
        String csvFile = route;     //String per guardar la ruta del arxiu que li passarem a aquest metode.
        BufferedReader br = null;   //Inicialitzem el BufferedReader.
        String line = "";           //Inicialitzem una linea
        String csvSplitBy = ";";    //Inicialitzem un separador.
        Date date = new Date();     //Inicialitzem Date.

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] tag = line.split(csvSplitBy);
                String nom = tag[1];
                String desc = tag[2];

                LlistaCategories.llistaCategoria.add(new Categoria(nom, desc));

            }

        } catch (Error | IOException e) {

            //Missatges d'informacio
            msg("Revisa el format del CSV, es incorrecte!", "ALERTA!");
        }

    }

    /**
     * //Metode per poder importar dades d'un CSV a un ArrayList
     *
     * @param route
     */
    public static void importarEntitat(String route) {
        String csvFile = route;     //String per guardar la ruta del arxiu que li passarem a aquest metode.
        BufferedReader br = null;   //Inicialitzem el BufferedReader.
        String line = "";           //Inicialitzem una linea
        String csvSplitBy = ";";    //Inicialitzem un separador.
        Date date = new Date();     //Inicialitzem Date.

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] ent = line.split(csvSplitBy);
                String name = ent[1];
                String code = ent[2];
                String contact = ent[3];

                LlistaEntitats.llistaEntitat.add(new Entitat(name, code, contact));

            }

        } catch (Error | IOException e) {
            //Missatges d'informacio
            msg("Revisa el format del CSV, es incorrecte!", "ALERTA!");
        }

    }

    /**
     * //Metode per poder importar dades d'un CSV a un ArrayList
     *
     * @param route
     */
    public static void importarIncidencia(String route) {
        String csvFile = route;     //String per guardar la ruta del arxiu que li passarem a aquest metode.
        BufferedReader br = null;   //Inicialitzem el BufferedReader.
        String line = "";           //Inicialitzem una linea
        String csvSplitBy = ";";    //Inicialitzem un separador.
        Date date = new Date();     //Inicialitzem Date.

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                int id = 0;

                String incidencia = line.substring(line.indexOf("{") + 1, line.indexOf("Categoria{") - 1);

                String tipusEntitat = "";
                if (line.contains("Institut{")) {
                    tipusEntitat = "Institut{";
                } else if (line.contains("Empresa{")) {
                    tipusEntitat = "Empresa{";
                }

                String categoria = line.substring(line.indexOf("Categoria{") + 10, line.indexOf(tipusEntitat) - 2);
                String entitat = line.substring(line.indexOf(tipusEntitat) + tipusEntitat.length(), line.length() - 2);

                String[] split_categoria = categoria.split(csvSplitBy);
                Categoria c = new Categoria(split_categoria[1], split_categoria[2]);

                String[] split_entitat = entitat.split(csvSplitBy);
                Institut temp_i = null;
                Empresa temp_e = null;
                Entitat temp_entitat = null;
                if ("Institut{".equals(tipusEntitat)) {
                    temp_i = new Institut(split_entitat[1], split_entitat[2], split_entitat[3]);
                    temp_entitat = temp_i;
                    Moduls.ModulAlta.AltaInstitut(LlistaEntitats.llistaEntitat, split_entitat[1], split_entitat[2], split_entitat[3]);
                }else if ("Empresa{".equals(tipusEntitat)) {
                    temp_e = new Empresa(split_entitat[1], split_entitat[2], split_entitat[3]);
                    temp_entitat = temp_e;
                    Moduls.ModulAlta.AltaEmpresa(LlistaEntitats.llistaEntitat, split_entitat[1], split_entitat[2], split_entitat[3]);
                }

                String[] split_incidencia = incidencia.split(csvSplitBy);
                Incidencia i = new Incidencia(split_incidencia[1], split_incidencia[2], c, split_incidencia[3], temp_entitat, split_incidencia[4]);
                LlistaIncidencies.llistaIncidencia.add(i);
                
                id++;
            }

        } catch (Error | IOException e) {
            //Missatges d'informacio
            msg("Revisa el format del CSV, es incorrecte!", "ALERTA!");
        }

    }

}
