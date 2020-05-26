package day0526.HW;

public class Student extends Human{

    private String ssn;

    public Student(String sn, String name, int age, String ssn){
        super(sn,name,age);
        this.ssn = ssn;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("학번: "+this.ssn);
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}