package IO_floor;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class hutool {
    public static void main(String[] args) {

        File file = FileUtil.file("C:\\Users\\Chris\\Desktop\\yyy", "bbbb", "a.txt");
        System.out.println(file);
        File touch=FileUtil.touch(file);
        System.out.println(touch);



    }
}
