package student.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.Student;

/**
 * DB���� ó�� Ŭ����
 */
public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//�л����� ����
	public int insert(Student s) {
		
	}

	//��ü �б�
	public ArrayList<Student> selectAll() {
		
	}

	//�л����� ����
	public int delete(String id) {
		
	}
	
	//�л����� ����
	public int update(Student s) {
		
	}
	
	//��ü �б�
	public ArrayList<Student> selectName(String name) {
		
	}

}
