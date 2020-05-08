package day0508;

import java.util.*;

public class CalcMain {
    public static void main(String[] args){
        Calc c = new Calc();

        while(true){

            System.out.println("Calculator prog");

            c.printMenu();
            Scanner input = new Scanner(System.in);
            
            int select = input.nextInt();
            if (select == 0) {System.out.println("Exit the prog"); input.close(); return;}

            int[] arr = c.calcInput();
            int n1 = arr[0];
            int n2 = arr[1];                

            switch(select){
                case 1:
                    c.sum(n1, n2);
                    break;
                case 2:
                    c.minus(n1, n2);
                    break;
                case 3:
                    c.multiply(n1, n2);
                    break;
                case 4:
                    c.dividing(n1, n2);
                    break;
            }
        }
    }
}