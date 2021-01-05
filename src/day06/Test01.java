package day06;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("myfile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(sdf.format(new Date(file.lastModified())));
        Date date_change = sdf.parse("2017-06-30 14:22:16");
        file.setLastModified(date_change.getTime());
        System.out.println(sdf.format(new Date(file.lastModified())));


    }

}
