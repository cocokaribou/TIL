package day0528;

import java.util.*;

public class max_min {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);

        int max = arr[0]; 
        int min = arr[0];

        //max   □
        //min   □
        //arr[] □□□□□□□□□□□□□

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }

        System.out.println(max);
        System.out.println(min);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}