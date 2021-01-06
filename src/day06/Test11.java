package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        File dir = new File("Emp");
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".txt"))
                    return true;
                return false;
            }
        });


        ArrayList<Emp> emps = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        for (File file : files) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
            char[] chars = new char[1024];
            isr.read(chars);
            String str = new String(chars);
            String[] split = str.split(",|:");

            Emp emp = new Emp(split[1], Integer.parseInt(split[3]),
                    split[5], Integer.parseInt(split[7]), sdf.parse(split[9]));
            emps.add(emp);

        }
        Collections.sort(emps, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(emps);




    }

}
