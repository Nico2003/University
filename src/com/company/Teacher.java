package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Teacher  extends Person{

    private String specialization;
    private int numberOfTrainees;
    private double experience;
    private double salary;

    public Teacher(){

    };

    public Teacher(String specialization, int numberOfTrainees, double experience, double salary){
        this.specialization = specialization;
        this.numberOfTrainees = numberOfTrainees;
        this.experience = experience;
        this.salary = salary;
    }



    public Teacher(String name, String lastname, int age, int id, String specialization, int numberOfTrainees, double experience, double salary) {
        super(name, lastname, age, id);
        this.specialization = specialization;
        this.numberOfTrainees = numberOfTrainees;
        this.experience = experience;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getNumberOfTrainees() {
        return numberOfTrainees;
    }

    public void setNumberOfTrainees(int numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){

        return "Teacher\n" + super.toString() + "Specialization: " + this.specialization + "\n" + "Number of Students: " + this.numberOfTrainees  + "\n" + "Experience: " + this.experience  + "\n" + "Salary: "+ this.salary + "\n";
    }


}