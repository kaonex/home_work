package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws  IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myfile.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myfile_cp2.txt"));

        byte[] bytes=new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1)
            bos.write(bytes,0,len);


        bis.close();
        bos.close();

    }

}
