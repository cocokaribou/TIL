class InDecreOper 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		System.out.println("num1= " + num1);
		System.out.println("������ ���������� ���� ����\n");

		num1++;
		System.out.println("num1 = num1++; //" + num1);

		++num1;
		System.out.println("num1 = ++num1; //" + num1);

		
		System.out.printf("\n\n������ �������� �ʰ� �޼ҵ� �ȿ��� ���������� �� ���\n\n");
		
		System.out.println("num1= " + num1);
		//��ġ������ ������ߩ�
		//int �� ���� num1�� ���� 1 ������Ų ��,
		//���� num1�� ���� ����Ѵ�.
		System.out.printf("print(++num1);\t �������� ����:\t%d\n", ++num1); 
		
		//��ġ������ ������ߩ�
		//���� num1�� ���� ����� ��,
		//int �� ���� num1�� ���� 1 ������Ų��.
		System.out.printf("print(num1++);\t �޼ҵ� ����:\t%d\n", num1++);

		//��ġ���� ����� ���. 1 ������ ���� Ȯ���� �� �ִ�.
		System.out.printf("print(num1);\t �޼ҵ� �� ����: %d\n\n", num1);
	}
}
