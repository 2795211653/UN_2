package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class io_input_utf {
    public static void main(String[] args) throws IOException {


        //C:\Users\Chris\Desktop\\uuu\\1.txt
        FileInputStream fis=new FileInputStream("C:\\Users\\Chris\\Desktop\\\\uuu\\\\1.txt");

        int b;
        while((b=fis.read()) !=-1){
            System.out.print((char) b);
        }
        fis.close();


    }
}
