import java.io.*;


public class testingout_inputstream {
	public static void main(String[] args) throws IOException{

//The main difference between FileReader and BufferedReader in Java is that 
//FileReader reads characters from a file while BufferedReader reads characters from another Reader.
//https://pediaa.com/what-is-the-difference-between-filereader-and-bufferedreader-in-java/
		
		BufferedReader reader;
		try{
			reader = new BufferedReader(new FileReader("/Users/Youngin Lee/Desktop/Klepto/2020/2. 2ºÐ±â/ANSI.txt"));

			//File(String pathname)
			//Creates a new File instance by converting the given pathname string into an abstract pathname.
			
			String line = reader.readLine();
			while (line != null){
				System.out.print(line);
				//read next line
				line = reader.readLine();
			}
			reader.close();
		}catch (FileNotFoundException e){
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
