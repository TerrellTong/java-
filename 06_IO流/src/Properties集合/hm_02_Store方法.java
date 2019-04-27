package Properties集合;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class hm_02_Store方法 {
    public static void main(String[] args) throws IOException {
        //创建Properties集合
        Properties pro = new Properties();
        //添加元素
        pro.setProperty("lisi","21");
        pro.setProperty("wangwu","20");
        pro.setProperty("zhangsan","22");
        pro.setProperty("erq","23");
        //将Properties的对象持久化
        //创建一个输出流
        FileOutputStream fos = new FileOutputStream("info.txt"); //文件字节流
        pro.store(fos,"info");
        //关流
        fos.close();
    }
}
