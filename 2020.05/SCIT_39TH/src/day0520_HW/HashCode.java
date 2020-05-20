package day0520_HW;

public class HashCode {
	
	
	public static void main(String[] args) {
		
		Human h1 = new Human(24, "LEE");
		Human h2 = new Human(24, "LEE");
		
//overridden method equals()
//compares field of object (contents)
		if(h1.equals(h2)) System.out.println("two equal objects (by equal it means they have the same instance values)");
		else System.out.println("two different objects");
		
		System.out.println(System.identityHashCode(h1)); 
		System.out.println(System.identityHashCode(h2)); 
		//two different hash code identities
		
		

		h1.hashCode();
		
		//You have to override equals() method in order to compare the contents of two objects
		//or else it will compare hash code of the objects
		
		
	}

}
