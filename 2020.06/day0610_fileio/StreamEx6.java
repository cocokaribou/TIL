import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamEx6 {
	
	public static Human getFile() {
		Human h = null;
		
		try (
				FileInputStream fis = new FileInputStream("C:/Windows/Java Quiz/2020.06/day0610_fileio/data.bak");
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
			h = (Human)ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return h;
	}
	
	public static void setFile(Human h) {
		try (
				FileOutputStream fos = new FileOutputStream("C:/Windows/Java Quiz/2020.06/day0610_fileio/data.bak");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			oos.writeObject(h);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Human h = new Human("LEE", 22);
		
		setFile(h);	// Human 객체를 파일로 저장
		Human temp = getFile();	// 위에서 저장한 파일로부터 Human 객체의 정보를 읽어와 temp 변수에 대입
		System.out.println(temp);	// Human 객체의 정보를 출력
	}
}
