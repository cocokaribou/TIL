package dao;

import java.util.ArrayList;

import vo.Person;

public interface PersonMapper {
 
    //인터페이스는 추상메서드만 가진다

    //사용자 정보(person)를 입력(insert)받는 메서드
    //사용자 정보가 담긴 Person 객체를 매개변수로 받는다
    public void insertPerson(Person p);

    //조회 메서드
    //public Person selectPerson();
    //반환 타입을 Person으로 해놓으면 한 명의 데이터만 받을 수 있다.
    //SELECT * 로 하려면 어떻게 해야?
    
    //ArrayList의 요소로 저장.
    public ArrayList<Person> selectPerson();

    //delete 메서드
    //반환값 int
    public int deletePerson(Person p);

    //update 메서드
    public void updatePerson(Person p);


    
}