package Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class stream_1 {
    public static void main(String[] args) {

        //王心凌,张韶涵,张靓颖,田馥甄,陈嘉桦,任家萱,蔡依林,黑Girl,林志玲
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"王心凌-23","张韶涵-53","张靓颖-34","田馥甄-99","陈嘉桦-21","任家萱-12","蔡依林-43","黑Girl-55","林志玲-22");

        //把字符串变成student对象
        Student[] arr= list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));



    }
}
