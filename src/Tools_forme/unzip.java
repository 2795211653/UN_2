package Tools_forme;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class unzip {
    public static void main(String[] args) throws IOException {
        //解压
        //C:\Users\Chris\Desktop\\uuu\\kun.zip
        File f1=new File("C:\\Users\\Chris\\Desktop\\uuu\\copy_kun.zip");
        File f2=new File("C:\\Users\\Chris\\Desktop\\yyy");
        unzip(f1,f2);



    }

    //解压方法
    public static void unzip(File f1,File f2) throws IOException {
        //创建一个压缩流来读取数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(f1));
        //获取压缩包里的每一个对象
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            //文件夹
            if(entry.isDirectory()){
                //在f2新建一个文件夹
                File file=new File(f2,entry.toString());
                file.mkdirs();
            }else{
                //文件,读取压缩包的文件放到目的目录下
                FileOutputStream fos=new FileOutputStream(new File(f2,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();

            }
        }
        zip.close();






    }
}
