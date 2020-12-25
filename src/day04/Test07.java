package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }


}
