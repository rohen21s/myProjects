/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.*;

/**
 *
 * @author alumne
 */
public class LlistaCategories {
    public static ArrayList<Categoria> llistaCategoria = new ArrayList<Categoria>();
    
    //Objectes de Tipus Categoria
    public static void insereixCat() {

        //Afegim varies Categories per al nostre ArrayList  
        llistaCategoria.add(new Categoria("Hardware", "Una peça es defectuosa"));
        llistaCategoria.add(new Categoria("Hardware", "S'ha de canviar la ram"));
        llistaCategoria.add(new Categoria("Software", "Actualitzar els drivers"));

    }
    
    public static Categoria LlistarCategories() {
        Categoria llistaCategoria = null;
        
        Iterator<Categoria> iter = llistaCategoria.iterator();
            while (iter.hasNext()){
                llistaCategoria = iter.next();
            }
            return llistaCategoria;
        }
        
        public static ArrayList<Categoria> returnList() {
            return llistaCategoria;
    }        
}
