package day0520_HW;

public class Human {

	private int age;
	private String name;
	
	Human(){}
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { //comparing hash code values
/*
* this method returns {@code true} if and only
* if {@code x} and {@code y} refer to the same object
* ({@code x == y} has the value {@code true}).
*/
			return true;
		} else if (obj == null) { 
			return false;
		} else if (obj instanceof Human) {
			Human h = (Human) obj;
			if ((h.getName() == null && name == null) || (h.getName().equals(name)) && (h.getAge() == age)) {
				return true;
			}
		}
		return false;
	}
}
