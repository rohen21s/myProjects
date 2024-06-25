package Classes;

import static Classes.LlistaCategories.*;

/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class Categoria {//Classe principal de Categoria.
    
    
    /***** ATRIBUTS *****/
    private int id_tag;
    private String name;
    private String desc;
    private Object assigned_entity;
    
    private static final int MAX_TAG = 5;
    public static int NUMERO_TAG = 0;
    public static int nextId;
    
    public static int sizeList = ArrayTags.size();

    
    
    
    
    
    /***** CONSTRUCTORS *****/
    public Categoria(String name, String desc) {
        NUMERO_TAG++;
        this.name = name;
        this.desc = desc;
        this.id_tag = nextId;
        nextId++;
    }
    
    public Categoria() {
        NUMERO_TAG++;
        id_tag = nextId;
        nextId++;
    }

    
    
    
    
    
    /***** GETTERS *****/
    public Object getEntity() {
        return assigned_entity;
    }
    
    public int getId_tag() {
        return id_tag;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {    
        return desc;
    }

    public static int getMaxTags() {
        return MAX_TAG;
    }

    public static int getNumeroTags() {
        return NUMERO_TAG;
    }

    public static int getSizeList() {
        return sizeList;
    }
    
    
    
    
    
    
    
    
    

    /***** SETTERS *****/
    public void setId_tag(int id_tag) {
        this.id_tag = id_tag;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setDesc(String desc) {   
        this.desc = desc;
    }

    
    
    
    //Per la elinminacio d'una Empresa Opcio3 de ModulBaixa
    public static void setNumeroTags(int NUMERO_TAG) {
        Categoria.NUMERO_TAG = NUMERO_TAG;
    }

    public static void setNextId(int nextId) {
        Categoria.nextId = nextId;
    }
    

    
    
    /***** toString *****/
    /**
     *
     * @param object de tipus Categoria
     */
    public static String toString(Categoria tag) {
        return (tag.getId_tag()+ " : "
                + tag.getName()
                + " : " + tag.getDesc()
                + " : " + tag.getEntity()).toLowerCase();
    }
    
    /**
     *
     * @param 
     */
    @Override
    public String toString() {
        return (this.getId_tag()+ " : "
                + this.getName()
                + " : " + this.getDesc()
                + " : " + this.getEntity()).toLowerCase();
    }
    
    
    /**
     *
     * @param
     */
    public String toStringCSV() {
        return (this.getId_tag()+ " : "
                + this.getName()
                + " : " + this.getDesc()).toLowerCase();
    }
    
}


