package IO流基本操作;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class hm_07_字节流操作文本文件 {
    public static void main(String[] args) throws IOException {
        //创建一个写的字节流
        FileOutputStream fos = new FileOutputStream("file.txt");
        //写入文件
        fos.write("abcdefggh".getBytes()); //由于write只能接受byte数组，则我们输入字符串后要用getBytes()方法获得
        //关闭文件
        fos.close();

        //创建一个读的字节流
        FileInputStream fis = new FileInputStream("file.txt");
        //申明一个Byte数组
        byte [] by = new byte[1024];
        int len=0;
        //读数据
        while ((len=fis.read(by))!=-1)   //read后面要接声明的byte数组,表示从哪写
            System.out.println(new String(by,0,len));
        //关资源
        fis.close();
    }
}
