class Return
{

	void return_nothing (int[] a){
		for (int i=0; i<a.length; ++i)
		{
			if (a[i] == 8){
				System.out.println("\nreturn at 8"); return;}
				//return statement
				//exit from a method, with or without value
			else
				System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) 
	{
		Return r = new Return();

		int[] arr = new int[5];
		
		System.out.println("testing out how return statement works");
		System.out.println("return when array[i]==8");
		for (int i=0; i<arr.length; ++i)
		{
			arr[i] += ((i+1)*2);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		r.return_nothing(arr);
		
		System.out.println("will it reach til here?");
		//a method with return statement won't affect main()
		
	}
}
