import java.util.Scanner;


class Quiz_0414 
{
	public static void main(String[] args) 
	{
		System.out.print("input the month you want to know the number of days : ");
		Scanner scnr = new Scanner(System.in);
		int month = scnr.nextInt();
		scnr.close();
		
		int days = 0;

		if (month > 12 || month < 0)
			System.out.println("input in between 1 to 12");
		else if (month % 2 == 1 && month <= 7 || month % 2 == 0 && month >= 8)
			days = 31;
		else if (month == 2)
			days = 28;
		else
			days = 30;

		System.out.println(month+"月 = "+days+"日");
	
	}
}
	