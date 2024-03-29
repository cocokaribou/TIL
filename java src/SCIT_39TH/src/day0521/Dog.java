package day0521;

public class Dog extends Animal{
    
    public Dog(){}

    public Dog(int age, String gender){
        super(age, gender);
    }

//every abstract method that are inheritted from abstract class must be overridden
    @Override
    public void move(){
        System.out.println("it's moving around using four limbs");
    }

    @Override
    public void eat(){
        System.out.println("it's eating dog food");
    }

    public void bark(){
        System.out.println("it's barking");
    }

}