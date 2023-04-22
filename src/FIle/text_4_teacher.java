package FIle;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


public class text_4_teacher {
    public static void main(String[] args) {
        //统计文件夹每种文件的个数

        File file = new File("E:\\Software");
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);


    }

    public static HashMap<String, Integer> getCount(File file) {
        HashMap<String, Integer> hm = new HashMap<>();

        File[] arr = file.listFiles();
        for (File fs : arr) {
            if (fs.isFile()) {
                //文件
                String name = fs.getName();
                String[] a1 = name.split("\\.");
                if (a1.length >= 2) {
                    String endName = a1[a1.length - 1];
                    if (hm.containsKey(endName)) {
                        //已经有了这个文件
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    } else {
                        //第一次遇到这个文件
                        hm.put(endName, 1);
                    }
                }


            } else {
                //文件夹
                HashMap<String, Integer> sonMap = getCount(fs);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();

                    if (hm.containsKey(key)) {
                        //hm已经有的文件
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key, count);

                    } else {
                        //hm里面没有的文件
                        hm.put(key, value);

                    }
                }


            }

        }
        return hm;
    }
}
