package day0528;

import java.io.*;

public class StreamEx {
    public static void main(String[] args) {
        try(
            FileInputStream fis = new FileInputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0528\\fileinputstream.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0528\\copy_of_fileinputstream.txt");
//declare FileInputStream object within the try block
//it will close the iostream automatically
        ){
            int data =-1; //EOF
            while((data=fis.read())!= -1){
                System.out.print((char)data);
                fos.write(data);
            }
/*FileInputStream.read()
* Reads a byte of data from this input stream. This method blocks
* if no input is yet available.
*/
        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace();
        }
    
    }
}