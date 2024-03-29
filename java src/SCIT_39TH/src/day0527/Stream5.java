package day0527;

import java.io.*;

public class Stream5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
    
        try{
            fis = new FileInputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0527\\fileinputstream.txt"); //should be two of this \\
            fos = new FileOutputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0527\\copy_filoutputstream.txt");
            int data;
            while((data=fis.read())!= -1){
                System.out.print((char)data);
                fos.write(data);
            }

        }catch(FileNotFoundException e1){ //FileInputStream(String)
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace(); //read()
        }finally{
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
