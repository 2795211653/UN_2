package FIle;

import java.io.File;

public class file_2 {
    public static void main(String[] args) {
        //public boolean isDirectory()---------------------判断路径名表示的file是否为文件夹
        //public boolean isFile()--------------------------判断路径名表示的file是否为文件
        //public boolean exists()--------------------------此路径的file文件是否存在

        //C:\Users\Chris\Desktop\abc.txt
        File  f1=new File("C:\\Users\\Chris\\Desktop\\abc.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("=================================================================" );

        //length----------------------返回文件大小
        File f2=new File("C:\\Users\\Chris\\Desktop\\abc.txt");
        System.out.println("文件大小："+f2.length()+"字节");
        System.out.println("=================================================================");

        //getAbsolutPath-----------返回绝对路径
        //getPath------------------相对路径
        //lastModified-------------返回文件的最后修改时间
        File f3=new File("C:\\Users\\Chris\\Desktop\\abc.txt");
        System.out.println(f3.getAbsoluteFile());
        System.out.println(f3.getPath());
        System.out.println(f3.getName());
        System.out.println(f3.lastModified());
        System.out.println("===================================================================");



    }
}
