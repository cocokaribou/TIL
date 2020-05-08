package day0508;

public class Calc {

    public int sum (int num1, int num2){
        int i = num1 + num2;
        return i;
    }

    public int minus (int num1, int num2){
        int i = num1 - num2;
        return i;
    }

    public int multiply (int num1, int num2){
        int i = num1 * num2;
        return i;
    }

    public int dividing (int num1, int num2){
        double i = num1 / num2;
        return (int)i;
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

    public void printSelection(int num){
        if (num==0) return;
        else if (num==1) System.out.println("1. addition \ninput two integers");
        else if (num==2) System.out.println("2. substraction \ninput two integers");
        else if (num==3) System.out.println("3. multiplication \ninput two integers");
        else if (num==4) System.out.println("4. division \ninput two integers");
        else return;
    }


}