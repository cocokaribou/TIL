import java.util.*;

class Quiz_0420 
{
	public static void main(String[] args) 
	{

//1.
//read a integer number from a user to print times table.
//use while loop.
//(0<n<10)
//
//		Scanner scanner = new Scanner(System.in);
//
//		int i = scanner.nextInt();
//
//		if (i>=1 && i<=9)
//		{
//			int j = 1;
//			while (j<=9){
//				System.out.println(i+"*"+j+"= "+i*j);
//				j++;
//			}
//		}else System.out.println("Input number between 1 to 9");
//

//2.
//read multiple integer numbers from a user, and calculate the sum of those numbers.
//if read -1 break the loop and print the sum.

//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		int i = 1;
//
//		while(true){
//			System.out.print("no. "+i+" num (-1 to exit): ");
//			int a = scanner.nextInt();
//			if (a==-1) break;
//			sum += a;
//			i++;
//		}System.out.println();
//		System.out.println("the sum of input numbers: "+sum);


//3.
//read two integer numbers n1, n2 from a user.
//print the sum of numbers between 1~n1 (inclusive), except multiples of n2.
//if (n1 < 0)||(n1 < n2) exit the program.

		Scanner scanner = new Scanner(System.in);

		System.out.println("printing the sum of numbers between 1~n1, except multiples of n2.");
		System.out.println("n1 > n2");

		System.out.print("input integer n1: ");
		int num1 = scanner.nextInt();

		System.out.print("input integer n2: ");
		int num2 = scanner.nextInt();


		if (num1<0 || num1<num2)
		{	System.out.println("Wrong number!\n");
			return;
		}


		int total = 0;
		int count = 0;
		System.out.println();
		while (count<=num1) //must be inclusive
		{	
			 //edit: ++count shouldn't be above calculating code, it'll reach out of the range.
			if (count%num2 == 0) {count++; continue;}
			total += count;
			
			count++;

		}System.out.println("= "+total);


//how to print eqaution
//1+2+3+4...9=10
//
//how do I prevent
//...+6+8+9+=10
//or
//...+6+7+89=10



	}
}
