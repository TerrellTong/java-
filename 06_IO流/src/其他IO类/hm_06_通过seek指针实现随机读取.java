package 其他IO类;

import java.io.IOException;
import java.io.RandomAccessFile;

public class hm_06_通过seek指针实现随机读取 {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static void readFile() throws IOException {
        RandomAccessFile ras = new RandomAccessFile("ranacc.txt","r");
        //用seek方法设置指针的位置
        ras.seek(8);
        //定义一个4个字节的数组来存储读取出来的数据
        byte[] buf = new byte[4];
        //将数据读到buf中
        ras.read(buf);
        String name = new String(buf);
        int age= ras.readInt();//读4个字节转成整数
        System.out.println(name+":"+age);
        //关流
        ras.close();
    }
}
