class TypeCasting
{
	public static void main(String[] args) 
	{		
		float flt = 999999999999999L;
		System.out.println(flt); 
			//9.9999999E14
			//long to float auto type conversion


		//long lng = 3.14f;
		//System.out.println(lng);
			//error!

		//int nummm = 3.14f; System.out.println(nummm);

		long lng = (long)3.14f;			System.out.println(lng);
			//3(L)
			//(long)float cast

		
		int chr_to_int = 'A';			System.out.println(chr_to_int);
					//65
		
		short chr_to_shrt = 'A';		System.out.println(chr_to_shrt);
					//65
			
		char int_to_chr = 65;			System.out.println(int_to_chr);
					//'A'

		char ansi_1 = 125;			System.out.println(ansi_1);
		char ansi_2 = 126;			System.out.println(ansi_2);
		char ansi_3 = 127;			System.out.println(ansi_3);
		char ansi_4 = 128;			System.out.println(ansi_4);

		char ansi_5 = 255;			System.out.println(ansi_5);
		char ansi_6 = 256;			System.out.println(ansi_6);
		char ansi_7 = 257;			System.out.println(ansi_7);

//		char int_to_chr2 = 65536;		System.out.println(int_to_chr2);
//					//error!
//					//beyond char range

//		char int_to_char3 = -11;	
//					//error!
//					//below char range
					

		int lng_to_int = (int)400L;		System.out.println(lng_to_int);
					//400

		int lng_to_int2 = (int)2147483648L; System.out.println(lng_to_int2);
					//overflow!
					//-2147483648

		byte int_to_byte = (byte)128;		System.out.println(int_to_byte);
					//overflow!
					//-128

	}
}
