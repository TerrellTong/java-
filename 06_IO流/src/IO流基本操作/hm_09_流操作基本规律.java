package IO流基本操作;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hm_09_流操作基本规律 {
    public static void main(String[] args) throws IOException {
        /*1.复制一个文本文件*/
        copy();
    }

    private static void copy() throws IOException {
        //读文本文件的数据
        FileReader fr = new FileReader("file.txt");
        //创建一个写入文件的对象
        FileWriter fw = new FileWriter("file1.txt");
        char [] buf = new char[1024];
        int len=0;
        while((len=fr.read(buf))!=-1)
            fw.write(buf);//把buf的数据写入新文件
        //关闭流
        fr.close();
        fw.close();
    }
}
