package IO_floor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_加密_解密 {
    public static void main(String[] args) throws IOException {
        //^:异或
        //俩边相同：false
        //俩边不同：true

        FileInputStream fis=new FileInputStream("C:\\Users\\Meg\\Desktop\\book\\a\\test.jpg");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Meg\\Desktop\\book\\ency.jpg");

        int len;
        while((len=fis.read())!=-1){
            fos.write(len^2);
        }
        fos.close();
        fis.close();






    }
}
