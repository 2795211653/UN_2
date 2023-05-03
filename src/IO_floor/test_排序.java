package IO_floor;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test_排序 {
    public static void main(String[] args) throws IOException {

        /*
        * 将数据：2-1-9-4-7-8排序成
        *       1-2-4-7-8-9
        * */

        //读取数据
        FileReader fd=new FileReader("C:\\Users\\Meg\\Desktop\\book\\3.txt");
        StringBuilder sb=new StringBuilder();
        int len;
        while((len=fd.read())!=-1){
            sb.append((char)len);
        }
        fd.close();
        System.out.println(sb);


        //排序
        String str=sb.toString();
        String[] arrStr=str.split("-");

        ArrayList<Integer> list=new ArrayList<>();
        for(String s:arrStr){
            int i = Integer.parseInt(s);
            list.add(i);
        }
        //将数字排好顺序
        Collections.sort(list);

        System.out.println(list);


        //写出
        FileWriter fw=new FileWriter("C:\\Users\\Meg\\Desktop\\book\\4.txt");



    }
}
