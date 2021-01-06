package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("note.txt",true));

        String str=null;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("请输入：");
            str=sc.next();
            if(str.toLowerCase().equals("exit")){
                sc.close();
                osw.close();
                System.out.println("退出编写");
                break;
            }
            osw.write(str);
            osw.write("\n");
        } while(true);



    }
	
}
