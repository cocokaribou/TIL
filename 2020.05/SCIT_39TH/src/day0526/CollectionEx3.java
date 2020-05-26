package day0526;

import java.util.HashMap;

public class CollectionEx3 {
    public static void main(String[] args) {

//how to store more than one value in a HashMap
//: use class object

        HashMap<String, Human> map = new HashMap<String, Human>();//String is a social security number

        Human h1 = new Human(22, "KIM");
        Human h2 = new Human(25, "LEE");
        Human h3 = new Human(30, "YIM");

        map.put("11111", h1);
        map.put("22222", h2);
        map.put("33333", h3);

//get(Key)
//returns reference type V
//in this case, the V is Human class object
        Human result = map.get("22222");
        System.out.println(result.getName());
        System.out.println(result.getAge());


    }
}