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

//how do I initialize class type array with loop?
//ain't got no time to do this manually


//use class method()
	
//	Person[] p4 = new Person[100];
//	int counter = 0; //for the loop
//
//	void insertInfo(String name, int age, String gender){
//		p4[i] = new Person(name, age, gender);
//		counter++;
//	}

	}
}
