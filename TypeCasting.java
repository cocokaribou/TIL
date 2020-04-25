class  TypeCasting
{
	public static void main(String[] args) 
	{		
		float flt = 999999999999999L;
		System.out.println(flt); 
			//출력결과 9.9999999E14
			//long → float 자동형변환


		//long lng = 3.14f;
		//System.out.println(lng);
			//에러
			//float → long 자동형변환 불가!

		//int nummm = 3.14f; System.out.println(nummm);

		long lng = (long)3.14f;			System.out.println(lng);
			//출력결과 3(L)
			//(long)float 강제형변환

		
		int chr_to_int = 'A';			System.out.println(chr_to_int);
					//출력결과 65
		
		short chr_to_shrt = 'A';		System.out.println(chr_to_shrt);
					//출력결과 65
			
		char int_to_chr = 65;			System.out.println(int_to_chr);
					//출력결과 'A'
					//char 범위 안.

		char int_to_chr2 = 65536;		System.out.println(int_to_chr2);
					//에러!
					//char 범위 밖.

		char int_to_char3 = -10;	
					//에러!
					//char 범위 밖.
					

		int lng_to_int = (int)400L;		System.out.println(lng_to_int);
					//출력결과 400

		int lng_to_int2 = (int)2147483648L; System.out.println(lng_to_int2);
					//오버플로우!

		byte int_to_byte = (byte)128;		System.out.println(int_to_byte);
					//오버플로우!

	}
}
