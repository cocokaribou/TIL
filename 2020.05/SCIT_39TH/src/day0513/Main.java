package day0513;

public class Main {
    public static void main(String[] args){

        Ipod i = new Ipod();
        IpodTouch it = new IpodTouch();
        Iphone ip = new Iphone();
        
// //superclass method override 
//         i.musicPlayer();
//         it.musicPlayer();
//         ip.musicPlayer();

// //subclass method
//         //i.touch();
//         it.touch();
//         ip.touch();

        System.out.println("---Iphone object---");
        Iphone ip2 = new Iphone("YH0521", 300, "010-1234-1234"); //overridden cosntructor
        System.out.print(ip2.getModelName()+"\n");
        System.out.print(ip2.getStorage()+"\n");
        System.out.print(ip2.getPhoneNumber());

        ip.musicPlayer(); //overridden method


//accessing superclass field via subclass instance:
//direct access is not availble because instance variable is declared private. (as it should be)
        //String st = ip.modelName;

//calling getter and setter method, which are declared public.
        ip.setModelName("YN0429");
        System.out.println(ip.getModelName());
    }
    
}