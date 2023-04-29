package IO_floor;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class io_read_write {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码和解码
        //C:\Users\Meg\Desktop\book


        //编码
        //默认的utf-8
        String str="好说歹说";
        byte[] b1 = str.getBytes();
        System.out.println(Arrays.toString(b1));


        //GBK
        byte[] b2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(b2));


        //解码
        String str2=new String(b1);
        System.out.println(str2);

        String str3=new String(b2,"GBK");
        System.out.println(str3);



    }
}
