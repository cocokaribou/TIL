import java.util.*;
class CalendarPrinter 
{
	public static void main(String[] args) 
	{
		System.out.println("printing calendar using for loop");
		System.out.print("input the month : ");

		int month = 0, days = 0;
		
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		scanner.close();
		
		if (month < 0 || month > 12) {
			System.out.println("Wrong Input: must be in between Jan to Dec.\n");
			return;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else if (month == 2)
			days = 28;
		else
			days = 30;


		System.out.println(month+"月\n");
		for (int i = 1; i < days+1; i++){
			System.out.print(i+"\t");
			if (i % 7 == 0) //newline in every 7th days
				System.out.println("\n");
		}System.out.println("\n");

	}
}
