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
public class User {
    public int id;
    public String email;    
    public String lastname;
    public String name;
    public String password;

    public User() {
        this.id = 0;
        this.email = " ";
        this.lastname = " ";
        this.name = " ";
        this.password = " ";
    }

    
    
    public User(int id, String email, String lastname, String name, String password) {
        this.id = id;
        this.email = email;
        this.lastname = lastname;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
