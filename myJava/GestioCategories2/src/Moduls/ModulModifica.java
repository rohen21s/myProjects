package Moduls;

import Classes.*;
import java.util.*;
import javax.swing.*;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class ModulModifica {//Modul amb un metode per modificar Categories. A mes guardar canvis en el log.
    
   
    /**
     *
     * @param id int
     * @param name String
     * @param desc String
     */
    public static void ModificaCategoria(int id, String name, String desc) {
                    
        //Variables auxiliars per emmagatzemar informacio anterior a la modificacio. PER ALS LOGS
        String oldName = "";
        String oldDesc = "";

        if (LlistaCategories.ArrayTags.contains(name)) {
            JOptionPane.showMessageDialog(new JFrame(), "Alguna de les dades que has introduït ja esta registrada.");
        } else {

            //PER ALS LOGS
            oldName = LlistaCategories.ArrayTags.get(id).getName();
            oldDesc = LlistaCategories.ArrayTags.get(id).getDesc();

            //Modificacio de dades
            LlistaCategories.ArrayTags.get(id).setName(name);
            LlistaCategories.ArrayTags.get(id).setDesc(desc);

            //Escriptura dins del LOG
            Filelog.modificationLog(oldName, name, oldDesc, desc);
        }
        
    }
    
}
