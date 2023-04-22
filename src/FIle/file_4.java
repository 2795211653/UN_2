package FIle;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class file_4 {
    public static void main(String[] args) throws IOException {

        //public File[] listFiles()----------------获取当前路径下的所有内容
        //public static File[] listRoots()---------列出可用文件系统根
        //public String[] list()-------------------获取当前路径下的所有内容
        //public String[] list(FilenameFilter filter)---利用文件名过滤器获取当前路径下的所有内容
        //public File[] listFiles(FileFilter filter)----利用文件名过滤器获取当前文件下的所有内容
        //public File[] listFiles(FilenameFilter filter)---利用文件名过滤器获取当前该路径下的所有内容

        //盘符号
        File[] f2=File.listRoots();
        System.out.println(Arrays.toString(f2));
        System.out.println("================================================");
        //返回文件名字
        File f3=new File("E:\\Software");
        String[] arr=f3.list();
        for(String s:arr){
            System.out.println(s);
        }
        System.out.println("=================================================");
        //文件名过滤器
        File f4=new File("E:\\Software\\QQ");
        String[] arr4= f4.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src=new File(dir,name);
                return src.isFile()&&name.endsWith(".txt");
            }
        });
            System.out.println(Arrays.toString(arr4));











/*File f1=new File("C:\\Users\\Chris\\Desktop\\uuu\\yyy.txt");
File f2=new File("C:\\Users\\Chris\\Desktop\\uuu\\ooo.txt");
        boolean b = f1.createNewFile();
        boolean b2 = f2.createNewFile();
        System.out.println(b2);
        System.out.println(b);*/

     /*   File f1=new File("C:\\Users\\Chris");
        File[] files = f1.listFiles();
        for(File file:files){
            System.out.println(file);
        }

*/

    }
}
