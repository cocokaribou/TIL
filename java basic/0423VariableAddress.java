import java.util.*;

class VariableAddress
{
	public static void main(String[] args) 
	{

		//memory address of reference variables

		String[] str = new String[1];
		String[] str1 = new String[1];
		String[] str2 = new String[2];
		String[] str3 = new String[3];

		System.out.println(str); //[Ljava.lang.String;@15db9742
		System.out.println(str1); //[Ljava.lang.String;@6d06d69c
		System.out.println(str2); //[Ljava.lang.String;@7852e922
		System.out.println(str3); //[Ljava.lang.String;@4e25154f

		boolean[] boolarr = new boolean[2];
		int[] intarr = new int[100];
		char[] chararr = new char[100];
		long[] longarr = new long[2];

		System.out.println(boolarr); //[Z@70dea4e
		System.out.println(intarr); //[I@5c647e05
		System.out.println(chararr); // 
		System.out.println(longarr); //[J@33909752



/*
That is the class name and System.identityHashCode() separated by the '@' character. 
What the identity hash code represents is implementation-specific. 
It often is the initial memory address of the object, but the object can be moved in memory by the VM over time. 
So (briefly) you can't rely on it being anything.

Getting the memory addresses of variables is meaningless within Java, since the JVM is at liberty to implement objects and move them as it seems fit (your objects may/will move around during garbage collection etc.)


https://stackoverflow.com/questions/1961146/memory-address-of-variables-in-java
*/
	}
}
