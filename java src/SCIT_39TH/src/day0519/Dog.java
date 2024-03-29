package day0519;

public class Dog extends Animal{
    
    public Dog(){}

    public Dog(int age, String gender){
        super(age, gender);
    }

    public void bark(){
        System.out.println("it's barking");
    }

}