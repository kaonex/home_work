package day08;

import java.io.*;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Bonnie
 *
 */
public class Test01 {

    public static void main(String[] args) throws FileNotFoundException {

        InputStream bis = new BufferedInputStream(
                new FileInputStream("myfile.txt")
        );

        OutputStream bos = new BufferedOutputStream(
                new FileOutputStream("myfile_副本.txt")
        );



        try {
            byte[] bytes = new byte[1024];
            int len;
            while((len=bis.read(bytes))!=-1)
                bos.write(bytes,0,len);



        } catch (IOException e) {

        }finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
