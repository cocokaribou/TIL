package day0519.HW;

import java.util.Scanner;

public class SchoolUI {
    SchoolManager sm = new SchoolManager();
    Scanner input = new Scanner(System.in);


    public void printMainMenu(){
        System.out.println("=====================");
        System.out.println("|| 직원 관리 시스템 ||");
        System.out.println("=====================");
        System.out.println("1. 등록");
        System.out.println("2. 찾기");
        System.out.println("3. 삭제");
        System.out.println("4. 전체 출력");
        System.out.println("0. 종료");
        System.out.println("=====================");
        System.out.print("메뉴선택 => ");
    }

    public void printInsertHumanMenu(){
        System.out.println("=====================");
        System.out.println("||     등록 메뉴    ||");
        System.out.println("=====================");
        System.out.println("1. 학생");
        System.out.println("2. 직원");
        System.out.println("3. 교수");
        System.out.println("0. 상위메뉴");
        System.out.println("=====================");
        System.out.print("메뉴선택 => ");
    }

    public void printAll(){
        sm.printAll();
    }

    public boolean insertStudent(){
        System.out.println("=====================");
        System.out.println("||     학생 등록    ||");
        System.out.println("=====================");
        System.out.print("이름 : ");
        String name = input.next();
        System.out.print("나이 : ");
        int age = input.nextInt();
        System.out.print("주민번호 : ");
        String sn = input.next();
        System.out.print("학번 : ");
        String ssn = input.next();

        Student s = new Student(sn, name, age, ssn);

        return sm.insertHuman(s);

        //Student object s is upcasted to Human h
        //By upcasting, Student(subclass) field is also stored in Human(superclass) type array.
        //these fields will appear later when the object is downcasted.

    }

    public boolean insertStaff(){
        System.out.println("=====================");
        System.out.println("||     직원 등록    ||");
        System.out.println("=====================");
        System.out.print("이름 : ");
        String name = input.next();
        System.out.print("나이 : ");
        int age = input.nextInt();
        System.out.print("주민번호 : ");
        String sn = input.next();
        System.out.print("부서 : ");
        String field = input.next();

        Staff st = new Staff(sn, name, age, field);

        return sm.insertHuman(st);
    }

    public boolean insertProfessor(){
        System.out.println("=====================");
        System.out.println("||     교수 등록    ||");
        System.out.println("=====================");
        System.out.print("이름 : ");
        String name = input.next();
        System.out.print("나이 : ");
        int age = input.nextInt();
        System.out.print("주민번호 : ");
        String sn = input.next();
        System.out.print("전공 : ");
        String major = input.next();

        Professor p = new Professor(sn, name, age, major);

        return sm.insertHuman(p);
    }

    public void insertHuman(){
        while(true){
            printInsertHumanMenu();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    if(insertStudent()) System.out.println("정상등록 완료");
                    else System.out.println("등록 오류(이미 존재하는 주민번호 혹은 학번)");
                    break;
                case 2:
                    if(insertStaff()) System.out.println("정상등록 완료");
                    else System.out.println("등록 오류(이미 존재하는 주민번호)");
                    break;
                case 3:
                    if(insertProfessor()) System.out.println("정상등록 완료");
                    else System.out.println("등록 오류(이미 존재하는 주민번호)");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 입력");
            }
        }
    }

    public boolean deleteHuman(){
        System.out.println("=====================");
        System.out.println("||     정보 삭제    ||");
        System.out.println("=====================");
        System.out.print("주민번호 입력: ");

        String sn = input.next();

        if(sm.findHuman(sn) == null) return false;

        //if matching object is found
        //call deleteHuman();
        else{
            Human h = sm.findHuman(sn);
            return sm.deleteHuman(h);
        }
    }

    public Human findHuman(){
        System.out.println("=====================");
        System.out.println("||     정보 찾기    ||");
        System.out.println("=====================");
        System.out.print("주민번호 입력: ");
        
        String sn = input.next();
        Human temp = sm.findHuman(sn);

        System.out.println();
        if(sm.findHuman(sn) != null){
            int index = sm.returnIndex(temp);
            System.out.print("no."+index+" ");
        }
        if(temp instanceof Student) System.out.println("학생");
        if(temp instanceof Staff) System.out.println("스태프");
        if(temp instanceof Professor) System.out.println("교수");
        return sm.findHuman(sn);
    }

    public void exec(){
        while(true){
            printMainMenu();
            int choice = input.nextInt();

            switch(choice){
                case 1:
                    insertHuman();
                    break;
                case 2:
                    Human temp = findHuman();
                    if(temp != null) temp.print();
                    else System.out.println("일치하는 정보 없음");
                    break;
                case 3:
                    if(deleteHuman()){
                        System.out.println("삭제 성공");
                    }else
                        System.out.println("삭제 실패");
                    break;
                case 4:
                    printAll();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
        }
    }
}