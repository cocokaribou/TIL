package day0513;

public class Main {
    public static void main(String[] args){

        System.out.println("---IpodTouch object---");
        IpodTouch it = new IpodTouch();
        it.musicPlayer(); //superclass method
        it.touch(); //subclass method

        System.out.println("---Iphone object---");
        Iphone ip = new Iphone("YH0521", 300, "010-1234-1234"); //overridden cosntructor
        System.out.print(ip.getModelName()+"\n");
        System.out.print(ip.getStorage()+"\n");
        System.out.print(ip.getPhoneNumber());

        ip.musicPlayer(); //overridden method


//accessing superclass field via subclass instance:
//direct access is not availble because instance variable is declared private. (as it should be)
        //String st = ip.modelName;

//calling getter and setter method, which are declared public.
        ip.setModelName("YN0429");
        System.out.println(ip.getModelName());
    }
    
}