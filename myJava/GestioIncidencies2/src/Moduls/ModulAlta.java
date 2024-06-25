/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import Classes.*;
import java.util.*;
import Aux.*;

/**
 *
 * @author alumne
 */
public class ModulAlta {
    
    public static void AltaEmpresa(ArrayList<Entitat> llistaEntitat, String name, String code, String contact) {
        llistaEntitat.add(new Empresa(name, code, contact));
        Aux.Filelog.entAddDeleteLog(name, 0);
        Dialog.dialog("Empresa inserida correctament");
    }
    
    public static void AltaInstitut(ArrayList<Entitat> llistaEntitat, String name, String code, String contact) {
        llistaEntitat.add(new Institut(name, code, contact));
        Aux.Filelog.insAddDeleteLog(name, 0);
        Dialog.dialog("Institut inserit correctament");
    }
    
    public static void AltaCategoria(ArrayList<Categoria> llistaCategoria, String name, String description) {
        llistaCategoria.add(new Categoria(name, description));
        Aux.Filelog.catAddDeleteLog(name, 0);
        Dialog.dialog("Categoria inserida correctament");
    }
    
    public static void AltaIncidencia(ArrayList<Incidencia> llistaIncidencia, String topic, String descripion, Categoria category, String user, Entitat entity) {
        llistaIncidencia.add(new Incidencia(topic, descripion, category, user, entity));
        Aux.Filelog.incAddDeleteLog(topic, 0);
        Dialog.dialog("Incidència inserida correctament");
    }
}
