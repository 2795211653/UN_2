package IO_floor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class io_字节打印流 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //打印流-----------PrintStream,PrintWriter俩个类
        //打印流只操作文件目的地，不操作数据源
        //public PrintStream(OutputStream/file/String)----------------------------关联字节输出流/文件/文件路径
        //public PrintStream(String fileName,Charset charset)-----指定字符编码
        //public PrintStream(OutputStream out,boolean autoFlush)--自动刷新
        //public PrintStream(OutputStream out,boolean autoFlush,String encoding)----指定字符编码且自动刷新
        //public void write(int b)------------将指定的字节写出
        //public void println()---------------打印任意数据，自动刷新，自动换行
        //public void print()-----------------打印任意数据，不换行
        //public void printf(String format,Object....args)--------带有占位符的打印语句，不换行
        //C:\Users\Chris\Desktop\\uuu\
        PrintStream ps=new PrintStream(new FileOutputStream("C:\\Users\\Chris\\Desktop\\\\uuu\\1.txt"),true,"utf-8");
        ps.println(97);
        ps.print(true);
        ps.printf("%s点击扣费%s","打开了附件","不是快递");
        ps.close();







    }
}
