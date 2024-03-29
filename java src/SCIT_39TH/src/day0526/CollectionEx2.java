package day0526;

import java.util.HashMap;
import java.util.Set;

public class CollectionEx2 {
    public static void main(String[] args) {
        

//declare HashMap instance
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

//HashMap methods
//put(K key, V value)
//returns V
        map1.put("KIM", 24);
        map1.put("LEE", 23);
        map1.put("PARK", 31);

        map1.put("KIM", 50);

//get(Object key)
//returns V
//if there's no matching key, returns null

        System.out.println("Key: \"KIM\", Value: "+map1.get("KIM"));
        System.out.println("Key: \"LEE\", Value: "+map1.get("LEE"));
        System.out.println("Key: \"PARK\", Value: "+map1.get("PARK"));

//remove(Object key)
//returns V
        map1.remove("LEE");

//keySet()
//returns Set<K>
        Set<String> s = map1.keySet();

//for-each
//iterating over collection

        for(String str:s){
            System.out.print(str+" "); //LEE KIM PARK
            //System.out.println(s); // [LEE, KIM, PARK] times 3 
        }
        System.out.println();

//size()
        System.out.println("저장중인 데이터 개수: "+map1.size());
//clear()
        map1.clear();
        System.out.println("after clearance");
        System.out.println("저장중인 데이터 개수: "+map1.size());

    }
}