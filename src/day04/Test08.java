package day04;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();

        ArrayList<Date> date_list=new ArrayList();
        date_list.add(sdf.parse(str1));
        date_list.add(sdf.parse(str2));
        date_list.add(sdf.parse(str3));

        for (Date date : date_list) {
            System.out.println(date);
        }



    }

}
