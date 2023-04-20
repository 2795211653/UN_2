package FIle;

import java.io.File;

public class file_1 {
    public static void main(String[] args) {
        //public File(String pathname)          根据文件路径创建文件对象
        //public File(String parent,String chile)    根据父路径字符串和子路径字符串创建文件对象
        //public File(File parent,String child)      根据父路径对应的文件对象和子路径对应的字符串创建文件对象

        //C:\Users\Chris\Desktop
        String str="C:\\Users\\Chris\\Desktop\\a.txt";
        File file=new File(str);
        System.out.println(file);

        //父路径：C:\Users\Chris\Desktop
        //子路径：a.txt
        String parent="C:\\Users\\Chris\\Desktop";
        String child="a.txt";
        File f2=new File(parent,child);
        System.out.println(f2);






    }
}
