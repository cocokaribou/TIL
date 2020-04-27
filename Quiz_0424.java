import java.util.*; //Random Å¬·¡½º

class Quiz_0424 
{
	public static void main(String[] args) 
	{


//1.
//print every array elements of two dimensional array.

//		int[][] arr = {{10,20,30}, {40,50,60}};
//
//		for(int i=0; i<arr.length; ++i){
//			for (int j=0; j<arr[i].length; ++j)
//				System.out.print(arr[i][j]+" ");
//			System.out.println();
//		}


//2.
//generate a random number between 1~10 and print it.

//		Random rd = new Random();
//		int rand_int = rd.nextInt(10)+1;
//		System.out.println(rand_int);


//3.
//print out of {10, 20, 30, 40, 50} at random.

//		int[] arr = {10, 20, 30, 40, 50}; //[0][1][2][3][4]
//		int indx = rd.nextInt(5);
//		System.out.println(arr[indx]);


//4.
//number guessing game1.

//generate random number between 1~50.
//read a input number from a user.
//if (random number > input) print "Up"
//if (random number < input) print "Down"
//if (random number == input) print "Good!" and exit the program.


//		Random rd = new Random();
//
//		int rand = rd.nextInt(50)+1;
//
//		Scanner sc = new Scanner(System.in);
//
//
//		System.out.println("guess the number between 1~50");
//		while (true)
//		{
//			System.out.print("input number: ");
//			int input = sc.nextInt();
//			
//			if (input == rand) break;
//			else if (input < rand)
//				System.out.println("Up");
//			else
//				System.out.println("Down");
//		}
//		System.out.println("Good!");
//		return;
//

//5.
//number guessing game2.
//user sets the number of tries.

//generate random number between 1~50.
//read a input number from a user.
//if (random number > input) print "Up"
//if (random number < input) print "Down"
//if (random number == input) print number of attempts then exit the program.

//if the user didn't get the right answer within their tries,
//print "sorry, all trials are done!" then exit the program.

//
		Random rd = new Random();

		int rand = rd.nextInt(50)+1;

		Scanner sc = new Scanner(System.in);

		System.out.println("guess the number between 1~50");
		System.out.print("set the number of tries: ");
		int input = sc.nextInt();
		
		int[] array= new int[input];

		for (int i =0; i<input; ++i)
		{
			System.out.print("input number: (attempt no."+(i+1)+") :");
			array[i] = sc.nextInt();

			
//tell if the input value is out of range.
//continue statement so you can count the attempt and carry on.
			if (array[i] > 50 || array[i] < 1){ System.out.println("Wrong input!"); continue;}
			if (array[i] == rand){
				System.out.println("correct!");
				System.out.println("number of attempts: "+(i+1));
				System.out.println("--list of input numbers--");
				for (int j=0; j<=i; ++j)
					System.out.println(array[j]);
				return;
			}
			else if (array[i] < rand)
				System.out.println("Up");
			else
				System.out.println("Down");
		}System.out.println("sorry, all trials are done!");
		return;

//if you don't want to print "Up" or "Down" before printing "every trials are done",
//change for-loop to while-loop so you can tell if (input_try>count)

	}
}
