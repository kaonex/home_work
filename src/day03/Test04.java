package day03;

import java.io.CharArrayReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {

        System.out.print("输入生产日期:");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(new Scanner(System.in).next());

        System.out.print("输入保质期:");

        int day=new  Scanner(System.in).nextInt();

        Calendar cal = Calendar.getInstance();

        cal.setTime(date);

        cal.add(Calendar.DATE,day);

        cal.add(Calendar.WEEK_OF_MONTH,-2);

        cal.set(Calendar.DAY_OF_WEEK,4);

        System.out.println(sdf.format(cal.getTime()));

    }
	
}
