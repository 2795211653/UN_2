package IO_floor;

import java.io.*;
import java.util.Arrays;

public class io_字符流 {
    public static void main(String[] args) throws IOException {

        //只针对文本文件夹

        //字符流
        //读取文件
        //C:\Users\Meg\Desktop\book
        //read解码后转换为10进制

        FileReader fr = new FileReader("C:\\Users\\Meg\\Desktop\\book\\1.txt");
        int b;
        while ((b = fr.read()) != -1) {
            System.out.print((char) b);
        }
        fr.close();

        System.out.println();
        System.out.println("========================================================");
        //带参的
        FileReader fr2 = new FileReader("C:\\Users\\Meg\\Desktop\\book\\1.txt");

        char[] chars = new char[2];
        int len;
        while ((len = fr2.read(chars)) != -1) {
            //new String(chars, 0, len)
            //把数组中的数据变成字符串再打印
            System.out.println(new String(chars, 0, len));
        }
        fr2.close();


        //写入本地文件
       /* File file=new File("C:\\Users\\Meg\\Desktop\\book\\2.txt");
        boolean b2 = file.createNewFile();
        System.out.println(b2);*/

        FileWriter fw=new FileWriter("C:\\Users\\Meg\\Desktop\\book\\2.txt",true);
        String[] strings1={"两三点开放时间覅饿哦危废物"};
        fw.write(Arrays.toString(strings1));
        fw.close();





    }
}
