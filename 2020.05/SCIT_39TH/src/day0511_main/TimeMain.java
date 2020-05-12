package day0511_main;

import day0511.*; 
//import other package in order to gain the access to the public class in it.

public class TimeMain {
    public static void main(String[] args){


//if instance variables were declared public: 
//first you import the package(if they are located in a different pacakge),
//then you can directly access them via class instance.
//...which is not recommended for the sake of encapsulation.

        // Time t = new Time();
        // t.hour = 1;
        // t.minute = 20;
        // t.second = 30;

        // System.out.printf("%d h %d m %d s", t.hour, t.minute, t.second);


//if instance variables were declared private:
//first you import the package,
//then you call constructors / methods to access them

//constructor

        Time t = new Time(1, 20, 59);
        Time t2 = new Time(2, 20, 59);

//setter method to change the value of the instance variable after when objects were made        
        
        t.setHour(2);
        t2.setMinute(15);

        System.out.printf("%d h %d m %d s%n", t.getHour(), t.getMinute(), t.getSecond()); // 2 h 20 m 59 s
        System.out.printf("%d h %d m %d s%n", t2.getHour(), t2.getMinute(), t2.getSecond()); //2 h 15 m 59 s
        

//if you set the instance value of the Time object out of range (ex t.setSecond(60));
//it will print out error message you've written in the setter method
//and then get 0 (default value of the instance variable).

        Time t3 = new Time();

        t3.setHour(13);
        t3.setMinute(60);
        t3.setSecond(60);
        System.out.printf("%d h %d m %d s%n", t3.getHour(), t3.getMinute(), t3.getSecond()); //wrong input! 0 h 0 m 0 s
        



    }
    
}