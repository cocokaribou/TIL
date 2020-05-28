package day0527;

import java.io.*;

public class Stream2 {
    public static void main(String[] args) {
        FileReader fis = null;
        try{
            fis = new FileReader("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0527\\filereader.txt"); //should be two of this \\
            int data;
            while((data=fis.read())!= -1){ //if FileInputStream reads EOF
                System.out.print((char)data);
            }
/*FileReader.read()
* Reads characters into a portion of an array. 
* (2 bytes)
*/
        }catch(FileNotFoundException e1){ //FileReader(String)
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace(); //read()
        }finally{
            try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    
    }
}