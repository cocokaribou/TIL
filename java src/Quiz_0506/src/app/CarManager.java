package app;

public class CarManager {
    CarInfo[] array = new CarInfo[1000];
    int counter = 0;


    void register(String a, String b, String c, String d){
        array[counter] = new CarInfo(a,b,c,d);
        counter++;
    }

    boolean tellIfNull(){
        if (counter==0 && array[0]==null) {
            return false;}
        else
            return true;
    }

    void infoQuery(String number){
        boolean flag = false;
        for (int i=0; i<counter; i++){
            if (array[i].contact_num.equals(number)){
                flag = true;
                System.out.println();
                System.out.println("[no. "+(i+1)+"]");
                System.out.println("NAME : "+array[i].car_owner);
                System.out.println("CAR NUMBER : "+array[i].car_num);
                System.out.println("CONTACT NUMBER : "+array[i].contact_num);
                System.out.println("CAR LOCATION : "+array[i].car_location);
                break;
            }
        }
        if (flag == false){
                System.out.println();
                System.out.println("no matching car info!");
                System.out.println("please try again!");
        }
              
        
    }

    void printInfo(){
        if(tellIfNull() == false){
            System.out.println();
            System.out.println("no car info has been registered yet!");
            return;
        }
        for (int i=0; i<counter; ++i){
            System.out.println();
            System.out.println("[no. "+(i+1)+"]");
            System.out.println("NAME : "+array[i].car_owner);
            System.out.println("CAR NUMBER : "+array[i].car_num);
            System.out.println("CONTACT NUMBER : "+array[i].contact_num);
            System.out.println("CAR LOCATION : "+array[i].car_location);
        }
    }


}