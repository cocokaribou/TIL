package day0513;

//subclass
public class IpodTouch extends Ipod{

    public IpodTouch(){}

    public IpodTouch(String modelName, int storage){
        super(modelName, storage); //refers to superclass constructor
    }

    public void touch(){
        System.out.println("touch extension");
    }

}