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
public class ModulModificacio {
    public static void modificarEmpresa(int id, String name, String code, String contact, String status){
        
        String oldName = "";
        String oldCode = "";
        String oldContact = "";
        
        oldName = LlistaEntitats.llistaEntitat.get(id).getName();
        oldCode = LlistaEntitats.llistaEntitat.get(id).getCode();
        oldContact = LlistaEntitats.llistaEntitat.get(id).getContact();
        
        LlistaEntitats.llistaEntitat.get(id).setName(name);
        LlistaEntitats.llistaEntitat.get(id).setCode(code);
        LlistaEntitats.llistaEntitat.get(id).setContact(contact);
        LlistaEntitats.llistaEntitat.get(id).setStatus(status);
        Aux.Filelog.entModifyLog(oldName, name, oldCode, code, oldContact, contact);
        Dialog.dialog("La empresa s'ha modificat correctament");
    }
    
    public static void modificarInstitut(int id, String name, String code, String contact, String status){
        
        String oldName = "";
        String oldCode = "";
        String oldContact = "";
        
        oldName = LlistaEntitats.llistaEntitat.get(id).getName();
        oldCode = LlistaEntitats.llistaEntitat.get(id).getCode();
        oldContact = LlistaEntitats.llistaEntitat.get(id).getContact();
        
        LlistaEntitats.llistaEntitat.get(id).setName(name);
        LlistaEntitats.llistaEntitat.get(id).setCode(code);
        LlistaEntitats.llistaEntitat.get(id).setContact(contact);
        LlistaEntitats.llistaEntitat.get(id).setStatus(status);
        Aux.Filelog.insModifyLog(oldName, name, oldCode, code, oldContact, contact);
        Dialog.dialog("La'institut s'ha modificat correctament");
    }
    
    public static void modificarCategoria(int id, String name, String description, String status){
        
        String oldName = "";
        String oldDesc = "";
        
        oldName = LlistaCategories.llistaCategoria.get(id).getName();
        oldDesc = LlistaCategories.llistaCategoria.get(id).getDescription();
        
        LlistaCategories.llistaCategoria.get(id).setName(name);
        LlistaCategories.llistaCategoria.get(id).setDescription(description);
        LlistaCategories.llistaCategoria.get(id).setStatus(status);
        Aux.Filelog.catModifyLog(oldName, name, oldDesc, description);
        Dialog.dialog("La categoria s'ha modificat correctament");
    }
    
    public static void modificarIncidencia(int id, String topic, String description, Categoria category, String user, Entitat entity, String status){
       
       String oldTopic = "";
       String oldDesc = "";
       Categoria oldCat = new Categoria("", "");
       String oldUser = "";
       Entitat oldEnt = new Entitat("", "", "");
       
        
        
       LlistaIncidencies.llistaIncidencia.get(id).setTopic(topic);
       LlistaIncidencies.llistaIncidencia.get(id).setDescription(description);
       LlistaIncidencies.llistaIncidencia.get(id).setCategory(category);
       LlistaIncidencies.llistaIncidencia.get(id).setUser(user);
       LlistaIncidencies.llistaIncidencia.get(id).setEntity(entity);
       LlistaIncidencies.llistaIncidencia.get(id).setStatus(status);
       Aux.Filelog.incModifyLog(oldTopic, topic, oldDesc, description, oldCat, category, oldUser, user, oldEnt, entity);
       Dialog.dialog("La incidència s'ha modificat correctament");
    }
    
}
