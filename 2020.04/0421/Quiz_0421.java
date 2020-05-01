import java.util.*;

class Quiz_0421 
{
	public static void main(String[] args) 
	{

//1.
//read a integer from a user and print its divisor. 
//12 -> 2 3 4 6

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("divisor calculator");
//		System.out.print("input integer num: ");
//		int num = sc.nextInt();
//
//		for (int i=1; i<=num; i++)
//		{
//			int a = num % i;
//			if (a == 0)
//				System.out.print(i+" ");
//		}

//1-1.
//use while loop.

//		int a=1;
//		while (a<=num)
//		{
//			if(num%a==0) System.out.print(a+" ");
//			a++;
//		}



//2.
//read two integers from a user and print the sum of numbers between n1~n2 (inclusive)

//		Scanner sc = new Scanner(System.in);
//		System.out.println("calculate the sum of numbers between n1~n2");
//
//		System.out.print("input integer n1: ");
//		int num1 = sc.nextInt();
//		System.out.print("input integer n2: ");
//		int num2 = sc.nextInt();
//		
//		int total = 0;
//
//		if (num1>num2){
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}	
//
//		for (int i=num1; i<=num2; i++)
//		{
//			total += i;
//		}System.out.print("The sum of "+num1+" ~ "+num2+": "+total+"\n");
//
//


//3.
//sum every integers starting from 1 and break the loop when the sum is over 5000.

//		int total = 0;
//		int i = 1;
//		while (total < 5000)
//		{
//			total += i;
//			i++;
//		}System.out.println("The sum of numbers between 1 ~ "+i+": "+total);



//4. 
//roll the dice and find every combination that makes 6.

//		for (int i=1; i<=6; i++)
//		{
//			for (int j=1; j<=6; j++)
//				if (i+j==6) System.out.println(i+", "+j);
//		}
//
//nested for-loop: either decrement or increment operator works just fine.


//if you were to use only one for-loop:
//
//		for (int i=1; i<=5; ++i)
//		{
//			int temp = 6-i;
//			System.out.println(i+", "+temp);
//		}




//5.
//exchange rate calculator
//1000 won = 0.82 dollar = 88.24 yen = 0.78 euro.
//(input>0)

		Scanner sc = new Scanner(System.in);

		System.out.println("currency exchanger from won to dollar/yen/euro");
		System.out.print("input won : ");
		
		int won = sc.nextInt();
		
		double dollar = won * 0.00082;
		double yen = won * 0.08824;
		double euro = won * 0.00078;

//or
//		int input = sc.nextInt();
//
//		double won = 1000;
//		double dollar = 0.82;
//		double yen = 88.24;
//		double euro = 0.78;
//		
//by declaring variables this way it is much more easier to adjust the exchange rate.


		if (won<0)
			System.out.println("wrong input!");
		else{
			System.out.print("choose the currency (1: dollar, 2: yen, 3: euro) : ");
			int select = sc.nextInt();
		
			if (select <1 || select >3)
				System.out.println("wrong input!");
			else{
				System.out.print(won+" won = ");
				switch (select)
				{
				case 1:
					System.out.println(dollar+" dollar");
					break;
			
				case 2:
					System.out.println(yen+" yen");
					break;

				case 3:
					System.out.println(euro+" euro");
					break;			
				}
			}
		}



//6.
//swapping variable values


//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("input num1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("input num2 : ");
//		int num2 = sc.nextInt();
//
//		System.out.println("\n---before---");
//		System.out.println("value of num1 : "+num1);
//		System.out.println("value of num2 : "+num2+"\n");
//
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//
//		System.out.println("---after---");
//		System.out.println("value of num1 : "+num1);
//		System.out.println("value of num2 : "+num2);



//7.
//read a 4 digit birthyear from a user and print their chinese zodiac.

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("input your birthyear: ");
//		int birth_year = sc.nextInt();
//
//		String zodiac ="";
//
//
//		switch(birth_year % 12)
//		{
//			case 0:
//				zodiac = "Monkey";
//				break;
//			case 1:
//				zodiac = "Rooster";
//				break;
//			case 2:
//				zodiac = "Dog";
//				break;
//			case 3:
//				zodiac = "Pig";
//				break;
//			case 4:
//				zodiac = "Rat";
//				break;
//			case 5:
//				zodiac = "Ox";
//				break;
//			case 6:
//				zodiac = "Tiger";
//				break;
//			case 7:
//				zodiac = "Rabbit";
//				break;
//			case 8:
//				zodiac = "Dragon";
//				break;
//			case 9:
//				zodiac = "Snake";
//				break;
//			case 10:
//				zodiac = "Horse";
//				break;
//			case 11:
//				zodiac = "Sheep";
//				break;
//		}System.out.println(birth_year+" born, your chinese zodiac is "+zodiac);
////
////print String out side of the switch statement.
////try to separate functions for a better code readability.



//8.
//read integers from a user.
//if (input == 0)
//    break the loop and print the number of multiples of 3 that has been input.
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("printing the number of multiples of 3");
//		int num = 1;
//		int triple_count = 0;
//
//		while (num != 0)
//		{
//			System.out.print("input integer: (exit:0) ");
//			num = sc.nextInt();
//			if (num%3==0 && num!=0)
//				triple_count++;
//		}System.out.println("\nthe number of multiples of 3 : "+triple_count);

//while(true){
//....if (num==0) break;
//....if (num%3==0) count++;}


	}
}
