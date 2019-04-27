package Properties集合;

/*定义功能，获取一个应用程序运行的次数，如果超过5次，
    给出使用次数已到请注册的提示。并不要在运行程序。*/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class hm_04_次数练习 {
    public static void main(String[] args) throws IOException {
        //创建一个file对象
        File file = new File("count.txt");
        /*判断文件是否存在，如果存在就读
        取这个配置文件，否则创建一个新文件*/
        if(!file.exists())
            file.createNewFile();
        //创建一个读文件的对象
        FileReader fr = new FileReader(file);
        //创建一个Properties集合对象
        Properties pro =new Properties();
        //将fr文件载入到pro集合
        pro.load(fr);
        //修改配置的文件中的count信息
        int count=0;
        if(pro.getProperty("count")!=null)
        {
            count=Integer.parseInt(pro.getProperty("count"));//String转成int
        }
        count++;
        if(count>5)
        {
            //直接中断所有程序
            throw new RuntimeException("体验次数已经超过了5次，无法再进行游戏了");
        }
        //设置count并将int转成String
        pro.setProperty("count",String.valueOf(count));
        System.out.println("count:"+count);
        //创建一个写文件的对象
        FileWriter fw = new FileWriter(file);
        //持久化
        pro.store(fw,"count");
        //关流
        fw.close();
        fr.close();
    }
}
