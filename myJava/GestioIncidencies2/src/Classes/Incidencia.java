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
public class Incidencia {

    /* Atributs */
    private int id;
    private String topic;
    private String description;
    private Categoria category;
    private String user;
    private Entitat entity;
    private String status;

    public static int numeroIncidencies = 0;
    public static int nextId;

    public Incidencia(String topic, String description, Categoria category, String user, Entitat entity, String status) {
        numeroIncidencies++;
        this.topic = topic;
        this.description = description;
        this.category = category;
        this.user = user;
        this.entity = entity;
        this.status = status;

        this.id = nextId;
        nextId++;
    }

    /* Constructor */
    public Incidencia(String topic, String description, Categoria category, String user, Entitat entity) {
        numeroIncidencies++;
        this.topic = topic;
        this.description = description;
        this.category = category;
        this.user = user;
        this.entity = entity;
        this.status = "Alta";

        this.id = nextId;
        nextId++;
    }

    /* Getters */
    public int getId() {
        return this.id;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getDescription() {
        return this.description;
    }

    public Categoria getCategory() {
        return this.category;
    }

    public String getUser() {
        return this.user;
    }

    public Entitat getEntity() {
        return this.entity;
    }

    public String getStatus() {
        return this.status;
    }

    public int getNumeroIncidencies() {
        return numeroIncidencies;
    }

    /* Setters */
    public void setId(int id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setEntity(Entitat entity) {
        this.entity = entity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /* Mètodes */
    Iterator<Incidencia> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toStringObject() {
        return "Incidencia{" + this.getId() + ";" + this.getTopic() + ";" + this.getDescription() + ";" + this.getUser() + ";" + this.getStatus() + ";" + this.getCategory() + ";" + this.getEntity() + "}";
    }

    /**
     *
     * @param
     */
    public String toStringCSV() {
        return (this.getId()
                + ";" + this.getTopic()
                + ";" + this.getDescription()
                + ";" + this.getCategory().toString()
                //+ ";" + this.getUser()
                + ";" + this.getEntity().toString());
    }

}
