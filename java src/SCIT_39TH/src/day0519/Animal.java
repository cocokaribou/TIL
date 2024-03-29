package day0519;

public class Animal {
    private int age;
    private String gender;

    public Animal(){}
    public Animal(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void move(){
        System.out.println("it's moving");
    }

    public void eat(){
        System.out.println("it's eating");
    }

}