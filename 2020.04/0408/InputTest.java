import java.util.Scanner;
/*---import java util pacakage in order to use Scanner(System.in) method in Scanner class---*/

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

		int num = sc.nextInt();
		System.out.println(num);


/*next()*/
//Scanner type variable 'sc' calls method next();
//read String type input data from a user.
//assign the input data into String variable 'tryout'.

		String tryout = sc.next();
		System.out.println(tryout);				


/*automatic type conversion*/
//nextInt() reads integer type input data from a user.
//assing the int data into double variable 'd'.

		double d = sc.nextInt();
		System.out.println(d);
		//사용자로부터 입력받은 int형 정수가
		//int 보다 수의 표현범위가 큰 double로 자동 형변환, double 형 변수 d에 대입된다

	}
}
