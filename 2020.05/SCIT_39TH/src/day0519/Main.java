package day0519;

public class Main {
    public static void main(String[] args) {

//subclas
        Human h1 = new Human(24, "female", "lee");
        h1.eat();
        h1.move();
        h1.speak();

//superclass
        Animal a1 = new Animal(5, "female");
        //overridden methods
        a1.eat();
        a1.move();

//up-casting
        //Animal a2 = (Animal)h1; //explicit class cast
        Animal a2 = h1; //implicit class cast

        //a2.speak();
        //the subclass method is underdefined for the superclass type

        a2.eat();


    }
}