import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class hm_05_test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //创建主板对象
        Mainboard mb = new Mainboard();
        mb.run();
        //与配置文件进行关联,以后的修改操作只要在配置文件中进行即可
        File congfile = new File("pci.properties");
        //用properties记录文件中的键值对
        Properties pro = new Properties();
        //创建一个字节流并与文件关联,FileInputStream是读取字节流
        FileInputStream fin = new FileInputStream(congfile);
        //从字节流中读取键值对
        pro.load(fin);
        //开始遍历
        for(int i=0;i<pro.size();i++)
        {
            //得到配置文件中pci所对应的值
            String name =pro.getProperty("pci"+(i+1));
            //获取它的字节码对象
            Class clazz = Class.forName(name);
            //通过字节码对象生成一个新的对象
            PCI p = (PCI)clazz.newInstance();
            p.run();
            p.close();
        }
        //关流
        fin.close();
    }

}
