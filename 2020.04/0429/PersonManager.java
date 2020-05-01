class PersonManager
{
/*---class variable---*/
	Person[] arr = new Person[100];
	int count = 0;

	//initialize counter value in field instead of using for-loop in the method

/*---method--*/

/*---insertPerson() initialize array with input values---*/
	public void insertPerson(String name, int age, String gender, String occupation){
		Person p = new Person(name, age, gender, occupation);
		arr[count] = p;
		count++;
	}

/*---printInfo() print out Person information---*/
	public void printInfo() {
		if (count == 0)
		{
			System.out.println("no Member has been registered");
			return;
		}
		for(int i=0; i<count; ++i){
			if ((arr[i])!= null) {
				System.out.println(arr[i].name);
				System.out.println(arr[i].age);
				System.out.println(arr[i].gender);
				System.out.println(arr[i].occupation);
				System.out.println();
				
		}
	}
}
}
