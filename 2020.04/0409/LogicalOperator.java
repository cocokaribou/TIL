class LogicalOperator 
{
	public static void main(String[] args) 
	{
//		boolean l1 = true && true;
//		boolean l2 = true && false; //f
//		boolean l3 = false && true; //f
//		boolean l4 = false && false;
//		System.out.println(l1);
//		System.out.println(l2);
//		System.out.println(l3);
//		System.out.println(l4+"\n");
//
//		boolean n1 = true || true;
//		boolean n2 = true || false; //t
//		boolean n3 = false || true; //t
//		boolean n4 = false || false;
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4+"\n");
//
//		boolean i1 = true ^ true; //f
//		boolean i2 = true ^ false;
//		boolean i3 = false ^ true;
//		boolean i4 = false ^ false; //f
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
//		System.out.println(i4+"\n");
//
//		boolean o1 = !true; //f
//		boolean o2 = !false; //t
//		System.out.println(o1);
//		System.out.println(o2+"\n");
//
//		System.out.println(false || false || false || true); //true
		

		int a = 1, b = 3;
		int c = 0;

		System.out.println(true || (c+=b) == a); //true
		System.out.println(c); // 0, didn't calculate the second operand

		System.out.println(false && (c+=b) == a); //false
		System.out.println(c); // 0, didn't calculate the second operand

// t || ...
// f && ...

		System.out.println(false || (c+=b) == a); //false
		System.out.println(c); // 3

		System.out.println(false || (c+=b) != a); //true
		System.out.println(c); // 6





//		int avg = 70;
//		String result = avg < 80 ? "fail" : "pass";
//		System.out.println("test result: "+result);

	}
}
