package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CarManager mngr = new CarManager();

        while(true){
            System.out.println("=====================");
            System.out.println("1. Register");
            System.out.println("2. Search Car Info");
            System.out.println("3. Print Car Info");
            System.out.println("4. Exit Program");
            System.out.println("=====================");

            int select = input.nextInt();

            switch(select){
                case 1:
                    System.out.println("Register");
                    System.out.print("input NAME : ");
                    String name = input.next();
                    System.out.print("input CAR NUMBER : ");
                    String car_number = input.next();
                    System.out.print("input CONTACT INFO : ");
                    String contact_num = input.next();
                    System.out.print("input LOCATION : ");
                    String location = input.next();

                    mngr.register(name, car_number, contact_num, location);
                    System.out.println();
                    System.out.println("registered!");
                    break;
                case 2:
                    System.out.println("Search Car Info");
                    if (mngr.tellIfNull() != false){
                        System.out.print("input CONTACT INFO of the car you're searching for : ");
                        String number = input.next();
                        mngr.infoQuery(number); 
                        break;}
                    else{
                        System.out.println();
                        System.out.println("no car info has been registered yet!");                    
                        break;}
                case 3:
                    System.out.println("Print Car Info");
                    mngr.printInfo();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Exit Program");
                    input.close();
                    return;
            }
            
        }
        
    }
}