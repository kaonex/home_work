package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String num=getNum();
		System.out.println(num);

		String input=new Scanner(System.in).next();

		if(num.equalsIgnoreCase(input))
			System.out.println("输入正确");
		else
			System.out.println("输入错误");



		
	}

	public static String getNum(){
		String str="";
		for (int i = 0; i < 5; i++) {
			int x=new Random().nextInt(2);
			if(x==0)
				str+=(char)('a'+new Random().nextInt(26));
			if(x==1)
				str+=(char)('A'+new Random().nextInt(26));

		}
		return str;

	}
	
}
