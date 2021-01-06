package day07;

import java.io.*;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {

    public static void main(String[] args) throws  IOException{

        FileInputStream fis = new FileInputStream("myfile.txt");
        FileOutputStream fos = new FileOutputStream("myfile_cp.txt");

        byte[] bytes=new byte[1024];
        int len;
        while((len = fis.read(bytes))!=-1)
            fos.write(bytes,0,len);


        fos.close();
        fis.close();


    }

}
