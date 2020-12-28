package day04;

import day02.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String[] emps_str = str.split(";");

        ArrayList<String[]> list=new ArrayList<>();

        for (String s : emps_str) {
            list.add(s.split(","));
        }

        ArrayList<Emp> emps=new ArrayList<>();
        for (String[] split : list) {
            Emp emp=new Emp(split[0],Integer.parseInt(split[1]),split[2],
                    Integer.parseInt(split[3]),new SimpleDateFormat("yyyy-MM-dd").parse(split[4]));
            emps.add(emp);
        }

        System.out.println(emps);

        for (Emp emp : emps) {
            Date hiredate = emp.getHiredate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(hiredate);
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,6);
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
        }

    }

}
