package IO_floor;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class io_压缩 {
    public static void main(String[] args) throws IOException {
        //C:\Users\Chris\Desktop\yyy\copy_kun
        File f1=new File("C:\\Users\\Chris\\Desktop\\yyy\\copy_kun");
        //压缩包放在哪里
        File f2parent=f1.getParentFile();
        File f2=new File(f2parent,f1.getName()+".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(f2));


        zos.close();

        //toZip(f1,f2);


    }
    //压缩方法
    public static void toZip(File f1,ZipOutputStream zos,String name) throws IOException {
        File[] files = f1.listFiles();
        for(File file:files){
            if(file.isFile()){
                //判断是否是文件
                //ZipEntry entry=new ZipEntry()

            }else {

            }
        }


    }
}
