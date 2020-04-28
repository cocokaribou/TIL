import java.util.Scanner;

class testing_boolean 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		Boolean bl = new Boolean(s1);

		System.out.println("\nString: "+s1+"\nBoolean: "+bl);
		
		//Boolean class constructor: Boolean(String s);
		//String converted to the Boolean.

		//new Boolean("True") produces a Boolean object that represents true.
		//new Boolean("False") produces a Boolean object that represents false.
		//Every String object except "true" & "false" == false


	}
}
