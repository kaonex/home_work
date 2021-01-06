package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
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


        Map<String, Emp> emps = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        for (File file : files) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
            char[] chars = new char[1024];
            isr.read(chars);
            String str = new String(chars);
            String[] split = str.split(",|:");

            Emp emp = new Emp(split[1], Integer.parseInt(split[3]),
                    split[5], Integer.parseInt(split[7]), sdf.parse(split[9]));
            emps.put(emp.getName(),emp);
        }

        Set<String> emp_names = emps.keySet();

        System.out.print("输入姓名：");

        String name=new Scanner(System.in).next();

        for (String emp_name : emp_names) {
            if(emp_name.equals(name)){
                Emp emp = emps.get(emp_name);
                Calendar cal = Calendar.getInstance();
                cal.setTime(emp.getHiredate());
                cal.add(Calendar.YEAR,20);

                System.out.println(emp.getName()+","+emp.getAge()+","+
                        emp.getGender()+","+emp.getSalary()+","+sdf.format(cal.getTime()));
                return ;
            }

        }
        System.out.println("查无此人");


    }

}
