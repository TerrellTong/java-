package Properties集合;

import java.io.*;
import java.util.Properties;

public class hm_03_修改配置信息 {
    public static void main(String[] args) throws IOException {
        //读取文件
        FileReader fr = new FileReader("info.txt");
        //创建集合存储配置信息
        Properties prop = new Properties();
        //将流中的信息存储到集合中
        prop.load(fr);
        //修改配置文件中的某个对象的值
        prop.setProperty("wangwu","16");
        FileWriter fw = new FileWriter("info.txt");
        //持久化
        prop.store(fw,"changed");
        fw.close();
        fr.close();

    }
}
