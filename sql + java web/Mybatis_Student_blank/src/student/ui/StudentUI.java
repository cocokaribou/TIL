package student.ui;

import java.util.Scanner;
import java.util.ArrayList;

import student.vo.Student;
import student.dao.StudentDAO;

public class StudentUI {
    
    private Scanner sc = new Scanner(System.in);
    private StudentDAO dao = new StudentDAO();

	public StudentUI(){
        while(true){
            printMainMenu();
            int select = sc.nextInt();
            sc.nextLine();

            switch(select){
                case 1:
                    insertMenu();
                    break;
                case 2:
                    selectAllMenu();
                    break;
                case 3:
                    deleteMenu();
                    break;
                case 4:
                    updateMenu();
                    break;
                case 5:
                    searchMenu();
                    break;
                case 0:
                    return;

            }
        }
    }

    public void printMainMenu(){
        System.out.println("[ student examination ]");
        System.out.println("1. input");
        System.out.println("2. print out all info");
        System.out.println("3. delete");
        System.out.println("4. update");
        System.out.println("5. search");
        System.out.println("0. exit");
        System.out.print("choose> ");
    }

    public void insertMenu(){
        System.out.println("---------------------------");
        System.out.println("[ input info ]");
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("korean score: ");
        int kor = sc.nextInt();
        System.out.print("english score: ");
        int eng = sc.nextInt();
        System.out.print("math score: ");
        int mat = sc.nextInt();
        sc.nextLine();

        Student st = new Student(name, kor, eng, mat);
        int result = dao.insertStudent(st);
        if(result == 0) {
            System.out.println("---------------------------");
            System.out.println("* failed in inserting info"); 
            return;
        }
        else {
            System.out.println("---------------------------");
            System.out.println("* info inserted");
        }
    }

    public void selectAllMenu(){
        System.out.println("[ print out all info ]");
        System.out.println("ID    name    kor    eng    math");

        ArrayList<Student> result = dao.selectStudentAll();
        if(result.size() == 0){
            System.out.println("---------------------------");
            System.out.println("* no data is stored.");
            return;
        }
        
        for(Student list:result)
            System.out.println(list);
    }

    public void deleteMenu(){
        Student st = null;
        int result = 0;        

        System.out.println("[ delete info ]");
        System.out.print("input ID you'd like to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        st = dao.searchStudentByID(id);
        if(st == null) {
            System.out.println("---------------------------");
            System.out.println("* no matching ID"); 
            return;}

        result = dao.deleteStudent(id);
        if(result == 0){
            System.out.println("---------------------------");
            System.out.println("* failed in deleting info"); 
            return;}
        else {
            System.out.println("---------------------------");
            System.out.println("* "+result+" row deleted");
        }
    }

    public void updateMenu(){
        Student st = null;
        int result = 0;        

        System.out.println("[ update info ]");
        System.out.print("input ID you'd like to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        st = dao.searchStudentByID(id);
        if(st == null) {
            System.out.println("---------------------------");
            System.out.println("* no matching ID"); 
            return;
        }
            
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("korean score: ");
        int kor = sc.nextInt();
        System.out.print("english score: ");
        int eng = sc.nextInt();
        System.out.print("math score: ");
        int mat = sc.nextInt();
        sc.nextLine();
        
        Student student = new Student(id, name, kor, eng, mat);
            
        result = dao.updateStudent(student);
        if(result == 0){
            System.out.println("---------------------------");
            System.out.println("* failed in updating info"); 
            return;
        }
        else {
            System.out.println("---------------------------");
            System.out.println("* "+result+" row updated");
        }
    }

    public void searchMenu(){
        Student st = null;
        ArrayList<Student> list = null;

        System.out.println("[ search info ]");
        System.out.print("input name you'd like to search: ");
        String name = sc.nextLine();

        list = dao.searchStudent(name);

        if(list.size() == 0){
            System.out.println("---------------------------");
            System.out.println("* no matching name");
            return;
        }
        System.out.println("---------------------------");
        System.out.println("ID  name  kor  eng  math");
        for(Student temp :list){
            System.out.println(temp);

        }   


    }

}
