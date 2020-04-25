class LogicalOperator 
{
	public static void main(String[] args) 
	{
		boolean l1 = true && true;
		boolean l2 = true && false; //f
		boolean l3 = false && true; //f
		boolean l4 = false && false;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.printf(l4+"%n%n");

		boolean n1 = true || true;
		boolean n2 = true || false; //t
		boolean n3 = false || true; //t
		boolean n4 = false || false;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.printf(n4+"%n%n");

		boolean i1 = true ^ true; //f
		boolean i2 = true ^ false;
		boolean i3 = false ^ true;
		boolean i4 = false ^ false; //f
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.printf(i4+"%n%n");

		boolean o1 = !true; //f
		boolean o2 = !false; //t
		System.out.println(o1);
		System.out.printf(o2+"%n%n");

		int a = 10, b = 5;
		a += b;
		System.out.println(a);
		System.out.println(a %= b);
		System.out.printf(a+"%n%n");

		System.out.println(false || false || false || true);
		System.out.printf("%n");

		int avg = 70;
		String result = avg < 80 ? "불합격" : "합격";
		System.out.println(result);

		    int num = 0;
		System.out.println(num += 1);
		System.out.println(num += 2);
		System.out.println(num += 3);
		System.out.println(num += 4);
		System.out.println(num += 5);
		System.out.println(num += 6);
		System.out.println(num += 7);
		System.out.println(num += 8);
		System.out.println(num += 9);
		System.out.println(num += 10);
	}
}
