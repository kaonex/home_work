package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		String name=new Scanner(System.in).next();
		copy1(name);

		copy2(name);

	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name)throws IOException{
		InputStream fis = new FileInputStream(name);
		String[] split = name.split("\\.");
		OutputStream fos = new FileOutputStream(split[0] + "_copy" + split[1]);

		int read;
		while((read=fis.read())!=-1){
			fos.write(read);
		}
		fis.close();
		fos.close();


	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name)throws IOException{
		InputStream fis = new FileInputStream(name);
		String[] split = name.split("\\.");
		OutputStream fos = new FileOutputStream(split[0] + "_copy." + split[1]);

		byte[] reads=new byte[fis.available()];
		fos.write(reads);
		fis.close();
		fos.close();

		
	}
}
