class  TypeCasting
{
	public static void main(String[] args) 
	{		
		float flt = 999999999999999L;
		System.out.println(flt); 
			//��°�� 9.9999999E14
			//long �� float �ڵ�����ȯ


		//long lng = 3.14f;
		//System.out.println(lng);
			//����
			//float �� long �ڵ�����ȯ �Ұ�!

		//int nummm = 3.14f; System.out.println(nummm);

		long lng = (long)3.14f;			System.out.println(lng);
			//��°�� 3(L)
			//(long)float ��������ȯ

		
		int chr_to_int = 'A';			System.out.println(chr_to_int);
					//��°�� 65
		
		short chr_to_shrt = 'A';		System.out.println(chr_to_shrt);
					//��°�� 65
			
		char int_to_chr = 65;			System.out.println(int_to_chr);
					//��°�� 'A'
					//char ���� ��.

		char int_to_chr2 = 65536;		System.out.println(int_to_chr2);
					//����!
					//char ���� ��.

		char int_to_char3 = -10;	
					//����!
					//char ���� ��.
					

		int lng_to_int = (int)400L;		System.out.println(lng_to_int);
					//��°�� 400

		int lng_to_int2 = (int)2147483648L; System.out.println(lng_to_int2);
					//�����÷ο�!

		byte int_to_byte = (byte)128;		System.out.println(int_to_byte);
					//�����÷ο�!

	}
}
