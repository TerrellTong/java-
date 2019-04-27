package IO流基本操作;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*将读到的数据放入到新文件中*/

public class hm_03_复制文本文件 {
    public static void main(String[] args) throws IOException {
        //创建读对象
        FileReader fd = new FileReader("demo.txt");
        char [] buf = new char[1024];
        int len=0;
        //读文件
        while ((len=fd.read(buf))!=-1);
        //创建写文件
        FileWriter fw = new FileWriter("demo1.txt");
        fw.write(buf);
        //两个流文件都关闭
        fw.close();
        fd.close();
    }
}
