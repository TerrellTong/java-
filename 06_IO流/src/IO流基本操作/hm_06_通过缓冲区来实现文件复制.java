package IO流基本操作;

import java.io.*;

public class hm_06_通过缓冲区来实现文件复制 {
    public static void main(String[] args) throws IOException {
        //依次创建文件和缓冲区的读写文件对象
        FileReader fd = new FileReader("Buffer.txt");
        FileWriter fw = new FileWriter("Buffer1.txt");
        BufferedReader bufr = new BufferedReader(fd);
        BufferedWriter bufw = new BufferedWriter(fw);
        //读文件
        String str = null;
        while ((str = bufr.readLine()) != null) {
            //写文件
            bufw.write(str);
            bufw.newLine();
        }
        //关闭两个缓冲区
        bufr.close();
        bufw.close();
    }
}
