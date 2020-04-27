class	Calc_method
{

//class field

	int num = 1;


//class method()


/*How to define method

	modifier return-type method-name(parameter list){
			..body of the method..
			return value;
		}
*/


	public int calcSum(int a, int b){
		int result = a + b;
		return result;
	}

//return-type int
//"<identifier> expected."
//create a class Object in order to call a class method




	public static int calcMinus(int a, int b){
		int result = a - b;
		return result;
	}

//return-type int
//static method



	public void score_void(int a){
		if (a>= 80)	System.out.println("A - return void");
	}

//return-type void



	public String score_string(int a){
		String str = "";
		if (a>= 80) str = "A - string variable";
		return str;
	}

//return-type String



	public String score_string2(int a){
		if (a>= 80) return "A - string literal";
		else return "below A - string literal";
	}
//return-type String
//"missing return statement"
//if you were to return literal and set the return condition,
//define every possible cases.
//for example, if statement alone without any following else-if won't work.



	public void printLoopSum (int[] temp) {
		int sum = 0;
		for(int i = 0; i<temp.length; ++i)
			sum += temp[i];
		System.out.println(sum);
	}

//return-type void
//array as a function argument



	public void no_args(){
		//class field
		//int num = 1;
		num++;
		System.out.println(num);
	}

//when there's no f(x) arguments
//you can use call field variables in the method




	public static void main(String args[]){
		
//creating class Object
		Calc_method c = new Calc_method();
		

//static vs non-static method
		System.out.println(c.calcSum(1,2));
		System.out.println(calcMinus(4,2));


//return-type void
		c.score_void(80);


//return-type String f(x) should be put in print argument
//or else nothing will appear on the console

		System.out.println(c.score_string(80));
		System.out.println(c.score_string2(79));
	
		int[] arr = new int[5];
		for (int i=0; i<arr.length; ++i)
			arr[i]=1;


//parameter: array variable
		c.printLoopSum(arr);

//parameter: void
		c.no_args();

	}

}
