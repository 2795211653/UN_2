package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_2_writeContinue {
    public static void main(String[] args) throws IOException {

        //续写
        //C:\\Users\\Chris\\Desktop\\uuu
        //Windows：\r\n------回车换行
        FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Chris\\\\Desktop\\\\uuu\\1.txt");

        String str="速度快改好了你烦死了打卡估计双打卡v小计双打卡估计下菩萨的开发江西";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        //换行写
        String str3="\r\n";
        byte[] bytes2 = str3.getBytes();
        fos.write(bytes2);


        String str2="开始来得及覅上课的冷风机";
        byte[] bytes1 = str2.getBytes();
        fos.write(bytes1);

        //续写：打开续写开关即可
        //开关位置：创建对象的第二个参数
        //手动传递true：表示打开续写


        FileOutputStream fos1=new FileOutputStream("C:\\\\Users\\\\Chris\\\\Desktop\\\\uuu\\1.txt",true);

        String str4="速度快改好了你烦死了打卡估计双打卡v小计双打卡估计下菩萨的开发江西";
        byte[] bytes4 = str4.getBytes();
        fos1.write(bytes4);


        fos.close();




    }
}
