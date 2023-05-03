package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class io_inPut {
    public static void main(String[] args) throws IOException {
        /*
        * Life is too short to spend time with people who suck the happiness out of you. If someone wants you in their life, they’ll make room for you. You shouldn’t have to fight for a spot. Never, ever insist yourself to someone who continuously overlooks your worth. And remember, it’s not the people that stand by your side when you’re at your best, but the ones who stand beside you when you’re at your worst that are your true friends.
        * */
   /*     File file=new File("C:\\Users\\Chris\\Desktop\\uuu\\2.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);*/


        //C:\Users\Chris\Desktop\\uuu
        FileInputStream fis=new FileInputStream("C:\\Users\\Chris\\Desktop\\uuu\\2.txt");

        /*int b1 = fis.read();
        fis.close();
        System.out.println((char) b1);*/

        //循环读取
        int b;
        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();



    }
}
