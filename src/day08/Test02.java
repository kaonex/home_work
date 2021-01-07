package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String str;

        try(PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("note.txt", true), "GBK"
                ), true
        );){
            while(true){
                str=sc.next();
                if(str.toLowerCase().equals("exit")){
                    sc.close();
                    pw.close();
                    break;
                }
                pw.println(str);
            }

        }catch (IOException e){
            e.printStackTrace();
        }





    }


	
}
