package day0514;
import java.util.Scanner;

public class SchoolUI {
    
    private HumanManager hm = new HumanManager();
    private Scanner sc = new Scanner(System.in);

    public void printMainMenu(){
        System.out.println("================");
        System.out.println("employee management prog");
        System.out.println("================");
        System.out.println("1. register");
        System.out.println("2. print information");
        System.out.println("0. exit program");
        System.out.print("Select menu: ");
    }

    public void printInsertMenu(){
        System.out.println("================");
        System.out.println("register menu");
        System.out.println("================");
        System.out.println("1. insert info");
        System.out.println("0. back to beginning");
        System.out.print("Select menu: ");
    }

    public void insertHuman(){
        System.out.println("================");
        System.out.println("insert info");
        System.out.println("================");
        System.out.println();

        System.out.print("name: " );
        String name = sc.next();
        System.out.print("age: ");
        int age = sc.nextInt();

        hm.insertHuman(name, age);
        System.out.println("register complete!");
    }

    public void insert(){
        int choice = 0;
        
        while(true){
            printInsertMenu();
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    insertHuman();
                    break;
            }
        }

    }

    public void exe(){
        int choice = 0;
        while(true){
            printMainMenu();
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    insert();

            }
        }
    }

}