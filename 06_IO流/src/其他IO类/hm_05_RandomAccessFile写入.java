package 其他IO类;

import java.io.IOException;
import java.io.RandomAccessFile;

public class hm_05_RandomAccessFile写入 {
    public static void main(String[] args) throws IOException {
        writeFile();
    }

    private static void writeFile() throws IOException {
        //创建一个RandomAccessFile对象
        RandomAccessFile ras = new RandomAccessFile("ranacc.txt","rw");
        //写入文件
        ras.write("张三".getBytes());
//        ras.write(609);//只存最后8位(一个字节)，结果是a(97)
        ras.writeInt(97);//存4个字节
        ras.write("李四".getBytes());
        ras.writeInt(98);//存4个字节
    }
}
