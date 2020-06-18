package test.dao;

import java.util.ArrayList;

import test.vo.Player;

public interface Mapper {

	public int createPlayer(Player p);
	public void winIncre(Player p);
	public void loseIncre(Player p);
	public ArrayList<Player> selectByName(String name);
	public ArrayList<Player> printName();

}
