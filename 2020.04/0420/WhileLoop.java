import java.util.*;

class WhileLoop 
{
	public static void main(String[] args) 
	{
//		int i = 0;
//		while (i<10) //근데 왜 i가 10까지 출력... 되나 했더니 0~9여서 그렇구나
//						//아니 근데 왜 1~9 여도 10이 출력되냐?
//						//i++가 위에 있어서 그런 것 같은데...
//		{
//			i++;
//			if (i%2==0)
//				System.out.println("짝수 "+i);
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
		while (true) //무한루프
		{
			long a = sc.nextLong();
			if (a==0) {System.out.println("break!");break;} //루프 break 조건문 걸기
			System.out.println(a);
		}
	}
}
