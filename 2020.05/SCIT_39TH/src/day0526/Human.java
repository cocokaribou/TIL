package day0526;

public class Human {
    
    private int age;
    private String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "Name: " + getName() +", Age: "+getAge();
    }
}