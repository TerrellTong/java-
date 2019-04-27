package 其他IO类;

/*将Buffer.txt，info.txt和keyboard.txt文件合并到一个文本文件4.txt*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.*;

public class hm_01_序列流演示 {
    public static void main(String[] args) throws IOException {
        //定义一个文件输入流集合
        ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();
        a1.add(new FileInputStream("Buffer.txt"));
        a1.add(new FileInputStream("info.txt"));
        a1.add(new FileInputStream("keyboard.txt"));
        Enumeration<FileInputStream> en = Collections.enumeration(a1);
        //定义一个序列流，里面的构造函数的参数必须是Enumeration
        SequenceInputStream sis = new SequenceInputStream(en);
        //定义一个文件输出流
        FileOutputStream fos = new FileOutputStream("123.txt");
        byte [] buf = new byte[1024];
        int len=0;
        while ((len=sis.read(buf))!=-1)  //将读到的数据放入缓冲区buf中
            fos.write(buf,0,len);
        //关流
        fos.close();
        sis.close();
    }
}
