package day0513;

//parent class
public class Ipod {

//field (private)
    private String modelName;
    private int storage;

//getter and setter (public)
    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    
//constructor
    public Ipod(){}
    public Ipod(String modelName, int storage){
        super(); //refers to Object class default constructor, which generates Object instance.
        //every class in Java auto-generates Object class instance.
        this.modelName=modelName;
        this.storage=storage;
    }

//private method
//will not appear in subclasses
//also in main method
//you can only use private method locally (within the class).

    // private void testPrivate(){
    //     System.out.println("private method in superclass");
    // }

    public void musicPlayer(){
        System.out.println("Play music"); 

    }
}