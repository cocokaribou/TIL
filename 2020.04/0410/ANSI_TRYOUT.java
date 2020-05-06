class ANSI_TRYOUT 
{
	public static void main(String[] args) 
	{
		char chr33 = 33;
		char chr255 = 255;
		System.out.println(chr33);
		System.out.println(chr255);

		char chr123 = 123;
		System.out.println(chr123);

		char chr126 = 126;
		System.out.println(chr126+"\n");

		char chr127 = 127;
		System.out.println(chr127);

		char chr128 = 128;
		System.out.println(chr128);	
		
		char chr130 = 130;
		System.out.println(chr130);

		char chr131 = 131;
		System.out.println(chr131);

		char chr_hnn = '\u3042';
		System.out.println(chr_hnn); //кв

		char chr_kyuu = '\uD024';
		System.out.println(chr_kyuu); //│Ш


		//Unmappable character for encoding MS949 it says
		//how do I solve this problem
	}
}
