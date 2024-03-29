package day0523;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//deleting array factor
        char[] arr = new char[5];

        char a = 0x41;
        for(int i = 0; i<arr.length; i++){
            arr[i] = a++;
            
            System.out.print("["+i+"]");
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        System.out.println("Size of an array before deletion: "+arr.length);
        System.out.println("selcect an index you'd like to delete from");
        int index = sc.nextInt();

        for(int i = index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = '\u0000';

        for(int i=0; i<arr.length; i++){
            if(arr[i] != '\u0000'){
                System.out.print("["+i+"]");
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Size of an array after deletion: "+arr.length);
        System.out.println();
    
//adding array factor
        char[] arr1 = new char[5];
        char[] arr2 = new char[(arr1.length)+1];

        char chr = 0x41;
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = chr++;
            arr2[i] = arr1[i];

            System.out.print("["+i+"]");
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Size of an array before addition: "+arr1.length);
        System.out.println("selcect an index you'd like to add to");
        int indx = sc.nextInt();

        for(int i = arr2.length-1; i>indx; i--){
            arr2[i] =arr2[i-1];
        }
        System.out.println("input character you'd like to add to");
        char input = sc.next().charAt(0);

        arr2[indx] = input;        

        for(int i=0; i<arr2.length; i++){
            System.out.print("["+i+"]");
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
        System.out.println("Size of an array after addition: "+arr2.length);

        sc.close();
    }
}