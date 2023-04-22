package FIle;

import java.io.File;
import java.util.Scanner;

public class text_delet {
    public static void main(String[] args) {

        //删除一个多级文件夹
        //删除一个有内容的文件夹
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件目录：");
        String pName = sc.next();
        File file=new File(pName);
        delFile(file);


    }
    public static void delFile(File file){
        File[] arr = file.listFiles();
        for(File fs:arr){
            if(fs.isFile()){
                fs.delete();
            }else{
                delFile(fs);
                System.out.println("成功删除");
            }
        }
    }


}
