package day0521.HW;

//implements multiple interfaces
public class LGSmartPhone implements LGElec, LGPhone{

    private String modelname;
    private boolean state;
    private int volume;
    
    public LGSmartPhone(String modelname, boolean state, int volume){
        this.modelname = modelname;
        this.state = state;
        this.volume = volume;
    }
    
    @Override
    public void powerOn(){ //LGElec
        this.state = true;
    }

    @Override
    public void powerOff(){ //LGElec
        this.state = false;
    }

    @Override
    public void call(){ //LGPhone
        System.out.println("calling someone");
    }

    public String getModelname() {
        return this.modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public boolean isState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void printLogo(){
        System.out.println(LOGO);
    }


    public void volumeUp(){
        this.volume += 2;
    }

    public void volumeDown(){
        this.volume -= 2;
    }   

}