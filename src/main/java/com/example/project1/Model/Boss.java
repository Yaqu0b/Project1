package com.example.project1.Model;

public class Boss {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boss(){}

    public Boss(int id, String name, int age){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
