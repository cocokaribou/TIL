import java.util.*;
class Quiz_0416 
{
	public static void main(String[] args) 
	{
//1.
//read a integer number from a user to print times table 

//		System.out.print("input a number to print times table: ");
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		System.out.println("\n~~"+num+" times table~~\n");
//		for (int i = 1; i < 10; i++)
//			System.out.println(num+"x"+i+"="+(num*i)+"\n");
//


//2.
//factorial calculator

//		System.out.print("input integer n to calculate factorial n! : ");
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		long fact = 1;
//	
//		for (int i=1; i<=num; i++)
//			fact *= i; //fact = fact*i
//
//		for (int i = num; i > 0; i--){
//			System.out.print(i);
//			if (i != 1)
//			System.out.print("*");
//		}System.out.println(" = "+fact);



//3.
//read two integer numbers n1, n2 from a user.
//print the sum of odd numbers between n1~n2 (inclusive)
//(n1 < n2)

		Scanner sc = new Scanner(System.in);
		System.out.println("printing the sum of odd numbers between n1~n2.");
		
		System.out.print("input n1: ");
		int n1 = sc.nextInt();

		System.out.print("input n2: ");
		int n2 = sc.nextInt();

		sc.close();

		int sum = 0;

		if (n1>n2){
			System.out.println("\nWrong input!");
			return;
		}

		for (int i = n1; i <= n2; i++)
			if (i%2 == 1) 
				sum += i;

		for (int i = n1; i <= n2; i++)
		{
			if (i%2 == 1){
				System.out.print(i);
				if (i < n2-1)
					System.out.print("+");
			}
		}System.out.print("= "+sum+"\n\n");

	}
}
