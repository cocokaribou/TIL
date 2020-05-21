package day0521;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); //error!
        //abstract class cannot be instantiated.

        Dog doggo = new Dog();
        doggo.eat();
        doggo.move();
        
        Human human = new Human();
        human.eat();
        human.move();
        human.speak();
        
        return;
    }
    
}