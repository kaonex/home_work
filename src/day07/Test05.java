package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {

    public static void main(String[] args) throws  IOException{

        File file = new File(Test05.class.getResource("").getPath());

        System.out.println(file);

       /* InputStreamReader isr = new InputStreamReader(
                new FileInputStream("")
        );

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("")
        );*/


    }




}
