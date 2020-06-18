package ui;

import java.util.Scanner;
import vo.Person;
import dao.PersonDAO;
import java.util.ArrayList;

public class UI{
    
    Scanner sc = new Scanner(System.in);
    PersonDAO dao = new PersonDAO();

    //default constructor
    //생성자로 필드 초기화가 아니라 로직을 적는다
    public UI(){

        while(true){
            printMainMenu();
            int choice = sc.nextInt();
            sc.nextLine(); //scanner에 남아있는 /n을 뽑아낸다
    
            switch(choice){
                case 1:
                    insertMenu();
                    break;

                case 2:
                    selectMenu();
                    break;
                case 3:
                    updateMenu();
                    break;
                case 4:
                    deleteMenu();
                    break;
                case 5:
                    searchPersonMenu();
                    break;
                case 6:
                    searchPersonByNameMenu();
                    break;
                case 0:
                    return;
            }
        }
    }
    
    public void printMainMenu(){
        System.out.println("-------------------------");
        System.out.println("1. 등록");
        System.out.println("2. 전체조회");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 이름 검색(완전일치)");
        System.out.println("6. 이름 검색(부분일치)");
        System.out.println("0. 종료");
        System.out.println("-------------------------");
        System.out.print("선택: ");
    }
    
    public void insertMenu(){    
        System.out.println("등록 선택");
        System.out.print("이름: ");
        String name = sc.nextLine();
            System.out.print("나이: ");
            int age = sc.nextInt();
            
            Person person = new Person(name, age);
            int result = dao.insertPerson(person);
            if(result == 1)System.out.println("등록 성공!");
            else System.out.println("등록 실패!");    
        }

    public void selectMenu(){
        System.out.println("전체조회 선택");
        ArrayList<Person> person = dao.selectPerson();


        if (person.size() == 0) System.out.println("\n저장된 데이터 없음!");
        else {
            System.out.println("\s번호\s\s이름\s\s나이\s");
            System.out.println("-----------------------");
            for(Person temp:person)
                System.out.println(temp);}
    }

    public void updateMenu(){
        System.out.println("수정 선택");
        System.out.print("수정할 번호 선택: ");
        int num = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> list = dao.searchPersonByNum(num);

        if(list.size() != 0){
            System.out.println("\s번호\s\s이름\s\s나이\s");
            System.out.println("-----------------------");
            System.out.println(list.get(0));;
            System.out.println("-----------------------");

            System.out.print("새로운 이름: ");
            String name = sc.nextLine();
            System.out.print("새로운 나이: ");
            int age = sc.nextInt();
    
            Person person = new Person(num, name, age);
            int result = dao.updatePerson(person);
            if (result == 1) System.out.println("수정 성공!");
            else System.out.println("수정 실패!");
        }else System.out.println("\n일치하는 데이터 없음");

    }

    public void deleteMenu(){
        System.out.println("삭제 선택");
        System.out.print("삭제할 번호: ");
        int num = sc.nextInt();
        ArrayList<Person> list = dao.searchPersonByNum(num);

        if(list.size() != 0){
            Person person = new Person(num);
            int result = dao.deletePerson(person);
            if (result == 1) System.out.println("삭제 성공!");
            else System.out.println("삭제 실패!");
        }else System.out.println("\n일치하는 데이터 없음");

    }

    public void searchPersonMenu(){
        System.out.println("이름 검색(완전일치) 선택");
        System.out.print("검색어: ");
        String name = sc.nextLine();
        ArrayList<Person> result = dao.searchPerson(name);
        if(result.size() == 0){
            System.out.println("일치하는 정보 없음!");
            return;
        }
        
        System.out.println("\s번호\s\s이름\s\s나이\s");
        System.out.println("-----------------------");
        for(Person temp: result)
            System.out.println(temp);
    }

    public void searchPersonByNameMenu(){
        System.out.println("이름 검색(부분일치) 선택");
        System.out.print("검색어: ");
        String name = sc.nextLine();
        ArrayList<Person> result = dao.searchPersonByName(name);
        if(result.size() == 0){
            System.out.println("일치하는 정보 없음!");
            return;
        }

        System.out.println("\s번호\s\s이름\s\s나이\s");
        System.out.println("-----------------------");
        for(Person temp: result)
            System.out.println(temp);
    }

}