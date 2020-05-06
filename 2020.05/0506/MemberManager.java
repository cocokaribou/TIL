class MemberManager 
{
	Members[] memberArr = new Members[1000];
	int counter=0;

	void insertInfo(String id, String password, String name){
			memberArr[counter] = new Members(id, password, name);
			counter++;
	}

	void printInfo(){
		if (counter == 0){
			System.out.println("no Member has been registered yet!");
			return;
		}
		for (int i = 0; i<counter; ++i)
		{
			System.out.println("ID : "+memberArr[i].id);
			System.out.println("PW : "+memberArr[i].password);
			System.out.println("NAME : "+memberArr[i].name);
		}
	}
}
