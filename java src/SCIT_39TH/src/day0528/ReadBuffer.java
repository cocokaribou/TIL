package day0528;

import java.io.*;

/*
 * FileInputStream.read(byte[])
 * Reads up to <code>b.length</code> bytes of data from this input
 * stream into an array of bytes. This method blocks until some input
 * is available.
 *
 * @param      b   the buffer into which the data is read.
 * @return     the total number of bytes read into the buffer, or
 *             <code>-1</code> if there is no more data because the end of
 *             the file has been reached.
 * @exception  IOException  if an I/O error occurs.
 */

/*
 * FileOutputStream(byte b[], int off, int len)
 * Writes <code>len</code> bytes from the specified byte array
 * starting at offset <code>off</code> to this file output stream.
 *
 * @param      b     the data.
 * @param      off   the start offset in the data.
 * @param      len   the number of bytes to write.
 * @exception  IOException  if an I/O error occurs.
 */


public class ReadBuffer {
    public static void main(String[] args) {
        try(
            FileInputStream fis = new FileInputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0528\\fileinputstream.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Windows\\Java Quiz\\2020.05\\SCIT_39TH\\src\\day0528\\copy2.txt");
            ){
                byte[] buffer = new byte[500];
                int len = -1;

                while(true){
                    len = fis.read(buffer); //total number of bytes read into buffer
                    if(len == -1) break;
                    fos.write(buffer, 0, len);
                }

        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        }catch(IOException e2){
            e2.printStackTrace();
        }
}
}