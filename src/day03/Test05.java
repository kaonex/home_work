package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {

    public static void main(String[] args) {
        System.out.print("请输入出生日期:");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        try {
            Date date=sdf.parse(new Scanner(System.in).next());
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.YEAR,20);
            cal.set(Calendar.DAY_OF_WEEK,4);
            System.out.println("20岁生日当周的周三为:"+ sdf.format(cal.getTime()));
        } catch (ParseException e) {
            System.out.println("输入日期格式有误！");
        }

    }

}
