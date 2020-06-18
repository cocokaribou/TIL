package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Player;

public class PlayerDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int createPlayer(Player p) {
		SqlSession session = null;
		int result  = 0;

		try{
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			result = mapper.createPlayer(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	public void winIncre(Player p) {
		SqlSession session = null;

		try{
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			mapper.winIncre(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public void loseIncre(Player p) {
		SqlSession session = null;

		try{
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			mapper.loseIncre(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public ArrayList<Player> selectByName(String name) {
		SqlSession session = null;
		ArrayList<Player> result = null;

		try{
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			result = mapper.selectByName(name);

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return result;
	}

	public ArrayList<Player> printName() {
		SqlSession session = null;
		ArrayList<Player> result = null;

		try{
			session = factory.openSession();
			Mapper mapper = session.getMapper(Mapper.class);
			result = mapper.printName();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return result;
	}

	


}
