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
public class Categoria {
    /* Atributs */
    private int id;
    private String name;
    private String description;
    private String status;
    
    public static int numeroCategories = 0;
    public static int nextId;
    
    
    /* Constructor */
    public Categoria(String name, String description) {
        numeroCategories++;
        
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.status = "Alta";
        nextId++;
    }
    
    /* Getters */
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public String getStatus() {
        return this.status;
    }
    public int getNumeroCategories() {
        return numeroCategories;
    }
    
    /* Setters */
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    /* Mètodes */
     Iterator<Categoria> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     
    
     
     
     /**
     *
     * @param
     */
     
    
    @Override
    public String toString() {
        return ("Categoria{"+this.getId()+ ";"
                + this.getName()
                + ";" + this.getDescription()+"}");
    }
    
}
