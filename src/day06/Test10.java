package day06;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {

    public static void main(String[] args) throws ParseException , IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        new File("Emp\\").mkdirs();
        for (int i = 0; i < 5; i++) {
            System.out.print("输入员工信息：");
            str=sc.next();
            String[] split = str.split(",");
            Emp emp=new Emp(split[0],Integer.parseInt(split[1]),
                    split[2],Integer.parseInt(split[3]),sdf.parse(split[4]));


            File file = new File("Emp\\"+split[0] + ".txt");
            file.createNewFile();
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file));
            osw.write(emp.toString());
            osw.close();

        }

        sc.close();


    }
	
	
}
