package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_files {
    public static void main(String[] args) throws IOException {

        //C:\Users\Chris\Desktop\\uuu\\kun\\KUN.mp4
        //C:\Users\Chris\Desktop\\uuu\copy_kun

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\Chris\\Desktop\\\\uuu\\\\kun\\\\KUN.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Chris\\Desktop\\\\uuu\\\\copy.mp4");

        int b;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((b = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, b);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");


    }
}
