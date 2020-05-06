import java.util.*;

class Quiz_0506 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		MemberManager mngr = new MemberManager();

		while(true){
			System.out.println();
			System.out.println("1.Register");
			System.out.println("2.Print Info");

			int select = input.nextInt();

			switch(select){
				case 1:
					System.out.println("you've selcted 1.");
					System.out.print("input ID : ");
					String id = input.next();
					System.out.print("input PW : ");
					String password = input.next();
					System.out.print("input NAME : ");
					String name = input.next();

					mngr.insertInfo(id, password, name);
					
					break;
				
				case 2:
					System.out.println("you've selected 2.");
					mngr.printInfo();
					System.out.println();
					break;
				default:
					System.out.println("please select a number between 1,2");
					continue;

			}
		}
	}
}
