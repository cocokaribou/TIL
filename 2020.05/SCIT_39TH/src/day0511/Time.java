package day0511;

//public class
//in a different pacakage
public class Time {
    
//code convention: declare instance variables private
//it's called "Benefits of Encapsulation"

    private int hour;
    private int minute;
    private int second;

//initialize instance variables using setter method

    public void setHour(int hour){
        if(hour < 0 || hour > 23) {System.out.println("wrong input!"); return;}
        this.hour = hour;
    }

    public void setMinute(int minute){
        if(minute < 0 || minute > 59) {System.out.println("wrong input!"); return;}
        this.minute = minute;
    }

    public void setSecond(int second){
        if(second < 0 || second > 59) {System.out.println("wrong input!"); return;}
        this.second = second;
    }

//why not use constructor in the first place?: to set the condition.

public Time(int hour, int minute, int second){
    setHour(hour);
    setMinute(minute);
    setSecond(second);
}

/*
Setter method or constructors
You should use the constructor approach, when you want to create a new instance of the object, 
with the values already populated(a ready to use object with value populated). 
This way you need not explicitly call the setter methods for each field in the object to populate them.

You set the value using a setter approach, when you want to change the value of a field, after the object has been created.
https://stackoverflow.com/questions/19359548/setter-methods-or-constructors
*/


//return initialized instance variables using getter method

    public int getHour(){
        return hour;
    }

// ..or
//     public int getHour(int hour){
//         return this.hour;
//     }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

}