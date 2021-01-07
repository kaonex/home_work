package day07;

import java.io.*;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {

    public static void main(String[] args) throws IOException {
        File file = new File("test_txt.txt");

        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("test_txt_utf.txt"), "UTF-8"
                )
        );

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "GBK"
                )
        );
        String str;

        while((str=br.readLine())!=null)
            pw.println(str);

        pw.close();
        br.close();


    }


}
