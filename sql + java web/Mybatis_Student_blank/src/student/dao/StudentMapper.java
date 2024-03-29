package student.dao;

import student.vo.Student;
import java.util.ArrayList;

public interface StudentMapper{
    //입력
    public int insertStudent(Student s);

    //전체 출력
    public ArrayList<Student> selectStudentAll();

    //삭제
    public int deleteStudent(int id);

    //수정
    public int updateStudent(Student s);
    
    //부분일치 검색
    public ArrayList<Student> searchStudent(String name);

    //번호 검색
    public Student searchStudentByID(int id);

}
