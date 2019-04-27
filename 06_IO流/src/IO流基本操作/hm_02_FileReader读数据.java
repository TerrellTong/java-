package IO流基本操作;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hm_02_FileReader读数据 {
    public static void main(String[] args) throws IOException {
        //创建一个FileReader的对象，文件名必须存在
        FileReader fd = new FileReader("demo.txt");
//        int ch=0;
//        //用read()方法读数据，如果数据不存在就返回-1
//        while((ch=fd.read())!=-1)
//        {
//            System.out.println((char)ch);
//        }
        //用字符数组读数据
        char [] buf = new char[1024];
        int len=0;
        while ((len=fd.read(buf))!=-1)        //将输入流中读到的数据放入缓冲区buf中
        {
            //一次是读所有数据
            System.out.println(new String(buf,0,len));
        }
    }
}
