class Person
{
/*---class field---*/
	String name;
	int age;
	String gender;
	String occupation;


/*---constructor list---*/
//How to declare a constructor:
//
//	access-modifier classname(parameter list) {
//		initialize class field variables
//	}

//if you don't declare any constructor, compiler will auto-generate it.
//default constructor without any arguments, nullary constructor.

//difference between constructor vs method():
// 1. constructor doesn't return any value
// 2. constructor is called only once when you make an instance via new keyword

//why would you need an access-modifier when declaring constructor?:
//"there's something called singleton design pattern, that's when you declare your constructor private"


	public Person(String a, int b, String c, String d) {
		name = a;
		age = b;
		gender = c;
		occupation = d;
	}

/*constructor overload*/

	public Person(String a, String c){
		name = a;
		gender = c;
	}


/*using this. keyword with a field*/
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
//'this' refers to class Object
//The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.
//https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html



/*---class method() list---*/
	public void print_info(Person p){
		System.out.println("The name is "+name+", "+age+" years old, "+gender+", working as a(n) "+occupation);
	}
	//passing class Object to method()
}



/*---main()---*/
class Constructor_0429 
{
	public static void main(String[] args) 
	{
		Person p0 = new Person("Kim",53,"female","CEO");
		p0.print_info(p0);

		Person p1 = new Person("Lee","male");
		p1.print_info(p1);

		Person p2 = new Person("Yoon", 30);
		p2.print_info(p2);

//make an array of class Objects
		Person[] p3 = new Person[100];
		p3[0] = p0;
		p3[1] = p1;
		p3[2] = p2;
//how do I initialize Object array with loop?
//the array elements has to be exisiting objects such as p0, p1 in this code.
//ain't got no time to do this manually


//		Person[] arr = new Person[2];
//		for (int i=0; i<arr.length; ++i)
//		{
//			arr[i] = p+i;
//			arr[i].print_info(arr[i]);
//		}
//obviously this doesn't work. p+i won't be translated to p0

	}
}
