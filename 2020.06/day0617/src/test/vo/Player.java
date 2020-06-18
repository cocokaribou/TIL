package test.vo;

public class Player {
	private String name;
	private int win_count;
	private int lose_count;

	public Player() {}

	public Player(String name){
		this.name = name;
	}
	
	public Player(String name, int win, int lose){
		this.name = name;
		win_count = win;
		lose_count = lose;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getWin_count() {
		return this.win_count;
	}
	
	public void setWin_count(int win_count) {
		this.win_count = win_count;
	}
	
	public int getLose_count() {
		return this.lose_count;
	}
	
	public void setLose_count(int lose_count) {
		this.lose_count = lose_count;
	}
	

	@Override
	public String toString() {
		return name + "\twin count:"+win_count+"\tlose count"+lose_count;
	}
}
