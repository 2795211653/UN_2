package IO_floor;

import java.io.*;

public class io_字节缓冲拷贝文件 {
    public static void main(String[] args) throws IOException {

        //BufferedInputStream--------字节输入流(默认长度8192的缓冲区)
        //BufferedOutputStream-------字节输出流
        //BufferedReader-------------字符输入流
        //BufferedWriter-------------字符输出流


        //C:\Users\Meg\Desktop\book

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\Meg\\Desktop\\book\\2.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Meg\\Desktop\\book\\3.txt"));

        int len;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            System.out.println(len);
        }
        bos.close();
        bis.close();
        System.out.println("=====================================================================");

/*        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Meg\\Desktop\\book\\2.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter(("C:\\Users\\Meg\\Desktop\\book\\3.txt")));

        int b;
        byte[] bytes=new byte[1024];
        while((b=br.read(bytes))!=-1){
            bw.write(bytes,0,b);
            System.out.println( b);
        }

        bw.close();
        br.close();*/

    }
}
