package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        String str=new Scanner(System.in).next();
        File file = new File(str );

        int num=1;
        while(file.exists()){
            file=new File(str+"_副本"+num);
            num++;
        }

        if(file.mkdirs())
            System.out.println("创建成功");;

    }

}
