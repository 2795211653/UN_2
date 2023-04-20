package Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class stream_2 {
    public static void main(String[] args) {

        ArrayList<Student>list=new ArrayList<>();

        list.add(new Student("上岛咖啡",43));
        list.add(new Student("谁叫你是",33));
        list.add(new Student("舒服 ",67));
        list.add(new Student("日结工",93));

        //将获取的名字放入数组中
        String[] arr= list.stream().map(new Function<Student, String>() {
            public String apply(Student student){
                return student.getName();
            }
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));

    }
}
