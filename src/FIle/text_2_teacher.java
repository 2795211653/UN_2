package FIle;

import java.io.File;

public class text_2_teacher {
    public static void main(String[] args) {
        //定义一个方法找某个文件夹，是否有avi结尾的文件
        //不考虑子文件夹
        File file=new File("E:\\Software\\QQ\\Misc\\Sound\\Classic");
        boolean b = haveAvi(file);
        System.out.println(b);


    }
    public static boolean haveAvi(File file){
        File[] arr = file.listFiles();
        for(File f:arr){
            if(f.isFile()&&f.getName().endsWith(".wav")){
                return true;
            }
        }
        return false;
    }
}
