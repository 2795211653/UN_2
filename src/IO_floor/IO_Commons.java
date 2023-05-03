package IO_floor;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class IO_Commons {
    public static void main(String[] args) throws IOException {
        //C:\Users\Chris\Desktop\yyy\copy_kun
        //复制(强)
        File f1=new File("C:\\Users\\Chris\\Desktop\\yyy\\copy_kun");
        File f2=new File("C:\\Users\\Chris\\Desktop\\yyy\\copy1");
       // FileUtils.copyDirectory(f1,f2);
        //FileUtils.copyDirectoryToDirectory(f1,f2);



    }
}
