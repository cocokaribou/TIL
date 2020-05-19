package day0519.HW;

public class Staff extends Human{
    private String field;

    public Staff(String sn, String name, int age, String field){
        super(sn,name,age);
        this.field = field;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("부서: "+this.field);
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

}