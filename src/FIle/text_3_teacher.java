package FIle;

import java.io.File;
import java.util.Scanner;
import java.lang.String;

public class text_3_teacher {
    public static void main(String[] args) {

        //定义一个方法找某个文件夹，是否有avi结尾的文件
        //考虑子文件夹
        //进入文件夹
        //遍历数组
        //判断
        //判断
        //E:\Software\QQ

        Scanner sc=new Scanner(System.in);
        System.out.println("盘符：");
        String panfu = sc.next();
        File file=new File(panfu+":");
        System.out.println("输入：");
        String start = sc.next();

        findFiles(file,start);


    }
   /* public static void findAll(File file){
        File[] arr=file.listRoots();
        for(File as:arr){
            findFiles(as,start);
        }
    }*/


    public static void findFiles(File files,String start){

        File[] f = files.listFiles();

        if(f!=null) {//有空文件
            for (File fs : f) {
                if (fs.isFile() && fs.getName().startsWith(start)||fs.isFile() &&fs.getName().endsWith(start)) {
                    System.out.println(fs);
                } else {
                    findFiles(fs,start);
                }
            }
        }

    }
}
