package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class copy_files_test {
    public static void main(String[] args) throws IOException {

        //一次读取一个数组的数据
        //C:\Users\Chris\Desktop\\uuu\\kun\\KUN.mp4

        FileInputStream fis=new FileInputStream("C:\\Users\\Chris\\Desktop\\\\uuu\\\\kun\\\\KUN.mp4");

        byte[] bytes=new byte[204800];
        int len = fis.read(bytes);
        System.out.println(len);
        String str=new String(bytes,0,len);//从0索引开始，len个长度
        System.out.println(str);
        fis.close();



    }

}
