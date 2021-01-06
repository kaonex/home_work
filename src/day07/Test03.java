package day07;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        String str;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 5; i++) {
            System.out.print("输入员工信息：");
            str = sc.next();
            String[] split = str.split(",");
            Emp emp = new Emp(split[0], Integer.parseInt(split[1]),
                    split[2], Integer.parseInt(split[3]), sdf.parse(split[4]));


            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(emp.getName()+".obj"));
            oos.writeObject(emp);
            oos.close();
        }


    }

}
