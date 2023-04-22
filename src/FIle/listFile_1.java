package FIle;

import java.io.File;
import java.util.Arrays;

public class listFile_1 {
    public static void main(String[] args) {
        File f1=new File("E:\\Software\\QQ");
        File[] f = f1.listFiles();
        for(File fs:f){
            if(fs.isFile()&&fs.getName().endsWith(".txt")){
                System.out.println(fs);

            }
        }

    }
}
