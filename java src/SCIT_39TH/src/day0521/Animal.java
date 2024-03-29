package day0521;

//if the class contains abstract method, the class must be declared abstract as well
public abstract class Animal {
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

//abstract method
//can only be declared as public and protected
    public abstract void move();

    public abstract void eat();

}