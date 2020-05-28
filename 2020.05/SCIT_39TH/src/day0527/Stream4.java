package day0527;

import java.io.*;

public class Stream4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0527\\fileinputstream.txt"); //should be two of this \\
            int data;
            while((data=fis.read())!= -1){
                System.out.print((char)data);
            }
/*FileInputStream.read()
* Reads a byte of data from this input stream. This method blocks
* if no input is yet available.
*/
        }catch(FileNotFoundException e1){ //FileInputStream(String)
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