package test.dao;

import java.util.ArrayList;

import test.vo.Player;

public interface PlayerMapper {

	public int createPlayer(Player p);
	public void winIncre(Player p);
	public void loseIncre(Player p);
	public void totalIncre(Player p);
	public ArrayList<Player> printName();
	public ArrayList<Player> ranklist();
	public ArrayList<Player> listAll();
	public Player selectByName(String name);
	public int deletePlayer(int id);

}
