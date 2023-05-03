package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_1 {
    public static void main(String[] args) throws IOException {
        //void write(int b)--------一次写一个字节数据
        //void write(byte[] b)-----一次写一个字节数组
        //void write(byte[] b,int off,int len)-----一次写一个数组的部分数据


        //C:\\Users\\Chris\\Desktop\\uuu
        FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Chris\\\\Desktop\\\\uuu\\1.txt");

        // fos.write(34);
        // fos.close();

        String[] arr = {"孙俪", "刘涛", "苗圃", "蒋欣", "杨紫", "乔欣", "谭松韵", "宋茜", "柳岩", "包文婧", "唐嫣", "杨幂", "迪丽热巴", "李小冉" };
        int[] arr2 = {1, 2, 3, 4, 5};
        byte[] bytes={34,44,54,64,74,89};
       // for (int i = 0; i < bytes.length; i++) {
            //fos.write(bytes[i]);
       // }
        fos.write(bytes,2,3);
        fos.close();

    }
}
