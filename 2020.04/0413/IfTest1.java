import java.util.Scanner;
class IfTest1 
{
	public static void main(String[] args) 
	{
		System.out.println("score>=80 : A\nscore>=70 : B\nscore>=60 : C\nelse : Fail");
		System.out.print("Input test score: (0~100) ");
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		if (num > 100 || num < 0)
			System.out.println("\nerror! wrong input!");
		else
			if (num >= 80)
				System.out.println("\nA");
			else if (num >= 70)
				System.out.println("\nB");
			else if (num >= 60)
				System.out.println("\nC");
			else
				System.out.println("\nFail!");
			
		System.out.print("end of the program\n\n");
	}
}
