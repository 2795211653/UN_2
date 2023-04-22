package FIle;


import java.io.File;
import java.io.IOException;

public class text_1 {
    public static void main(String[] args) throws IOException {
        //在aaa文件夹中创建a.txt文件
        File f1=new File("C:\\Users\\Chris\\Desktop\\uuu\\xxx.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);
    }
}
