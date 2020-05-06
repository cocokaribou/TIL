import java.util.Scanner;
/*---import java util pacakage in order to use Scanner() method in Scanner class---*/

class InputTest 
{
	public static void main(String[] args) 
	{

//create a Scanner class object with new keyword (instantation)
//assign a Scanner class object to Scanner type variable 'sc' (initialization) 

		Scanner sc = new Scanner(System.in);


/*nextInt()*/
//Scanner type variable 'sc' calls method nextInt();
//read integer type input data from a user.
//assign the input data into int variable 'num'.

		System.out.print("input num = ");
		int num = sc.nextInt();
		System.out.println(num);


/*next()*/
//Scanner type variable 'sc' calls method next();
//read String type input data from a user.
//assign the input data into String variable 'tryout'.

		System.out.print("input String = ");
		String tryout = sc.next();
		System.out.println(tryout);				


/*automatic type conversion*/
//nextInt() reads integer type input data from a user.
//assing the int data into double variable 'd'.

		System.out.print("input num = ");
		double d = sc.nextInt();
		System.out.println("converted to double = "+d);

	}
}
