package day0518;

public class ExException {
    public static void main(String[] args){
        
        try{
            System.out.println(4/0);
        }catch(RuntimeException e){
            System.out.println("Runtime Exception");
            e.printStackTrace();
        }finally{ 
            System.out.println("test code");
            System.out.println("finally code");
        }


    System.out.println("exit program");







        
    
    }
    


}