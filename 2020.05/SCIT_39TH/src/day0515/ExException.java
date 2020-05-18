package day0515;

public class ExException {
    public static void main(String[] args){
        
        //NumberFormat Exception
        String s = "abc";
    
        
        //ArrayIndexOutOfBounds Exception;
        int[] arr = {1,2,3};

        try{
            System.out.println("before parsing");
            int i = Integer.parseInt(s); //java.lang.NumberFormatException
            System.out.println(arr[3]); //java.lang.A
            System.out.println("after parsing");
            System.out.println(i);
        } catch(NumberFormatException e){ //NumberFormatException object 'e'
            System.out.println("NumberFormatException");
            e.printStackTrace();
        }    
//      catch{}
    System.out.println("exit program");

//how to write exception handling code : check java source code
//for vscode: ctrl+p+#+class name
//    public static int parseInt(String s, int radix)
//          throws NumberFormatException


//NumberFormatException 소스코드를 봐도 printStackTrace() 메서드에 대한 설명을 찾아볼 수가 없다:
//NumberFormatException은 IllegalArgumentException 를 상속받고 있고,
//IllegalArgumentException은 RuntimeException 을 상속받고 있고,
//RuntimeException은 Exception을 상속받고 있고
//Exception은 Throwable을 상속받고 있다






        
    
    }
    


}