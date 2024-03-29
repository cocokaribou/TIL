package dao;

import java.util.ArrayList;

import vo.Person;

public interface PersonMapper {
 
    //인터페이스는 추상메서드만 가진다

    //사용자 정보(person)를 입력(insert)받는 메서드
    //사용자 정보가 담긴 Person 객체를 매개변수로 받는다
    public int insertPerson(Person p);

    //조회 메서드
    //public Person selectPerson();
    //반환 타입을 Person으로 해놓으면 한 명의 데이터만 받을 수 있다.
    //SELECT * 로 하려면 어떻게 해야?
    
    //ArrayList의 요소로 저장.
    public ArrayList<Person> selectPerson();

    //delete 메서드
    //반환값 int
    public int deletePerson(Person p);

    //update 메서드 (반환형 void로도, int로도 가능)
    public int updatePerson(Person p);


    //delete 메서드, 매개변수가 정수
    public int deletePerson2(int num);

    public ArrayList<Person> searchPersonByName(String name);


    //문자가 포함된 이름 검색
    public ArrayList<Person> searchPerson(String name);

    public ArrayList<Person> searchPersonByNum(int num);
    
}