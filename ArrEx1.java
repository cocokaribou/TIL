import java.util.*;

class ArrEx1 
{
	public static void main(String[] args) 
	{

//1.
//array sort

//		int [] arr = new int[]{1, 623, 23, 53, 21, 689, 0, 34, 11};
//		
//		System.out.println("before sorting");
//		for (int i=0; i<arr.length; ++i)
//			System.out.print(arr[i]+" ");
//		
//		Arrays.sort(arr);
//		
//		System.out.println("\n\nafter sorting");
//		for (int i=0; i<arr.length; ++i)
//			System.out.print(arr[i]+" ");
//
//		System.out.println("\n\nfind the index num that contains 34 using binarySearch()");
//		System.out.println(Arrays.binarySearch(arr, 34)); //returns index num


//2.
//print maximum value and minimum value among array elements. 
//either use Array.sort()

//    int[] arr={5,3,6,7,2,4,8};
//    Arrays.sort(arr);
//	System.out.print("Max: "+arr[arr.length-1]+", Min: "+arr[0]);


//or just calculate.

//		int[] arr = {5,3,6,7,2,4,8};
//		for (int i=0; i<arr.length; ++i)
//			System.out.print(arr[i]+" ");
//
//		int max = arr[0];
//		int min = arr[0];

//careful not to initialize min value to 0.

//		for (int i=0; i<arr.length; ++i)
//		{
//			if (min > arr[i]) min = arr[i];
//			if (max < arr[i]) max = arr[i];
//		}
//	
//		System.out.println();
//		System.out.println("Max num : "+max);
//		System.out.println("Min num : "+min);



//3.
//array.length = 5;
//store input numbers and print array elements in reverse order.

//either print elements in reverse order,
//or store data in reverese order from the get-go.


//	int[] arr = new int[5];
//
//	System.out.println("print input numbers in reverse order");
//	Scanner input = new Scanner(System.in);
//
//	int j = 0;
//	for (int i = 0; i<arr.length; ++i) {
//		System.out.print("input number : ");
//		arr[arr.length-1-j] = input.nextInt();
//		j++;
//	}
//
//	for (int i = 0; i<arr.length; ++i)
//		System.out.println(arr[i]);
//	System.out.println();



//4.
//array.length=5
//store test scores to integer array.
//print sum and average of stored test scores.


		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("input test scores to calculate sum and average");

		int sum=0;
		double average;
		
		for (int i=0; i<arr.length; ++i)
		{
			System.out.print("no."+(i+1)+" student's score : ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}

		average = sum / arr.length;

		System.out.println();
		System.out.println("average score: "+average);
		System.out.println("students whose scores are above average: ");
		for (int i=0; i<arr.length; ++i)
			if (arr[i]>=average) System.out.println("no."+(i+1)+" student's score : "+arr[i]);

	}

}
