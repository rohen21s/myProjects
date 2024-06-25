package Moduls;

import Classes.*;
import java.util.*;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class ModulAlta {//Modul amb un metode per donar d'alta Categories. A mes guardar canvis en el log.
    
   
    /**
     *
     * @param ArrayList<Categoria>
     * @param name String
     * @param desc String
     */
    public static void AltaTags(ArrayList<Categoria> ArrayTags, String name, String desc) {
        
        //Quan passem els parametres dins de la funcio, el que fa, es afegeix un nou registre al ArrayList de ArrayTags:
        ArrayTags.add(new Categoria(name, desc));
        
        //Aquesta linia de codi, ens serveix per emmagatzemar al LOG de que s'ha creat una Categoria.
        Filelog.addRemoveLog(name, 0);
    }
    
    
}
