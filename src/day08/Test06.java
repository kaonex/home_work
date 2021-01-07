package day08;

import java.io.*;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String regex1 = "[a-zA-Z]{1,20}";

        String regex2 = "[男|女]";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        while (true) {
            System.out.print("请输入用户信息:");
            String str = sc.next();
            String[] split = str.split(",");


            if (!split[0].matches(regex1)) {
                System.out.println("姓名输入有误,请重新输入");
                continue;
            }

            if (!split[2].matches(regex2)) {
                System.out.println("性别输入有误，请重新输入");
                continue;
            }
            int age = -1;

            int salary = -1;
            Date hiredate = null;

            try {
                age = Integer.parseInt(split[1]);
                salary = Integer.parseInt(split[3]);
                hiredate = sdf.parse(split[4]);
            } catch (NumberFormatException e) {
                System.out.println("数字格式输入错误，请重新输入");
                continue;

            } catch (ParseException e) {
                System.out.println("日期格式输入错误，请重新输入");
                continue;
            }
            if (age <= 0 || age > 100) {
                System.out.println("年龄输入超出范围，请重新输入");
                continue;
            }

            if (salary < 0) {
                System.out.println("收入超出范围，请重新输入");
                continue;
            }


            Emp emp = new Emp(split[0], age, split[2], salary, hiredate);

            try {
                PrintWriter pw = new PrintWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("emp.txt", true),"UTF-8"
                        ),true
                );
                String s = emp.toString();
                pw.println(s);
                pw.close();
                System.out.println("输入完成！");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }


}
