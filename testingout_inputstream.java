import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testingout_inputstream {
	public static void main(String[] args) {
		try{
			File file = new File("C:\\Users\\Youngin Lee\\Desktop\\Klepto\\2020\\2. 2盒扁\\ANSI.txt");
			//颇老 按眉 积己
			FileReader filereader = new FileReader(file);
			int singleCh = 0;
			while ((singleCh = filereader.read())!= -1){
				System.out.print((char)singleCh);
				if ((char)singleCh == 't')
					System.out.print('萍');
				if ((char)singleCh == 'l')
					System.out.print('郡');
			}
			System.out.print("\n\n\n");
			filereader.close();
		}catch (FileNotFoundException e){
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
