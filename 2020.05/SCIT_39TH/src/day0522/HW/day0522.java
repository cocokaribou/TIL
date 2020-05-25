package day0522.HW;

import java.util.Scanner;

public class day0522 {
    public static void main(String[] args) {

        Object obj = new Object(); //superclass
        Car c = new Car();  //extends Object class
        FireEngine fe = new FireEngine(); //extends Car class

//instanceof Operator
        System.out.println(obj instanceof Object); //t
        System.out.println(obj instanceof Car); //f
        System.out.println(obj instanceof FireEngine); //f

        System.out.println(c instanceof Object); //t
        System.out.println(c instanceof Car); //t
        System.out.println(c instanceof FireEngine); //f

        System.out.println(fe instanceof Object); //t
        System.out.println(fe instanceof Car); //t 
        System.out.println(fe instanceof FireEngine); //t




    }    

}