package test.vo;

public class Player {
	private int id;
	private String name;
	private int win_count;
	private int lose_count;
	private int total_count;
	
	public Player(){}

	public Player(String name){
		this.name = name;
	}

	public Player(int id, String name, int win_count, int lose_count, int total_count){
		this.id = id;
		this.name = name;
		this.win_count = win_count;
		this.lose_count = lose_count;
		this.total_count = total_count;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getTotal_count() {
		return this.total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}



	@Override
	public String toString() {
		return id+". \t"+name + "\twin count: "+win_count+"\tlose count: "+lose_count+"\ttotal count: "+total_count;
	}
}
