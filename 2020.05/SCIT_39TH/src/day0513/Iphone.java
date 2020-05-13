package day0513;

//subclass
public class Iphone extends IpodTouch{

    private String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Iphone(){}

//constructor override
    public Iphone(String number, int storage, String phoneNumber){
        super(number, storage);
        this.phoneNumber = phoneNumber;
    }

    public void call(){
        System.out.println("phone call extension");
    }

//method override
    public void musicPlayer(){
        super.musicPlayer();
        System.out.println("played in Iphone");
    }

}