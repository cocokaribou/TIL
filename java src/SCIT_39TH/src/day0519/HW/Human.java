package day0519.HW;

public class Human {
    private String sn;
    private String name;
    private int age;
    
    public Human(String sn, String name, int age){
        this.sn = sn;
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("이름: "+this.name);
        System.out.println("나이: "+this.age);
        System.out.println("주민번호: "+this.sn);
    }

    public String getSn() {
        return this.sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}