package day08;

import java.io.*;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Bonnie
 *
 */
public class Test04 {


    public static void main(String[] args) throws URISyntaxException {
        HashMap<String, Emp> emps = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        File file = new File(Test04.class.getResource("emp.txt").toURI());
        try( BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file)
                )
        )
        ){
            String emp_str;
            while((emp_str=br.readLine())!=null){
                String[] split = emp_str.split(",");

                Emp emp = new Emp(split[0], Integer.parseInt(split[1]),
                        split[2], Integer.parseInt(split[3]), sdf.parse(split[4]));

                emps.put(emp.getName(),emp);

            }


        }catch (IOException | ParseException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("输入员工姓名:");
        String name=sc.next();
        Set<String> emp_names = emps.keySet();

        for (String emp_name : emp_names) {
            if(emp_name.toLowerCase().equals(name.toLowerCase())){
                System.out.println(emps.get(emp_name).toString());
                return ;
            }
        }
        System.out.println("查无此人");



    }

}
