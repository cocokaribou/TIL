class InDecreOper 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		System.out.println("num1= " + num1);

		num1++;
		System.out.println("num1 = num1++; //" + num1);

		++num1;
		System.out.println("num1 = ++num1; //" + num1);

		System.out.println();
		System.out.println("when you operate in a print statement\n");
		
		System.out.println("num1= " + num1);
		
		//PREFIX
		System.out.println("print(++num1); incremented first: "+ ++num1); 
		
		//POSTFIX
		System.out.println("print(num1++); evaluate the original value of the variable: "+ num1++);
		System.out.println("print(num1); incremented after the method: "+ num1);
	}
}
