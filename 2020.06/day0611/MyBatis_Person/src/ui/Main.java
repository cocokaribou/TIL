package ui;

import dao.PersonDAO;
import vo.Person;
import java.util.ArrayList;

public class Main {
    
    //사용자로부터 이름과 나이를 입력받아서
    //DB에 저장하는 로직을 수행하는 main 메서드

public static void main(String[] args) {
    
    //DB를 조작하려면 Session 要
    //SqlSessionFactory를 빌드하기 위해서는 
    //MyBatis 구성파일(config file)에 접근


    //Session 생성하는 로직을 main에 바로 적어줘도 o.k
    //SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
    //하지만 기능을 분리한다 -> PersonDAO

    PersonDAO dao = new PersonDAO();
    
    Person p2 = new Person("YOON", 24);
    //dao.deletePerson(p2);
    int result = dao.insertPerson(p2);
    if (result == 1) System.out.println("등록성공!");
    else System.out.println("등록실패!");

    ArrayList<Person> per = dao.selectPerson();
    
    for (Person temp : per)
        System.out.println(temp);

    // 전체 출력
    // ArrayList<Person> result = dao.selectPerson();
    
    //전체 출력 두가지 방법
    //1. 
    // for(int i =0; i< result.size(); i++){
    //     Person temp = result.get(i);
    //     System.out.println("번호: "+temp.getNum()); 
    //     System.out.println("이름: "+temp.getName()); 
    //     System.out.println("나이: "+temp.getAge());
    // }

    //2.
    //for each
    // for(Person temp : result){
    //     System.out.println("번호: "+temp.getNum()); 
    //     System.out.println("이름: "+temp.getName()); 
    //     System.out.println("나이: "+temp.getAge());
    // }

    //3.
    //객체를 print매개변수로 전달하면
    //overriden toString 호출됨
    // for(Person temp: result)
    //     System.out.println(temp);

    // Person p2 = new Person();
    // p2.setNum(2);
    // int result2 = dao.deletePerson(p2);
    // if(result2 == 1) System.out.println("삭제 성공");
    // else System.out.println("삭제 실패");







    // Person p = new Person(1, "KIM", 40);
    // dao.updatePerson(p);

    // Person p2 = new Person(2, "LEE", 30);
    // dao.insertPerson(p2);

    // Person p1 = new Person("KIM", 24);
    // Person p2 = new Person(21, "lim", 40);
    // Person p3 = new Person("lee", 24);
    // Person p4 = new Person("yoon", 24);
    // Person p5 = new Person("han", 24);
    // Person p6 = new Person("Kam", 24);
    // Person p7 = new Person("sa", 24);
  
    
    // dao.insertPerson(p1);
    // dao.insertPerson(p2);
    // dao.insertPerson(p3);
    // dao.insertPerson(p4);
    // dao.insertPerson(p5);
    // dao.insertPerson(p6);
    // dao.insertPerson(p7);
  

    // //일련번호 1번 사람을 지운다
    // int i = dao.deletePerson2(1);
    // if (i == 1) System.out.println("삭제성공!");
    // else System.out.println("삭제실패!");
    
    // ArrayList<Person> result = dao.selectPerson();
    // for(Person temp: result)
    //     System.out.println(temp);


    // Person p = new Person();
    // //수정하고 싶은 사람의 번호 지정
    // p.setNum(5);

    // //수정하고 싶은 내용 지정
    // p.setName("DO");
    // p.setAge(40);

    // int j = dao.updatePerson(p);
    // if(j == 1) System.out.println("수정성공!");
    // else System.out.println("수정실패!");


    // //수정사항 반영된 거 확인
    // ArrayList<Person> result2 = dao.selectPerson();
    // for(Person temp: result2)
    //     System.out.println(temp);

    // PersonDAO dao = new PersonDAO();
    // ArrayList<Person> result = dao.searchPerson("d");
    // if(result.size()!= 0){
    //     for(int i =0; i<result.size(); i++){
    //         System.out.println(result.get(i));
    //     }
    // }else System.out.println("검색된 데이터가 없음");
}
}



