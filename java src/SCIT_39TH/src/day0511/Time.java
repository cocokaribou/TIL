package day0511;

//public class
//in a different pacakage
public class Time {
    
//"Benefits of Encapsulation": declare instance variables private

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
//also, while constructor can set the value of the variable only once when creating class instance,
//you can call setter method anytime you want to change the value of the variable.

public Time(int hour, int minute, int second){ //method in the initializer block
    setHour(hour);
    setMinute(minute);
    setSecond(second);
}

public Time(){
    setHour(hour);
    setMinute(minute);
    setSecond(second);
};

/*
<Setter method or constructors>
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
//     public int getHour(){
//         return this.hour;
//     }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

}