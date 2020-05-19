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

    public void insertStudent(){
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

        if(sm.insertHuman(s)) System.out.println("정상 등록 완료");
        else System.out.println("등록 오류 (이미 존재하는 주민번호 또는 학번)");
    }

    public void insertStaff(){
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

        if(sm.insertHuman(st)) System.out.println("정상 등록 완료");
        else System.out.println("등록 오류 (이미 존재하는 주민번호)");
    }

    public void insertProfessor(){
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

        if(sm.insertHuman(p)) System.out.println("정상 등록 완료");
        else System.out.println("등록 오류 (이미 존재하는 주민번호)");
    }

    public void insertHuman(){
        while(true){
            printInsertHumanMenu();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    insertStudent();
                    break;
                case 2:
                    insertStaff();
                    break;
                case 3:
                    insertProfessor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 입력");
            }
        }
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
                    System.out.println("아직 준비중입니다");
                    break;
                case 3:
                    System.out.println("아직 준비중입니다");
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