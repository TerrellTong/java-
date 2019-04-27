package IO流基本操作;

import java.io.FileReader;
import java.io.IOException;

public class hm_11_将文本文件输入到控制台上 {
    public static void main(String[] args) throws IOException {
        Print();
    }
    public static void Print() throws IOException {
        //定义一个读文件的对象
        FileReader fr = new FileReader("keyboard.txt");
        //定义一个存储对象
        char []buf = new char[1024];
        int len = 0;
        while ((len=fr.read(buf))!=-1)
        {
            //一次是读所有数据
            System.out.println(new String(buf , 0,len));
        }
        fr.close();
    }
}
