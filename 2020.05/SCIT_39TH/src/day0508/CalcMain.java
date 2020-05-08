package day0508;

import java.util.*;

public class CalcMain {

    public static void main(String[] args){
        Calc c = new Calc();
        int n1 = 0, n2 = 0;

        System.out.println("Calculator prog");

        while(true){
            c.printMenu();
            Scanner input = new Scanner(System.in);
            
            int select = input.nextInt();

            if ( select != 0){
                c.printSelection(select);
                n1 = input.nextInt();
                n2 = input.nextInt();
            }

            switch(select){
                case 1:
                    System.out.println(c.sum(n1, n2));
                    break;
                case 2:
                    System.out.println(c.minus(n1, n2));
                    break;
                case 3:
                    System.out.println(c.multiply(n1, n2));
                    break;
                case 4:
                    System.out.println(c.dividing(n1, n2));
                    break;
                case 0:
                    System.out.println("Exit the prog");
                    input.close();
                    return;
            }
        }
    }
}