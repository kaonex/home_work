package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.print("输入员工人数:");
        int num=sc.nextInt();

        ArrayList<String[]> list=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.print("输入员工信息:");
            String str=sc.next();
            list.add(str.split(","));
        }

        ArrayList<Emp> emps=new ArrayList<>();

        for (String[] strings : list) {
            Emp emp=new Emp(strings[0],Integer.parseInt(strings[1]),
                    strings[2],Integer.parseInt(strings[3]),sdf.parse(strings[4]));
            if(emps.size()==0)
                emps.add(emp);
            else{
                boolean flag=true;
                for (Emp emp1 : emps) {
                    if(emp1.equals(emp)){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    emps.add(emp);
            }
        }
        System.out.println(emps);



    }

}
