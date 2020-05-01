import java.util.Scanner;
class quiz_0409
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = a%2==0 ? "¦" : "Ȧ";
		System.out.println(result);

		int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
		int avg = (n1 + n2 + n3) / 3;
		boolean tell_result = avg < 80 ? false : true;
		System.out.println(tell_result);

		String tryout = "되나안되나";
		System.out.println(tryout);
	}
}
