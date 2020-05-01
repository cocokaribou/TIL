class ForEx2 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.print("  <i"+i+">\n");
			for (int j = 1; j<=6; j++)
				System.out.print("j"+j+"\t"); 
				// j = {1,2,3,4,5,6,7,8,9,10}
				// 10바퀴 돌아서 j 출력
			System.out.print("\n");
		}
	}
}
