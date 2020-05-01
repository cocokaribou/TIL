import java.util.*;

class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		PersonManager pm = new PersonManager();

		System.out.println("1. register");
		System.out.println("2. print information");
		System.out.println("0. exit program");

		while(true){
			System.out.print("select menu : ");
			int select = input.nextInt();
			if (select>2 || select<0)
			{
				System.out.println("Wrong Input!");
				continue;
			}
			switch(select){
				case 1:
					System.out.println("You have chosen 1. register");
					System.out.print("input name: ");
					String name = input.next();
					System.out.print("input age: ");
					int age = input.nextInt();
					System.out.print("input gender: ");
					String gender = input.next();
					System.out.print("input occupation: ");
					String occupation = input.next();
					pm.insertPerson(name, age, gender, occupation);
					break;
				case 2:
					System.out.println("You have chosen 2. print information");
					pm.printInfo();
					break;
				case 0:
					System.out.println("You have chosen 0. exit program");
					return;


			}
		}
		
	}
}
