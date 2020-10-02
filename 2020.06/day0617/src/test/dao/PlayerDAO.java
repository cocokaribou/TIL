package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Player;

public class PlayerDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	

	//createPlayer()
	public int createPlayer(Player p) {
		SqlSession session = null;
		int result  = 0;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			result = mapper.createPlayer(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	//winIncre()
	public void winIncre(Player p) {
		SqlSession session = null;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			mapper.winIncre(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	//loseIncre()
	public void loseIncre(Player p) {
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			mapper.loseIncre(p);
			session.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	//totalIncre()
	public void totalIncre(Player p) {
		SqlSession session = null;
		
		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			mapper.totalIncre(p);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	//printName()
	public ArrayList<Player> printName() {
		SqlSession session = null;
		ArrayList<Player> result = null;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			result = mapper.printName();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return result;
	}

	//listAll()
	public ArrayList<Player> listAll() {
		SqlSession session = null;
		ArrayList<Player> result = null;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			result = mapper.listAll();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return result;
	}

	
	public Player selectByName(String name) {
		SqlSession session = null;
		Player result = null;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			result = mapper.selectByName(name);

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

		return result;
	}

	public int deletePlayer(int id){
		SqlSession session = null;
		int result  = 0;

		try{
			session = factory.openSession();
			PlayerMapper mapper = session.getMapper(PlayerMapper.class);
			result = mapper.deletePlayer(id);
			session.commit();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

	


}
