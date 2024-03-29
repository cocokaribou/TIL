class Person
{
/*---class field---*/
	String name;
	int age;
	String gender;
	String occupation;


/*---constructor list---*/
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


/*using this. keyword when assigining value to instance variable*/
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
//'this' refers to class Object
//The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.
//https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html


/*---class method() list---*/
	public void print_info(){
		System.out.println("The name is "+name+", "+age+" years old, "+gender+", working as a(n) "+occupation);
	}
	//passing class Object to method()
}
