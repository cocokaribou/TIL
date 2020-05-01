import java.util.*;

class	Quiz_0422 
{
	public static void main(String[] args) 
	{

//1.
//make an integer array that stores 10 input numbers from a user.
//print the array elements.
//
//		System.out.println("store 10 input numbers from a user");
//
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//
//		for (int i=0; i<arr.length; ++i)
//		{
//			System.out.print("input no."+(i+1)+" => ");
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("**** stored data ****");
//		for (int i=0; i<arr.length; ++i)
//			System.out.println(arr[i]);



//2.
//make an integer array that contains 11, 12, 13, 14, 25, 30, 54, 65, 68 ,77.
//copy its elements to another integer array.
//
//		int[] arr = new int[]{11,12,13,14,25,30,545,65,68,77};
//		int[] arr2 = new int[arr.length];

//		System.out.print("original array : ");
//		for (int i=0; i<arr2.length; ++i){
//			System.out.print(arr[i]+" ");
//			arr2[i]=arr[i];
//		}
//		System.out.print("\ncopied array : ");
//		for (int i=0; i<arr2.length; ++i)
//			System.out.print(arr2[i]+" ");
//

//or use Array class

//		int[] arr1 = {11,12,13,14,25,30,545,65,68,77};
//		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
//
//
//		System.out.print("original array : ");
//		for (int i=0; i<arr1.length; ++i){
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.print("\ncopied array : ");
//		for (int i=0; i<arr2.length; ++i)
//			System.out.print(arr2[i]+" ");
	

//3.
//array.length = input number from a user.
//make an integer array and store input numbers from a user.
//print the sum of array elements.


		Scanner sc = new Scanner(System.in);
		
		System.out.print("input array.length : ");
		int length = sc.nextInt();
		int[] arr = new int[length];

		int sum=0;

		for (int i=0; i<arr.length; ++i)
		{
			System.out.print("array["+i+"]"+"= ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("the sum of array elements : "+sum);


//4.
//read a 4 digit birthyear from a user and print their chinese zodiac.
//use while-loop.

//		Scanner sc = new Scanner(System.in);
//
//		String[] zodiac = new String[]{"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"}; 
//
//		while (true)
//		{
//			System.out.print("input birthyear: (exit:\"0\") ");
//			int birth_year = sc.nextInt();
//			if (birth_year==0) break;
//			System.out.println(birth_year+" born, your chinese zodiac is "+zodiac[birth_year%12]+".\n");
//		}
		
	}
}
