package student.dao;

import student.vo.Student;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	//입력
	public int insertStudent(Student s){
		SqlSession session = null;
		int result = 0;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			result = mapper.insertStudent(s);
			session.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;


	}

	//전체 출력
	public ArrayList<Student> selectStudentAll(){
		SqlSession session = null;
		ArrayList<Student> student = null;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			student = mapper.selectStudentAll();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return student;

	}

	//삭제
	public int deleteStudent(int id){
		SqlSession session = null;
		int result = 0;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			result = mapper.deleteStudent(id);
			session.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;



	}

	//수정
	public int updateStudent(Student s){
		SqlSession session = null;
		int result = 0;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			result = mapper.updateStudent(s);
			session.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;

	}
	
	//부분일치 검색
	public ArrayList<Student> searchStudent(String name){
		SqlSession session = null;
		ArrayList<Student> student = null;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			student = mapper.searchStudent(name);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return student;
	}

	//번호 검색
	public Student searchStudentByID(int id){
		SqlSession session = null;
		Student st = null;
		
		try{
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			st = mapper.searchStudentByID(id);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return st;
	}
	
}
