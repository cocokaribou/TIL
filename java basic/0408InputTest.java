import java.util.Scanner;

class InputTest 
{
	public static void main(String[] args) 
	{

		//create a Scanner class object with new keyword (instantation)
		Scanner sc = new Scanner(System.in);


		/*nextInt()*/
		//read integer type input data from a user.

		System.out.print("input num = ");
		int num = sc.nextInt();
		System.out.println(num);


		/*next()*/
		//read String type input data from a user.

		System.out.print("input String = ");
		String tryout = sc.next();
		System.out.println(tryout);				

		/*automatic type conversion*/
		//nextInt() reads integer type input data from a user.
		//assigning the int data into double variable 'd'.

		System.out.print("input num = ");
		double d = sc.nextInt();
		System.out.println("converted to double = "+d);

		sc.close();
	}
}
