import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testingout_inputstream {
	public static void main(String[] args) {
		try{
			File file = new File("C:\\Users\\Youngin Lee\\Desktop\\Klepto\\2020\\2. 2�б�\\ANSI.txt");
			//���� ��ü ����
			FileReader filereader = new FileReader(file);
			int singleCh = 0;
			while ((singleCh = filereader.read())!= -1){
				System.out.print((char)singleCh);
				if ((char)singleCh == 't')
					System.out.print('Ƽ');
				if ((char)singleCh == 'l')
					System.out.print('��');
			}
			System.out.print("\n\n\n");
			filereader.close();
		}catch (FileNotFoundException e){
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
