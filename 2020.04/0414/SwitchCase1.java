import java.util.Scanner;

class SwitchCase1 
{
	public static void main(String[] args) 
	{
		boolean a1 =  1<3;
		//¿Í ÀÌ°Ç..
		int a2 = (a1)? 1 : 0;
		switch (a2)
		{
		case 1 :
			System.out.println("true!");
			System.out.printf("int val:%d\n",a2);
			break;
		case 2 :
			System.out.println("false!");
			System.out.printf("int val:%d\n",a2);
			break;
		default :
			System.out.println("you choose the wrong one");
			break;
		}
	}
}
