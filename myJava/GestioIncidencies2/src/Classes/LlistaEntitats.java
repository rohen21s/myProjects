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
public class LlistaEntitats {
    
    public static ArrayList<Entitat> llistaEntitat = new ArrayList<Entitat>();
    
    
    //Objectes de Tipus Entitat
    public static void insereixEnt() {

        //Afegim varies Entitats per al nostre ArrayList  
        llistaEntitat.add(new Institut("IESMontsia", "12341234N", "info@iesmontsia.com"));
        llistaEntitat.add(new Empresa("Deltahost", "43211234N", "info@deltahost.com"));
        llistaEntitat.add(new Empresa("DCAA", "32231441F", "info@dcaa.com"));

    }
    
    public static Entitat LlistarEntitats() {
        Entitat llistaEntitat = null;
        
        Iterator<Entitat> iter = llistaEntitat.iterator();
        while(iter.hasNext()){
            llistaEntitat = iter.next();
        }
        return llistaEntitat;
    }
    
    public static ArrayList<Entitat> returnList() {
        return llistaEntitat;
    }
    
}
