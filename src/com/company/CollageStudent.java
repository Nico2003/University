package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class CollageStudent extends Student{

    private String specialization;

    public CollageStudent(){};

    public CollageStudent(String specialization) {
        this.specialization = specialization;
    }

    public CollageStudent(double averageMark, String specialization) {
        super(averageMark);
        this.specialization = specialization;
    }

    public CollageStudent(String name, String lastname, int age, int id, double avetageMark, String specialization){
        super(name, lastname, age, id, avetageMark);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString(){

        return "Student\n" + super.toString() + "\n" + "Student specialization: " + this.specialization;

    }

}
