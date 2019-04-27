package IO流基本操作;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hm_04_缓冲区BufferWriter演示 {
    public static void main(String[] args) throws IOException {
        //创建一个写文件对象
        FileWriter fw = new FileWriter("Buffer.txt");
        //创建一个缓冲区的写对象,里面必须要有对象，不然没意义
        BufferedWriter bufw = new BufferedWriter(fw);
        //用缓冲区的对象来进行写操作
        for(int i=0;i<4;i++)
        {
            bufw.write("abcdef"+i);
            //换行操作
            bufw.newLine();
            //每写入一个数据就刷新一次缓冲区
            bufw.flush();
        }
        //关闭缓冲区
        bufw.close();

    }
}
