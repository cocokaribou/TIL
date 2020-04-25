class InDecreOper 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		System.out.println("num1= " + num1);
		System.out.println("변수에 증감연산한 값을 대입\n");

		num1++;
		System.out.println("num1 = num1++; //" + num1);

		++num1;
		System.out.println("num1 = ++num1; //" + num1);

		
		System.out.printf("\n\n변수에 대입하지 않고 메소드 안에서 증감연산을 할 경우\n\n");
		
		System.out.println("num1= " + num1);
		//전치연산자 前置演算子
		//int 형 변수 num1의 값을 1 증가시킨 후,
		//변수 num1의 값을 출력한다.
		System.out.printf("print(++num1);\t 증감연산 먼저:\t%d\n", ++num1); 
		
		//후치연산자 後置演算子
		//변수 num1의 값을 출력한 후,
		//int 형 변수 num1의 값을 1 증가시킨다.
		System.out.printf("print(num1++);\t 메소드 먼저:\t%d\n", num1++);

		//후치연산 결과를 출력. 1 증가된 것을 확인할 수 있다.
		System.out.printf("print(num1);\t 메소드 후 연산: %d\n\n", num1);
	}
}
