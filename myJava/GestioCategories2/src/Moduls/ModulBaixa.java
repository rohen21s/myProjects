package Moduls;

import Classes.*;
import sun.security.util.Length;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class ModulBaixa {//Modul amb un metode per eliminar Categories. A mes guardar canvis en el log.

    /**
     *
     * @param id int
     * 
     */
    public static void EliminaTags(int id) {
        
        //La eliminacio d'un registre del ArrayTags.
        LlistaCategories.ArrayTags.remove(id);
        //Filelog.addRemoveLog(LlistaCategories.ArrayTags.get(id).getName(), 1);
        
        //Emmagatzemem la informacio de que hem eliminat una Categoria amb aquesta linia de codi.
        Filelog.addRemoveLog2(id, 1);
    }
    
    
}
