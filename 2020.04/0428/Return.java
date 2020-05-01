class Return
{

	void return_nothing (int[] a){
		for (int i=0; i<a.length; ++i)
		{
			if (a[i] == 8){
				System.out.println("return at 8"); return;}
			else
				System.out.print("!8 ");
		}
	}

	public static void main(String[] args) 
	{
		Return r = new Return();

		int[] arr = new int[5];

		for (int i=0; i<arr.length; ++i)
		{
			arr[i] += ((i+1)*2);
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		r.return_nothing(arr);
		
		System.out.println("will this statement work?");
		
	}
}
