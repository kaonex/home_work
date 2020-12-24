package day02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String[] emps = str.split(";");

        ArrayList<String[]> list=new ArrayList<>();

        for (String s : emps) {
            list.add(s.split(","));
        }

        ArrayList<Person> presons=new ArrayList<>();
        for (String[] split : list) {
            Person emp=new Person(split[0],Integer.parseInt(split[1]),split[2],Integer.parseInt(split[3]));
            presons.add(emp);
        }

        for (Person person : presons) {
            System.out.println(person);
        }





    }

}
