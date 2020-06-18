package student.vo;

public class Student {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student(){}

	public Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Student(int id, String name, int kor, int eng, int mat){
		this.id =  id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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

	public int getKor() {
		return this.kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return this.eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return this.mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}	

	@Override
	public String toString(){
		return id+"    "+name+"    "+kor+"    "+eng+"    "+mat;
	}
	
}
