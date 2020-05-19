package day0518;

public class ExException2 {
    public static void main(String[] args){

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
        //java source code:            
        //public static native void sleep(long millis) throws InterruptedException;
        //checked exception, must handle exception
        
        
        //if main() throws InterruptedException (though not recommended)
        //you can declare sleep() without try-catch statement.
        //  Thread.sleep(3000);
        
        
        
        
//what is "native" keyword though
//The native keyword is applied to a method to indicate that the method is implemented in native code using JNI (Java Native Interface). 
//native is a modifier applicable only for methods and we can’t apply it anywhere else. 
//The methods which are implemented in C, C++ are called as native methods or foreign methods
//https://www.geeksforgeeks.org/native-keyword-java/
    }
}