package day0515;
import java.util.*;

public class HumanManager {
    private Student[] array = new Student[100];
    private int count = 0;

    public void insertStudent(String name, int age, int stNum){
        for(int i=0; i<array.length; i++){
            Student st = new Student(name, age, stNum);
            array[count++] = st;
        }
    }

    public void showAll(){
        for (int i=0; i<count; i++){
            array[i].showInfo();
        }
    }


    public void exe(){
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        switch(select){
            case 1:
                
        }
    }
}