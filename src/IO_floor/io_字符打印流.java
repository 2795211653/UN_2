package IO_floor;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class io_字符打印流 {
    public static void main(String[] args) throws IOException {

        //public PrintWriter(Write/File/String)-------------------关联字节输出流
        //public PrintWriter(String fileName,Charset charset)-----指定字符编码
        //public PrintWriter(Write w,boolean autoFlush)-----------自动刷新
        //public PrintWriter(OutputStream out,boolean autoFlush,Charset charset)---指定字符编码且自动刷新
        //C:\Users\Chris\Desktop\\uuu\1.txt
        PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\Chris\\Desktop\\\\uuu\\1.txt"),true);
        pw.println("看到了时间富兰克林速度快放假绿色水力发电科技");
        pw.close();




    }
}
