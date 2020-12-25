package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> sublist = list.subList(2, 5);

        for (int i = 0; i < sublist.size(); i++) {
            sublist.set(i,sublist.get(i)*10);
        }


        for (Integer integer : list) {
            System.out.print(integer+",");
        }
        System.out.println();
        list.remove((Integer)7);
        list.remove((Integer)8);
        list.remove((Integer)9);

        for (Integer integer : list) {
            System.out.print(integer+",");
        }

    }

}
