package day0513;

//subclass
public class IpodTouch extends Ipod{

    public IpodTouch(){}

    public IpodTouch(String modelName, int storage){
        super(modelName, storage); //refers to superclass constructor
    }

//method override
    public void musicPlayer(){
        super.musicPlayer();
        System.out.println("played in IpodTouch");
    }
    public void touch(){
        System.out.println("Touch extension");
    }

}