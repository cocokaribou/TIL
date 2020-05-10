package day0508;

import java.util.*;


public class Calc {
  
    public void sum (int num1, int num2){
        int i = num1 + num2;
        System.out.println(i);
    }

    public void minus (int num1, int num2){
        int i = num1 - num2;
        System.out.println(i);
    }
    
    public void multiply (int num1, int num2){
        int i = num1 * num2;
        System.out.println(i);
    }
    
    public void dividing (int num1, int num2){
        if (num1 <=0 || num2 <= 0) {System.out.println("input value should be above 0"); return;}
        double i = num1 / num2;
        System.out.println((int)i);
    }

    public void printMenu(){
        System.out.println("==================");
        System.out.println("1. addition");
        System.out.println("2. substraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("0. Exit");
        System.out.println("==================");
    }


    //method returns only one value.
    //in order to return two operands from one method
    //return array that stores two operands.

    public int[] calcInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input n1: ");
        int n1 = sc.nextInt();
        System.out.print("input n2: ");
        int n2 = sc.nextInt();
        int[] arr = {n1, n2};
        return arr;
    }


}