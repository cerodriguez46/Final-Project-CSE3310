package com.example.duynguyen.sample.model;

public class User {
    private String name;
    private String pass;
    private String id;

    public User(String name, String pass, String id) {
        this.name = name;
        this.pass = pass;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}