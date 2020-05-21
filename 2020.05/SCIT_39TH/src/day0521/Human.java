package day0521;

public class Human extends Animal{

    private String name;
    
    public Human(){}
    public Human(int age, String gender, String name){
        super(age, gender);
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("he or she is eating with utensils");
    }

    @Override
    public void move(){
        System.out.println("he or she is walking around");
    }
    
    public void speak(){
        System.out.println("he or she is speaking");
    }
}