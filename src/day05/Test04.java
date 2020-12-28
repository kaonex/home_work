package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        String str=new Scanner(System.in).next();
        String[] split = str.split(";");
        for (String s : split) {
            String[] split1 = s.split(":");
            map.put(split1[0],Integer.parseInt(split1[1]));
        }
        System.out.println(map);
        System.out.println(map.get("物理"));
        map.put("化学",96);
        System.out.println(map);
        map.remove("英语");
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());


        Set<String> strings = map.keySet();
        Iterator<String> iterator1 = strings.iterator();
        while(iterator1.hasNext())
            System.out.println(iterator1.next());

        Set<String> strings1 = map.keySet();
        Iterator<String> iterator2 = strings1.iterator();
        while(iterator2.hasNext())
            System.out.println(map.get(iterator2.next()));


    }

}
