package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.print("输入数学表达式:");
        String str = new Scanner(System.in).next();
        String regex = "[+\\-/*]";

        String regex1 = "[0-9]+";

        String[] split = str.split(regex);

        double result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                result = Double.parseDouble(split[0]) + Double.parseDouble(split[1]);
                break;
            }
            if (str.charAt(i) == '-') {
                result = Double.parseDouble(split[0]) - Double.parseDouble(split[1]);
                break;
            }
            if (str.charAt(i) == '*') {
                result = Double.parseDouble(split[0]) * Double.parseDouble(split[1]);
                break;
            }
            if (str.charAt(i) == '/') {
                result = Double.parseDouble(split[0]) / Double.parseDouble(split[1]);
                break;
            }
        }


        if (split[0].matches(regex1) && split[1].matches(regex1))
            str += "=" + (int) result;
        else
            str += "=" + result;


        System.out.println(str);

    }

}
