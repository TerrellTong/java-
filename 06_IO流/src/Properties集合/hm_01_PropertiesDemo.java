package Properties集合;

import java.util.Properties;
import java.util.Set;

public class hm_01_PropertiesDemo {
    public static void main(String[] args) {
        //创建Properties集合
        Properties pro = new Properties();
        //添加元素
        pro.setProperty("lisi","21");
        pro.setProperty("wangwu","20");
        pro.setProperty("zhangsan","22");
        pro.setProperty("erq","23");
        //遍历获取元素
        Set<String> names = pro.stringPropertyNames(); //返回一组键
        for(String name : names)
        {
            String value = pro.getProperty(name);
            System.out.println(name+":"+value);
        }
    }
}
