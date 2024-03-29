import java.util.*;

class WhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("reading long numbers in infinite loop");
		System.out.println("input 0 to exit loop");
		while (true) //infinite while loop
		{
			long a = sc.nextLong();
			if (a==0) {System.out.println("break!");break;} //break condition
			System.out.println(a);
		}
		sc.close();
	}
}
