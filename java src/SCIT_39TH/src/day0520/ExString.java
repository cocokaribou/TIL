package day0520;

public class ExString {

	public static void main(String[] args) {
		
//String methods
//.length()
		String st1 = "aBcD000";
		System.out.println(st1.length());
		System.out.println();
		
//.indexOf(String str);
		String st2 = "abcdecg";
		System.out.println(st2.indexOf("c"));
		//Returns the index within this string of the first occurrence of the specified substring.
		//returns only one value, which is one index integer.
		//if there's no matching String, it returns -1		
		
		System.out.println();
		
//.indexOf(String str, int fromindex)
		System.out.println(st2.indexOf("c", 3)); 
		//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index

		System.out.println();
		
//.charAt(int index)
		char c = st2.charAt(0);
		System.out.println(c); //a
		
		System.out.println();
		
//.compareTo(String anotherstring)
		String st3 = "b";
		String st4 = "a";
		
		int num = st3.compareTo(st4);
		//Compares two strings lexicographically.
		System.out.println(num); //"b".compareTo("a"); = 1
		
		System.out.println();

//.trim() 
		String st5 = " trimming the  space  ";
		System.out.println(st5);
		System.out.println(System.identityHashCode(st5)); //99347477
		
		st5 = st5.trim();
		System.out.println(st5); //trimmed String
		System.out.println(System.identityHashCode(st5)); //566034357 new String instance
		
		//Returns a copy of the string, with leading and trailing whitespace omitted.
		
		System.out.println();
		
		
//.replace(CharSequence target, CharSequence replacement))
		String st6 = "abcdefgh";
		st6.replace("a", "b");		
		System.out.println(st6);
		System.out.println(System.identityHashCode(st6));
		
		System.out.println();
		
//.substring(int, int)
//substring(int beginIndex, int endIndex-1)
//Returns a new string that is a substring of this string.
		
		String st7 = "1424a5";
		System.out.println(st7);
		System.out.println(System.identityHashCode(st7));
		st7 = st7.substring(2, 5); //arr[2]~arr[4]
		System.out.println(st7);
		System.out.println(System.identityHashCode(st7));
		
		System.out.println();
		
//.insert(),.append(), .deleteCharAt()
		
		StringBuffer sb = new StringBuffer("abcde");
		sb.insert(1, "★"); //"a★bcde"
		sb.append("★"); //"a★bcde★"
		sb.deleteCharAt(3); //"a★bde★"
		System.out.println(sb);
		
		
//.split(String regex)
//Splits this string around matches of the given regular expression.
//returns String[]
		
		String st8 = "abc123";
		String[] arr1 = st8.split(""); //{"a", "b", "c", "1", "2", "3"};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = st8.split("c"); //{"ab", "123"}
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
//Strings are constant; their values cannot be changed after they are created. 
//String buffers support mutable strings. 
//Because String objects are immutable they can be shared.
		
		
	}

}
