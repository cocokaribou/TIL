package day0526.HW;

import java.util.InputMismatchException;
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
        try{
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

        }catch(InputMismatchException e){
            input = new Scanner(System.in);
            System.out.println("숫자를 입력해주세요");
            return false;
        }

        //Student object s is upcasted to Human h
        //By upcasting, Student(subclass) field is also stored in Human(superclass) type array.
        //these fields will appear later when the object is downcasted.

    }



    public boolean insertStaff(){
        try{
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

        }catch(InputMismatchException e){
            System.out.println("숫자를 입력해주세요");
            return false;
        }

    }



    public boolean insertProfessor(){
        try{
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

        }catch(InputMismatchException e){
            System.out.println("숫자를 입력해주세요");
            return false;
        }


    }



    public void insertHuman(){
        int choice = 0;

        while(true){
            printInsertHumanMenu();
            try{
                input = new Scanner(System.in);
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        if(insertStudent()) System.out.println("정상등록 완료");
                        else System.out.println("등록 오류");
                        break;
                    case 2:
                        if(insertStaff()) System.out.println("정상등록 완료");
                        else System.out.println("등록 오류");
                        break;
                    case 3:
                        if(insertProfessor()) System.out.println("정상등록 완료");
                        else System.out.println("등록 오류");
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("잘못된 입력");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요");
                System.out.println();
                input = new Scanner(System.in);
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
        if(temp != null){
            int index = sm.returnIndex(temp);
            System.out.print("no."+index+" ");
        }
        if(temp instanceof Student) System.out.println("학생");
        if(temp instanceof Staff) System.out.println("스태프");
        if(temp instanceof Professor) System.out.println("교수");
        return temp;
    }



    public void exec(){
        Human h = null;
        boolean result = false;

        while(true){
            printMainMenu();
            try{
                int choice = input.nextInt(); //문자가 입력돼서 예외
                                                //Scanner 안에 아직 입력값(문자)이 남아있다
                switch(choice){
                    case 1:
                        insertHuman();
                        break;
                    case 2:
                        h = findHuman();
                        if(h != null) h.print();
                        else System.out.println("일치하는 정보 없음");
                        break;
                    case 3:
                        result = deleteHuman();
                        if(result){
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
            }catch (InputMismatchException e){
                System.out.println("숫자를 입력하세요!");
                System.out.println();
                
                //input = new Scanner(System.in); //다시 객체 생성하던가
                input.next(); //혹은 next() 메서드를 선언해서 숫자 예외를 없애준다
            }

        }
    }

}