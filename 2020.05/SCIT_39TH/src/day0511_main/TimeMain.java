package day0511_main;

import day0511.*; 
//import other package in order to gain the access to the public class in it.

public class TimeMain {
    public static void main(String[] args){


//if instance variables were declared public: 
//first you import the package,
//then you can access them via class instance.

        // Time t = new Time();
        // t.hour = 1;
        // t.minute = 20;
        // t.second = 30;

        // System.out.printf("%d h %d m %d s", t.hour, t.minute, t.second);


//if instance variables of Time class were declared private and there's a method/constructor initializing them:

        Time t = new Time(1, 20, 59);
        System.out.printf("%d h %d m %d s", t.getHour(), t.getMinute(), t.getSecond());

//if you set the Time.second = 60;
//it will print out error message you've written in the setter method
//and then get 0 as a default value of the instance variable



    }
    
}