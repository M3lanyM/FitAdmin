/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Ashley Mendoza V
 */
public class Exercise {
    public int id;
    public String description;
    public String name;
    public String type;

    public Exercise() {
        this.id = 0;
        this.description = " ";
        this.name = " ";
        this.type = " ";
    }
    

    public Exercise(int id, String description, String name, String type) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
