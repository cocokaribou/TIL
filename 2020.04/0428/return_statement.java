class return_statement 
{
	int a = 10;


	void return_nothing (int a){
		if (a<20)
			System.out.println("below 20");
		else
			return;
	}

	public static void main(String[] args) 
	{
		
		return_statement r = new return_statement();
		r.return_nothing(19);
	}
}
