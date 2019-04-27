package IO流基本操作;

import java.io.FileWriter;
import java.io.IOException;

public class hm_01_FileWritter示例 {
    public static void main(String[] args) throws IOException {
        /*创建一个可以往文件中写入字符数据的字符输出流对象。
        如果构造函数中加入true，可以实现对文件进行续写！
        */
        FileWriter fw = new FileWriter("demo.txt");
        //调用Writer对象中的write(string)方法，写入数据。
        fw.write("abcde");
        //关闭流，关闭资源。在关闭前会先调用flush刷新缓冲中的数据到目的地。
        fw.close();

    }
}
