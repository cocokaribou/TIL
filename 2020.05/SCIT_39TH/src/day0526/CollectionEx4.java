package day0526;

import java.util.HashSet;

public class CollectionEx4 {

//declare HashSet that stores String only    
    public static void main(String[] args) {
    
        HashSet<String> s = new HashSet<String>();
    
//add(E e)
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("A"); //not stored

//for-each
//for (loop variable: containers like array / List/ Set)
//instead of using an indexed array element, use loop variable

        for(String str: s){
            System.out.println(str);
        }


    }    
}