package day0515;

public class Student extends Human{
    private int stNum;
    
    Student(String name, int num, int stNum){
        super(name, num);
        this.stNum = stNum;
    }
    
    public int getStNum() {
        return this.stNum;
    }

    public void setStNum(int stNum) {
        this.stNum = stNum;
    }

    @Override //annotation: won't allow method overload
    public void showInfo(){
        super.showInfo();
        System.out.println("student number: "+this.stNum);
    }
}