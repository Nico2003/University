package com.company;
public class Person {

    private String name;
    private String lastName;
    private int age;
    private int id;

    public Person(){}

    public Person(String name, String lastname, int age, int id) {
        this.name = name;
        this.lastName = lastname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return  "Name: " + this.name + "\n" + "Last name: " + this.lastName + "\n" + "Age: " + this.age + "\n" + "Persons ID: " + this.id + "\n";
    }
}
