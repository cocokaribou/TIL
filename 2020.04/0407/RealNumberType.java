class PrintOperator 
{
	public static void main(String[] args) 
	{
		char a = 'a';
		char b = 'b';

		System.out.println(a+b);
		System.out.println(a + b);
		System.out.printf("%c%c", a, b); //드디어..
		//문자를 연달아 출력하고 싶을 때 연산자 +로 변수를 묶으면 어째선지 정수로 인식해벌임
	}
}
