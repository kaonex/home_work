package day06;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws  IOException{
        DataOutputStream dos= new DataOutputStream(new FileOutputStream("raf.dat"));

        dos.writeInt(Integer.MAX_VALUE);
        dos.writeLong(Long.MAX_VALUE);


        DataInputStream dis = new DataInputStream(new FileInputStream("raf.dat"));

        int i = dis.readInt();

        System.out.println(i);

        long l = dis.readLong();

        System.out.println(l);


    }

}
