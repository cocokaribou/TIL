class PrintOperator 
{
/*---starting point of a program, main()---*/
	public static void main(String[] args) 
	{

		int a = 2;
		long l = 999;

		System.out.println("a= " + a);
		System.out.println(l);

		// int is a datatype of a variable.
        // a is a variable name.
		// 2 is int literal.
		
		System.out.println('1'+'1'); //98
		System.out.println("1"+"1"); //11
		
		char a = 'a';
		char b = 'b';

		System.out.println(a+b); //195
		System.out.println(a + b); //195
		System.out.printf("%c%c\n", a, b); //ab

		//better not to operate with char values in a print statement.


	}
}
