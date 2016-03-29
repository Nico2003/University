package com.company;

/**
 * Created by Koljan on 2016.03.29..
 */
public class Student extends Person {

    private double averageMark;

    public Student(){

    };

    public Student(double averageMark){
        this.averageMark = averageMark;
    }

    public Student(String name, String lastname, int age, int id, double averageMark) {
        super(name, lastname, age, id);
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString(){

        return super.toString() + "Average mark:" + this.averageMark;

    }

}
