import java.util.Scanner;	
class Quiz_0413
{
	public static void main(String[] args) 
	{

//BMI Calculator
		Scanner scnr = new Scanner(System.in);
		System.out.println("BMI Calculator");
		
		System.out.print("Input height(m) : ");
		double height = scnr.nextDouble();
		
		System.out.print("Input weight(kg) : ");
		double weight = scnr.nextDouble();
		
		double bmi = weight/(height*height);
		if (bmi <= 18.5)
			System.out.println("Underweight");
		else if (bmi <= 25)
			System.out.println("Healthy");
		else if (bmi <= 30)
			System.out.println("Overweight");
		else if (bmi <= 40)
			System.out.println("Obese");
		else
			System.out.println("Extreme obese");

		scnr.close();
	}
}
