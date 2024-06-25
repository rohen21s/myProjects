/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moduls;

import Classes.*;
import Aux.*;

/**
 *
 * @author alumne
 */
public class ModulBaixa {
    
    public static String status = "Baixa";
    
    public static void baixaEmpresa(int id) {
        LlistaEntitats.llistaEntitat.get(id).setStatus(status);
        Aux.Filelog.entAddDeleteLog(LlistaEntitats.llistaEntitat.get(id).getName(), 1);
        Dialog.dialog("La empresa s'ha donat de baixa.");
    }
    
    public static void baixaInstitut(int id) {
        LlistaEntitats.llistaEntitat.get(id).setStatus(status);
        Aux.Filelog.insAddDeleteLog(LlistaEntitats.llistaEntitat.get(id).getName(), 1);
        Dialog.dialog("L'institut s'ha donat de baixa.");
    }
    
    public static void baixaCategoria(int id) {
        LlistaCategories.llistaCategoria.get(id).setStatus(status);
        Aux.Filelog.catAddDeleteLog(LlistaCategories.llistaCategoria.get(id).getName(), 1);
        Dialog.dialog("La categoria s'ha donat de baixa.");
    }
    
    public static void baixaIncidencia(int id) {
        LlistaIncidencies.llistaIncidencia.get(id).setStatus(status);
        Aux.Filelog.incAddDeleteLog(LlistaIncidencies.llistaIncidencia.get(id).getTopic(), 1);
        Dialog.dialog("La insidència s'ha eliminat.");
    }
}
