package day0526.HW;

public class Professor extends Human{
    private String major;

    public Professor(String sn, String name, int age, String major){
        super(sn,name,age);
        this.major = major;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("전공: "+this.major);
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}