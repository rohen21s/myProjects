/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Iterator;

/**
 *
 * @author alumne
 */
public class Entitat {
    
    /* Atributs */
    private int id;
    private String name;
    private String code;
    private String contact;
    private String status;
    
    public static int numeroEntitats = 0;
    public static int nextId;
    
    /* Constructor */
    public Entitat(String name, String code, String contact) {
        
        numeroEntitats++;
        this.name = name;
        this.code = code;
        this.contact = contact;
        this.status = "Alta";
        this.id = nextId;
        nextId++;
    }
    
    /* Getters */
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getContact() {
        return contact;
    }

    public String getStatus() {
        return status;
    }
    
    /* Setters */
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    /* Mètodes */
    Iterator<Entitat> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    /**
     *
     * @param
     */
    @Override
    public String toString() {
        
        if (this instanceof Institut) {
            return ("Institut{"+this.getId()
                + ";" + this.getName()
                + ";" + this.getCode()
                + ";" + this.getContact()+"}");
        }else{
            return ("Empresa{"+this.getId()
                + ";" + this.getName()
                + ";" + this.getCode()
                + ";" + this.getContact()+"}");
        
        }
        
        
    }
}
