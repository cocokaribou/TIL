package day0512;

public class WrapperEx {
    public static void main(String[] args){ 
            
        // int num = 123;
        // String str = num;
    
//int cannot be converted to String
//in this case you need to use Wrapper Class

        int num = -123;
        int num2 = 234;

//create Integer class instance
//Boxing & Auto-boxing

        Integer wrapInt = new Integer(num);
        Integer wrapInt2 = num2;

        Boolean bool = new Boolean(false);

//toString();
//convert int 123 to String "123"

        String str = wrapInt.toString(num);
        String str2 = wrapInt2.toString(num2);

        System.out.println(str);

//Unboxing & Auto unboxing
//intValue();

        int num3 = wrapInt.intValue();
        int num4 = wrapInt2;

        boolean b1 = bool.booleanValue();

//parseInt()
//Integer class static method
        String str3 = "24595";
        String str4 = "12342";
    
        System.out.println((Integer.parseInt(str3)) + (Integer.parseInt(str4)));


//parseDouble()
//Double class static method

    }

}