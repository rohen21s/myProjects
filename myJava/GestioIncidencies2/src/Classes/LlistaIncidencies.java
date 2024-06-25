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
public class LlistaIncidencies {
    public static ArrayList<Incidencia> llistaIncidencia = new ArrayList<Incidencia>(10);
       
    
    //Objectes de Tipus Incidencia
    public static void insereixInc() {

        //Afegim varies Incidencies per al nostre ArrayList  
        llistaIncidencia.add(new Incidencia("El monitor no funciona", "Canviar el monitor", LlistaCategories.llistaCategoria.get(0), "Jaimito", LlistaEntitats.llistaEntitat.get(0)));
        llistaIncidencia.add(new Incidencia("Falla la RAM", "Canviar una que falla", LlistaCategories.llistaCategoria.get(1), "Pepito", LlistaEntitats.llistaEntitat.get(1)));
        llistaIncidencia.add(new Incidencia("Falten components", "Aactualitzar els drivers", LlistaCategories.llistaCategoria.get(2), "Pedrito", LlistaEntitats.llistaEntitat.get(2)));

    }
    
        public static Incidencia LlistarIncidencies(){
            Incidencia llistaIncidencia = null;
            
            Iterator<Incidencia> iter = llistaIncidencia.iterator();
            while (iter.hasNext()){
                llistaIncidencia = iter.next();
            }
            return llistaIncidencia;
        }
        
        public static ArrayList<Incidencia> returnList() {
            return llistaIncidencia;
    }  
}
