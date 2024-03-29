package dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.ArrayList;


import vo.Person;


public class PersonDAO {

    //SqlSessionFactory 객체를 MyBatisConfig.java로부터 전달받음
    //Factory 객체 생성
    private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

    public int insertPerson(Person p){

        //try문 안에서 객체 생성하면 fianlly에서 접근 불가
        //try문 밖에 참조변수만 생성해둔다.

        SqlSession session = null;
        int result = 0;

        try{            
            //query 를 실행하기 위한 SqlSession 객체 생성
            session = factory.openSession();
    
            //DB에 접속이 됐으니 query를 실행하면 되는데...
            //MyBatis에서는 qeury를 xml 파일에 저장함
    
            //personMapper.xml에서 참조
    
            //java 파일과 xml 파일, 서로 다른 파일을 어떻게 참조하는지?
            //interface를 통해서.
            
    
            //Personmapper 인터페이스 전달 받는다
            //객체 생성 법이 조금 특이, 기억해둔다
            //매개변수에는 객체 생성하고 싶은 인터페이스.class
            PersonMapper mapper = session.getMapper(PersonMapper.class);
    
            //.class
            //클래스 파일명에 확장자를 적은 것은
            //해당 파일의 메타데이터를 뜻함
    
            
            //마이바티스에서 query실행하려면 mapper클래스 method 통해서
            //mapper 클래스의 메서드와 xml 파일의 쿼리를 연결
    
            result = mapper.insertPerson(p);
            //이 구문에서 예외가 발생!
            
            session.commit();
            //DML INSERT한 뒤에는 COMMIT을 잊지 말자.
            //session으로 qeury 실행

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //DB 처리 작업을 모두 끝낸 뒤에는 반드시 session을 닫아야한다
            session.close();
        }
        return result;
    }


    public ArrayList<Person> selectPerson(){
        SqlSession session = null;
        ArrayList<Person> result = null;
        //try안에서 생성, 반환하면 에러.
        //try문 밖에 참조변수 생성해서 초기화.
        
        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            //참조변수 안에 생성된 값 대입
            result = mapper.selectPerson();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        //"finally block does not complete normally"
        //결과 리턴은 try문 밖에
        return result;

    }        
    
    
    //왜 return 값을 int로 뒀나?
    //delete문 제대로 실행되면 하나의 행이 삭제되고,
    //삭제된 행 수만큼 int로 반환됨

    //반환값 0일 경우, 전달받은 숫자랑 동일한 숫자를 가진 칼럼이 없어서
    //삭제를 못했다는 뜻
    public int deletePerson(Person p){
        SqlSession session = null;
        int result = 0;

        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            result = mapper.deletePerson(p);
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    
    }


    public int deletePerson2(int num){
        SqlSession session = null;
        int result = 0;

        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            result = mapper.deletePerson2(num);
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    
    }

    public int updatePerson(Person p){
        SqlSession session = null;
        int result = 0;
        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            result = mapper.updatePerson(p);
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    }


    public ArrayList<Person> searchPersonByName (String name){
        SqlSession session = null;
        ArrayList<Person> result = null;
        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            result = mapper.searchPersonByName(name);
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    }


    public ArrayList<Person> searchPerson (String name){
        SqlSession session = null;
        ArrayList<Person> result = null;
        try{
            session = factory.openSession();
            PersonMapper mapper = session.getMapper(PersonMapper.class);
            result = mapper.searchPerson(name);
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return result;
    }
}
