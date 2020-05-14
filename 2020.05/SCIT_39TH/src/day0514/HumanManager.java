package day0514;

public class HumanManager {
    private Human[] arr = new Human[1000];
    private int count = 0;

    public void insertHuman(String name, int age){
        Human h = new Human(name, age);
        arr[count] = h;
        count++;
    }

    public void printAll(){
        for(int i=0; i<arr.length; i++){
            arr[i].showInfo();
        }
    }
}