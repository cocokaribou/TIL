class printingstarsEx 
{
	public static void main(String[] args) 
	{
//*
//**
//***
//****
//*****
//		for (int i=1; i<=4; i++)
//		{
//			for (int j=0; j<i; j++)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}


//    *
//   **
//  ***
// ****
//
//		for (int i=0; i<4; i++)
//		{
//			for (int j=3; j>i; j--)
//			{
//				System.out.print(" ");
//			}
//			for (int k=0; k<=i; k++)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}

//		for (int i=1; i<=4; i++)
//		{
//			for (int j=4; j>=1; j--){
//				if (j > i) System.out.print(" ");
//				else System.out.print("*");
//			}
//		System.out.println();
//		}



//*****
//****
//***
//**
//*
//		for (int i=0; i<5; i++)
//		{
//			System.out.print(i);
//			for (int j=5; j>i; j--)
//			{
//				System.out.print("*");
//			}System.out.println();
//		}


//2*1=2 3*1=3 4*1=4 ... 9*1=9 \n
//2*2=4 3*2=6 4*2=8 ... 9*2=18 \n
//..
//2*9=18 3*9=27 4*9=36 ... 9*9=81; 

		for(int i=1; i<10; i++)
		{
			for (int j=2; j<10; j++)// j * i = (ji)
			{
				System.out.print(j+"x"+i+"="+(j*i)+"\t"); //j(2~9) * i = (j*i)
			}System.out.println(); //next line and i++
		}
		System.out.println(); //break for loop and next line




//2*1=2
//2*2=4
//2*3=6
//2*4=8
//2*5=10
//3*6=18
//3*7=21
//3*8=24
//3*9=27
//4*1=4
//...
//		for (int i=2; i<10; i++) //i * j = (i*j)
//		{
//			for (int j=1; j<10; j++)
//			{
//				if (i%2==0)		//if i is an even number : j = 1~5
//					if (j>5) continue;
//				else			//if i is an odd number : j = 6~9
//					if (j<=5) continue;
//				System.out.println(i+"x"+j+"="+(i*j));
//			}
//		}



	}
}
