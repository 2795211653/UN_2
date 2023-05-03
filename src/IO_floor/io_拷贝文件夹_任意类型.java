package IO_floor;

import java.io.*;

public class io_拷贝文件夹_任意类型 {
    public static void main(String[] args) throws IOException {

        //拷贝一个文件夹，考虑子文件夹
        //字节流适用于拷贝

        //C:\Users\Meg\Desktop\book\a
        //C:\Users\Meg\Desktop\book\b
        File file1=new File("C:\\Users\\Meg\\Desktop\\book\\a");
        File file2=new File("C:\\Users\\Meg\\Desktop\\book\\b");

        //拷贝方法
        copydir(file1,file2);





    }

    private static void copydir(File file1, File file2) throws IOException {
        file2.mkdirs();
        //递归
        File[] files=file1.listFiles();
        for(File file:files){
            if(file.isFile()){
                //文件开始 文件结束
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(file2,file.getName()));
                byte[] bytes=new byte[1024];
                int len;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else{
                //是文件夹
                copydir(file,new File(file2,file.getName()));
            }
        }




    }
}
