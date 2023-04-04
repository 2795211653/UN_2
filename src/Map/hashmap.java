package Map;

import java.util.HashMap;
import java.util.Set;


public class hashmap {
    public static void main(String[] args) {

        //键是学生对象,值是籍贯
        //存储三个键值对元素
        //同姓名同年龄是同一个学生

        //1.创建哈希map对象
        HashMap<Student,String> hm=new HashMap<>();
        //2.创建学生对象
        Student st1=new Student("打客服",32);
        Student st2=new Student("技术复核",38);
        Student st3=new Student("好地方",62);
        //3.添加元素
        hm.put(st1,"江苏");
        hm.put(st2,"安徽");
        hm.put(st3,"浙江");
        //4.遍历
        Set<Student> keys=hm.keySet();
        for(Student key:keys){
            String value=hm.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("--------------------------");

        Set<Map.Entry<Student,String>> entries=hm.entrySet();
        for(Map.Entry<Student,String> entry:entries){
            Student key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }






    }
}
