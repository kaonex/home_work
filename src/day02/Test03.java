package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {

    public static void main(String[] args) {
        String str=new Scanner(System.in).next();

        String[] split = str.split("\\.");

        for (String s : split) {
            System.out.println(s);
        }

    }

}
