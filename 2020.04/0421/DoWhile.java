import java.util.*;

class DoWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do
		{
			System.out.print("Input any Integer. \"0\"to break the loop: ");
			n = sc.nextInt();
			System.out.println(n+"\n");
		}
		while (n != 0);
		sc.close();
	}
}
