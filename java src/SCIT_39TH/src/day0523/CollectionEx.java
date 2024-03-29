package day0523;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {

//ArrayList that can only contains Strings
        ArrayList<String> list = new ArrayList<String>();

//ArrayList methods

//add(reference type)
    list.add("HELLO");
        list.add("WORLD");
        //list.add(10);
        //can't add primitive data type

/*
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     *
     *public boolean add(E e) {
     *    ensureCapacityInternal(size + 1);  // Increments modCount!!
     *    elementData[size++] = e;
     *   return true;
    }
*/



//add(i, reference type)
        list.add(1, "★");
        //list.add(4, "★");
        //java.lang.IndexOutOfBoundsException

        
//get(i)
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

//list.size();
        System.out.println("\n--before deletion, list size: "+list.size()+"--");
        

//remove(i)       
        list.remove(1);        
        
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n--after deletion, list size: "+list.size()+"--");
        
        //list.remove(5);
        //java.lang.IndexOutOfBoundsException
        

//remove(reference type);
        String s = list.get(0);
        list.remove(s);
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n--after deletion, list size: "+list.size()+"--");

        list.add(0, "hello");
        list.add("yet");
        list.add("again");


//Iterator
//traversing elements using Iterator
        System.out.println("added elements: ");
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
 

//set(i, reference type)
        list.set(0, "HELLO");


        System.out.println("changed elements: ");
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


//contains(Object obj)
//returns boolean
        String s1 = "HELLO";
        
        if(list.contains(s1)) System.out.println("list contains \""+s1+"\"");
        else System.out.println("no such element as \""+s1+"\"");
        

//clear()
//iseEmpty()


    }
}