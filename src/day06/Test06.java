package day06;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir"));
        File[] files = file.listFiles();
        ArrayList<String> list = new ArrayList<>();
        for (File file1 : files) {
            if(!file1.isDirectory())
                list.add(file1.getName());
        }
        System.out.println(list);
    }

}
