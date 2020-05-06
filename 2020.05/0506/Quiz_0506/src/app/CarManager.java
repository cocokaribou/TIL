package app;

public class CarManager {
    CarInfo[] array = new CarInfo[1000];
    int counter = 0;


    void register(String a, String b, String c, String d){
        array[counter] = new CarInfo(a,b,c,d);
        counter++;
    }

    void infoQuery(String number){
        for (int i=0; i<counter; i++){
            if (array[i].contact_num.equals(number)){
            System.out.println("NAME : "+array[i].car_owner);
            System.out.println("CAR NUMBER : "+array[i].car_num);
            System.out.println("CONTACT NUMBER : "+array[i].contact_num);
            System.out.println("CAR LOCATION : "+array[i].car_location);
            }
            else
                System.out.println("no matching car info");
                
        }
    }

    void printInfo(){
        if(counter==0){
            System.out.println("no car info has been added yet!");
            return;
        }
        for (int i=0; i<counter; ++i){
            System.out.println("NAME : "+array[i].car_owner);
            System.out.println("CAR NUMBER : "+array[i].car_num);
            System.out.println("CONTACT NUMBER : "+array[i].contact_num);
            System.out.println("CAR LOCATION : "+array[i].car_location);
        }
    }


}