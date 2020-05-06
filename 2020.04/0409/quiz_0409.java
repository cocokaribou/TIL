import java.util.Scanner;
class Quiz_0409
{
	public static void main(String[] args) 
	{

//1.
//read an input number from a user and tell if the number is even or odd number.

		System.out.print("input int number = ");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		String result = a%2==0 ? "even" : "odd";
		System.out.println(result);


//2.
//read three test scores numbers from a user and print out the average.
//if the average is below 80 , print false.

		int n1 = sc.nextInt(), 
			n2 = sc.nextInt(), 
			n3 = sc.nextInt();

		int avg = (n1 + n2 + n3) / 3;
		boolean tell_result = avg >= 80;
		System.out.println(tell_result);

	}
}
