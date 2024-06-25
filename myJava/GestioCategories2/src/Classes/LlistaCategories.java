package Classes;

import java.util.*;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class LlistaCategories {
    
        //Inicialitzem el ArrayList d'objectes de tiups Categoria. I tambe el iterator    
        public static ArrayList<Categoria> ArrayTags = new ArrayList<Categoria>();
        Iterator<Categoria> iter = ArrayTags.iterator();
        
        
        
        
        
        public static void init() {
        
        //Afegim varies Categories per al nostre ArrayList  
        ArrayTags.add(new Categoria("Institut", "Cicles formatius de grau mitja i superior"));
        ArrayTags.add(new Categoria("Empresa", "Empresa distribuidora de quimics."));
        ArrayTags.add(new Categoria("Empresa", "Venda de productes informatics"));
        
        }
       
        
        //Metode per buscar una posicio del ArrayList
        public int find_id(int id) {

        ListIterator iter = ArrayTags.listIterator();
        while (iter.hasNext()) {
            int i = iter.nextIndex();

            if (ArrayTags.get(i).getId_tag()== id) {
                return i;
            }
            iter.next();
        }
        return -1;
        }
        
        
        
        //Metode per retornar el ArrayList amb dades.
        public ArrayList<Categoria> returnList() {
            return ArrayTags;
        }        
        
}
