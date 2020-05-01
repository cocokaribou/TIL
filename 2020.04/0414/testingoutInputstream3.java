import java.util.Scanner;
import java.io.IOException;
import java.io.File;

class testingoutInputstream3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in(new File("yoyo.txt")));
		while (sc.hasNextLong()) {
        long aLong = sc.nextLong();
      }
	}
}
