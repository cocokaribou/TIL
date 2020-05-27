package day0527;

import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try{
            int ch = System.in.read();
            System.out.println((char)ch);
            System.in.close();
        }catch(IOException x){
            x.printStackTrace();
        }
//InputStream.read();
/* Reads some number of bytes from the input stream and stores them into
* the buffer array <code>b</code>. The number of bytes actually read is
* returned as an integer.
* This method blocks until input data is
* available, end of file is detected, or an exception is thrown.
*/

//can't read unicode cjk because they are 2 bytes

        while(true){
            try{
                int ch = System.in.read();
                if(ch=='\r') break;
                System.out.println((char)ch);
            }catch(IOException x){
                x.printStackTrace();
            }
        }


    }
}