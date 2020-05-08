package day0508;

import java.util.*;

public class CalcMain {

    public static void main(String[] args){
        Calc c = new Calc();
        
        System.out.println("Calculator prog");

        while(true){
            c.printMenu();
            Scanner input = new Scanner(System.in);
            int select = input.nextInt();

            int n1, n2 = 0;

            switch(select){
                case 1:
                    System.out.println("1. addition");
                    System.out.println("input two integers");
                    n1 = input.nextInt(); n2 = input.nextInt();
                    System.out.println(c.sum(n1, n2));
                    break;
                case 2:
                    System.out.println("2. substraction");
                    System.out.println("input two integers");
                    n1 = input.nextInt(); n2 = input.nextInt();
                    System.out.println(c.minus(n1, n2));
                    break;
                case 3:
                    System.out.println("3. multiplication");
                    System.out.println("input two integers");
                    n1 = input.nextInt(); n2 = input.nextInt();
                    System.out.println(c.multiply(n1, n2));
                    break;
                case 4:
                    System.out.println("4. division");
                    System.out.println("input two integers");
                    n1 = input.nextInt(); n2 = input.nextInt();
                    System.out.println(c.dividing(n1, n2));
                    break;
                case 0:
                    System.out.println("Exit the program");
                    input.close();
                    return;
                default:
                    System.out.println("please choose between 1 to 4");
                    break;
            }
        }
    }
}