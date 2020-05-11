package day0511;

public class Calc {
    
    static int num1 = 20;
    int num2 = 33;


    public int calcAdd(int a, int b){
        return a + b;
    }

//method overload1
//same method name
//different parameters (types and numbers)
    public int calcAdd(int a, int b, int c){
        return a + b + c;
    }

//method overload2
//if parameter list is the same,
//return type should be different
    public double calcAdd(double a, double b){ //calculating with doubles, less precise
        return a + b;
    }

//alternative to double type when calculating floating point real numbers
//BigDecimal();

    public static int calcSub(int a, int b){
        return a - b;
    }


    public static void main(String[] args) {
        System.out.println(num1); //static vs non-static
        // System.out.println(num2);
        //cannot access to instance variable directly
    
        Calc c = new Calc();

        System.out.println(c.calcAdd(1, 2)); //non-static method

        System.out.println(calcSub(1, 2));  //static method


        
    }
}