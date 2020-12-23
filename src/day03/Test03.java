package day03;

import com.sun.security.jgss.GSSUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {

    public static void main(String[] args) throws ParseException {
        System.out.print("输入出生日期:");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(new Scanner(System.in).next());

        Date date1 = new Date();

        long time=date1.getTime()-date.getTime();

        int week= (int) (time*1.0/1000/60/60/24/7);

        System.out.println("迄今"+week+"周");



    }

}
