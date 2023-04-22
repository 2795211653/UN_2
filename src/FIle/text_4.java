package FIle;

import java.io.File;

public class text_4 {
    public static void main(String[] args) {
        //统计一个文件夹的总大小
        File file=new File("E:\\Java_Family");
        long l = getLen(file);
        System.out.println(l);


    }
    public static long getLen(File src) {
        //累加
        long le = 0;
        File[] arr = src.listFiles();
        if (arr != null) {
            for (File fs : arr) {
                if (fs.isFile()) {
                    le = le + fs.length();
                } else {
                    le = le + getLen(fs);
                }
            }
        }
            return le;
        }

}
