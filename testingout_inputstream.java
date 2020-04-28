import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testingout_inputstream {
	public static void main(String[] args) {
		try{
			File file = new File("C:\\Users\\Youngin Lee\\Desktop\\Klepto\\2020\\2. 2분기\\ANSI.txt");
			//create File Object
			FileReader filereader = new FileReader(file);
			int singleCh = 0;
			while ((singleCh = filereader.read())!= -1){
				System.out.print((char)singleCh);
			}
			System.out.print("\n\n\n");
			filereader.close();
		}catch (FileNotFoundException e){
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
