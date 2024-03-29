class CalcMethod
{

/*----class field----*/

	int num = 1;


/*----class method()----*/

	public int calcSum(int a, int b){
		int result = a + b;
		return result;
	}

	public static int calcMinus(int a, int b){
		int result = a - b;
		return result;
	}

	public void score_void(int a){
		if (a>= 80)	System.out.println("A - return void");
	}

	public String score_string(int a){
		String str = "";
		if (a>= 80) str = "A - string variable";
		return str;
	}

	public String score_string2(int a){
		if (a>= 80) return "A - string literal";
		else return "below A - string literal";
	}

	public void printLoopSum (int[] temp) {
		int sum = 0;
		for(int i = 0; i<temp.length; ++i)
			sum += temp[i];
		System.out.println(sum);
	}


	public void no_args(){
		num++; // class variable
		System.out.println(num);
	}

	public static void main(String args[]){
		
		Calc_method c = new Calc_method();
		
		System.out.println(c.calcSum(1,2));
		System.out.println(calcMinus(4,2));

		c.score_void(80);

		System.out.println(c.score_string(80));
		System.out.println(c.score_string2(79));
	
		int[] arr = new int[5];
		for (int i=0; i<arr.length; ++i)
			arr[i]=1;

		c.printLoopSum(arr);

		c.no_args();
	}
}
