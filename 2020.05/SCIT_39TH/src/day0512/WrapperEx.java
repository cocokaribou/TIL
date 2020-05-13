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

//parseInt(String s)
//Integer class static method
//parse the string arguments as a signed decimal integer.

        String str3 = "24595";
        String str4 = "12342";
    
        System.out.println((Integer.parseInt(str3)) + (Integer.parseInt(str4)));


//parseDouble(String s)
//Double class static method
//Returns a new double initialized to the value represented by the specified String, as performed by the valueOf method of class Double.

        String str5 = "3.1415";
        String str6 = "0.45";

        System.out.println((Double.parseDouble(str5))+(Double.parseDouble(str6)));
    }

}