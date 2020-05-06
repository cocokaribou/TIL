class RealNumberType
{
	public static void main(String[] args) 
	{
		char a = 'a';
		char b = 'b';

		System.out.println(a+b); //195
		System.out.println(a + b); //195
		System.out.printf("%c%c\n", a, b); //ab

		//"it's better not to operate with char values in a print statement." I'll take that.
	}
}
