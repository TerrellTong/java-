package 其他IO类;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class hm_03_合并文件夹 {
    public static void main(String[] args) throws IOException {
        //定义要合并的文件
        File file = new File("G:\\partfiles");
        //创建一个InputStream对象集合
        ArrayList<FileInputStream> a = new ArrayList<FileInputStream>();
        for(int i=1;i<=33;i++)
            //把每一个File都添加给他们
            a.add(new FileInputStream(new File(file,i+".part")));
        //将集合a变成Enumeration
        Enumeration en = Collections.enumeration(a);
        //创建序列流
        SequenceInputStream sis = new SequenceInputStream(en);
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream(new File(file,"66.flv"));
        //合并
        byte [] buf = new byte[1024];
        int len=0;
        while ((len=sis.read(buf))!=-1)
            fos.write(buf,0,len);
        //关流
        fos.close();
        sis.close();
    }
}
