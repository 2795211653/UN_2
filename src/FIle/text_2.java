package FIle;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class text_2 {
    public static void main(String[] args) {
        //定义一个方法找某个文件夹，是否有avi结尾的文件
        File file=new File("E:\\Software\\QQ\\Misc\\QQApp");
        String[] l = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src=new File(dir,name);

                return src.isFile()&&src.getName().endsWith("app");
            }
        });
        System.out.println(Arrays.toString(l));



    }
}
