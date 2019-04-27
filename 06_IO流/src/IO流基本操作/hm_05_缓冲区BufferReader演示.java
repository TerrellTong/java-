package IO流基本操作;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hm_05_缓冲区BufferReader演示 {
    public static void main(String[] args) throws IOException {
        FileReader fd = new FileReader("Buffer.txt");
        //新建一个读的缓冲区
        BufferedReader bufr = new BufferedReader(fd);
        String line = " ";
        while ((line=bufr.readLine())!=null)
            System.out.println(line);
        //关闭缓冲区
        bufr.close();
    }
}
