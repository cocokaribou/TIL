package day0519;

public class Main {
    public static void main(String[] args) {
        
//superclass
        Animal a = new Animal(5, "female");
        a.eat();
        a.move();

//subclass
        Human h = new Human(24, "female", "lee");
        //overridden methods
        h.eat();
        h.move();
        h.speak();


//up-casting
        
        Animal a1 = (Animal)h; //explicit class cast
        //Animal a1 = h1; //implicit class cast

        //a1.getName();
        //a1.speak();
        //the subclass method is underdefined for the superclass type

        a1.eat(); //calling overridden method from subclass

//down-casting an up-casted object
        //only allows explicit class cast
        Human h1 = (Human)a1;

        h1.speak();

//another subclass
        Dog d = new Dog(5, "male");


//superclass type array
        Animal[] animal_Arr = new Animal[100];
        animal_Arr[0] = h1; //Human object upcasted to Animal object
        animal_Arr[1] = d;  //Dog object upcasted to Animal object

        //Dog dd = (Dog)animal_Arr[0];
        //runtime exception
        //ClassCastException
        
//instanceof operator, return boolean value.
        if(animal_Arr[0] instanceof Human){
            System.out.println("Human was upcasted to Animal");
            Human h2 = (Human)animal_Arr[0];
            h2.speak();
        }else if(animal_Arr[0] instanceof Dog){
            System.out.println("Dog was upcasted to Animal");
            Dog dd = (Dog)animal_Arr[0];
            dd.bark();
        }


    }
}