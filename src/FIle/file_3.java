package FIle;

import java.io.File;
import java.io.IOException;

public class file_3 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile()-------------创建一个新的空文件夹
        //public boolean mkdir()---------------------创建单级文件夹
        //public boolean mkdirs()--------------------创建多级文件夹
        //public boolean delete()--------------------删除文件，空文件夹

        //C:\Users\Chris\Desktop\abc.txt
        File f1=new File("C:\\Users\\Chris\\Desktop\\aaa.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);
        System.out.println("=============================================");
        File f2=new File("C:\\Users\\Chris\\Desktop\\nnn");
        boolean c = f2.mkdir();
        System.out.println(c);
        System.out.println("===============================================");
        File f3=new File("C:\\Users\\Chris\\Desktop\\uuu");
        boolean m = f3.mkdirs();
        System.out.println(m);
        System.out.println("=================================================");
        File f4=new File("C:\\Users\\Chris\\Desktop\\uuu");
        boolean d = f4.delete();
        System.out.println(d);


    }
}
