package dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis의 환경설정 읽고 객체 생성
 */
public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;

	//processing to run once
	static {
		String resource = "mybatis-config.xml";		//Mybatis 환경설정 파일 읽기.
		

		try {
			//mybatis-config.xml 읽어올 준비
			Reader reader = Resources.getResourceAsReader(resource);
			
			//mybatis-config.xml 읽어서 SqlSessionFactoryBuilder 객체 생성
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//static block
	//created just once when MybatisConfig is loaded into memory

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
