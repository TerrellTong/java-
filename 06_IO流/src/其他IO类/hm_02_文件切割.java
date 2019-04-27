package 其他IO类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class hm_02_文件切割 {
    public static void main(String[] args) throws IOException {
        //新建一个Properties集合来存储待切的文件名和碎片个数
        Properties pro = new Properties();
        File file = new File("G:\\demo.flv");
        //用读取流关联源文件
        FileInputStream fis = new FileInputStream(file);
        //定义一个1M的缓冲区
        byte[] buf = new byte[1024*1024];
        //创建目的源
        FileOutputStream fos = null;

        int len=0;
        int count=1;
        //定义被切割的文件放在哪
        File dir = new File("G:\\partfiles");
        if(!dir.exists())
            dir.mkdirs();
        while ((len=fis.read(buf))!=-1)
        {
            //创建一个从第一个file的抽象路径名和一个孩子的路径字符串
            fos = new FileOutputStream(new File(dir,(count++)+".part"));
            fos.write(buf,0,len);
        }
        pro.setProperty("partnum",count+"");
        pro.setProperty("name",file.getName());
        //将pro的数据放入到一个文件中
        fos = new FileOutputStream(new File(dir,count+".properties"));
        //持久化数据
        pro.store(fos,"");

        //关流
        fos.close();
        fis.close();
    }
}
