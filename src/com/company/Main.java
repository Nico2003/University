package com.company;
/**
 * Created by Koljan on 2016.03.29..
 */
public class Main {

    public static void main(String[] args) {

        CollageStudent collagestudent = new CollageStudent("Janis", "Berzins", 21, 0001, 5.5, "System Analyst");
        CollageStudent collagestudent1 = new CollageStudent("Anna", "Lapa", 20, 0002, 7.7, "Tur agent");
        CollageStudent collagestudent2 = new CollageStudent("Janis", "Berzins", 23, 0003, 8.4, "Business Management");
        CollageStudent collagestudent3 = new CollageStudent("Ivars", "Cikuls", 23, 0003, 8.4, "Builder");
        Teacher teacher = new Teacher("Aija", "Panova", 42, 1001, "Geographer", 53, 8.9, 1400);
        Teacher teacher1 = new Teacher("Inga", "Ziedite", 39, 1002, "Geographer", 53, 8.9, 1300);


        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(collagestudent);

        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(collagestudent1);

        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(collagestudent2);

        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(collagestudent3);

        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(teacher);

        System.out.println("---------------------------------------------------------");
        System.out.println("Person: ");
        System.out.println(teacher1);


    }
}
