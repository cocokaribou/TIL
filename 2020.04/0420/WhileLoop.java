import java.util.*;

class WhileLoop 
{
	public static void main(String[] args) 
	{
//		int i = 0;
//		while (i<10) //�ٵ� �� i�� 10���� ���... �ǳ� �ߴ��� 0~9���� �׷�����
//						//�ƴ� �ٵ� �� 1~9 ���� 10�� ��µǳ�?
//						//i++�� ���� �־ �׷� �� ������...
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
		while (true) //���ѷ���
		{
			long a = sc.nextLong();
			if (a==0) {System.out.println("break!");break;} //���� break ���ǹ� �ɱ�
			System.out.println(a);
		}
	}
}
