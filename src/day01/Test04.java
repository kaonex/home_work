package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		String email=new Scanner(System.in).next();
		String str=email.substring(0,email.lastIndexOf("@"));
		System.out.println(str);
		
	}
}
