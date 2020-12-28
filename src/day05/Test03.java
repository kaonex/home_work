package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-
 * 李四,26,女,6000,2007-12-24;张三,25,男,5000,2006-02-15;王五,27,男,7000,2010-12-15;
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String[] emps_str = str.split(";");

        ArrayList<String[]> list=new ArrayList<>();

        for (String s : emps_str) {
            list.add(s.split(","));
        }

        List<Emp> emps=new ArrayList<>();
        for (String[] split : list) {
            Emp emp=new Emp(split[0],Integer.parseInt(split[1]),split[2],
                    Integer.parseInt(split[3]),new SimpleDateFormat("yyyy-MM-dd").parse(split[4]));
            emps.add(emp);
        }
        Collections.sort(emps);
        System.out.println(emps);


        for (int i = 0; i < emps.size(); i++) {
            for (int j = i; j < emps.size(); j++) {
                if(compareToDate(emps.get(i),emps.get(j))==-1){
                    Emp emp = emps.get(i);
                    emps.set(i,emps.get(j));
                    emps.set(j,emp);
                }
            }
        }

        System.out.println(emps);


    }


    public static int compareToDate(Emp emp1,Emp emp2){
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(emp1.getHiredate());
        cal2.setTime(emp2.getHiredate());

        return cal1.compareTo(cal2);
    }


}
