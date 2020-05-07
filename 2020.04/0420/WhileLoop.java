import java.util.*;

class WhileLoop 
{
	public static void main(String[] args) 
	{
//		int i = 0;
//		while (i<10)2
//		{
//			i++;
//			if (i%2==0)
//				System.out.println("¦�� "+i);
//		}


//		int i=2;
//		while (i<10)
//		{
//			int j=1;
//			while (j<10){
//				System.out.println(i+"*"+j+"="+i*j);
//				j++;}
//			System.out.println();
//			i++;
//		}System.out.println();


		Scanner sc = new Scanner(System.in);
		System.out.println("reading long numbers in infinite loop");
		System.out.println("input 0 to exit loop");
		while (true) //infinite while loop
		{
			long a = sc.nextLong();
			if (a==0) {System.out.println("break!");break;} //break condition
			System.out.println(a);
		}
		sc.close();
	}
}
