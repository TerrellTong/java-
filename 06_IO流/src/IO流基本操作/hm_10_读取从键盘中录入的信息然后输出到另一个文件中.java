package IO流基本操作;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class hm_10_读取从键盘中录入的信息然后输出到另一个文件中 {
    public static void main(String[] args) throws IOException {
        PrintOut();
    }

    private static void PrintOut() throws IOException {
        //获取字节流并将字节流转换成字符流
        InputStreamReader in =new InputStreamReader(System.in);
        //获取文本写入对象,字符流
        FileWriter fw =new FileWriter("keyboard.txt");
        //读键盘的数据
        int ch =0;
        //创建一个存放数据的缓冲区
        StringBuilder sb = new StringBuilder();
        while ((ch=in.read())!=-1)
        {
            if(ch == '\n') //如果输入的是回车就判断是否over，如果是就退出
            {
                fw.write((char)ch);
                String temp = sb.toString();
                if("over".equals(temp))
                    break;
                sb.delete(0,sb.length());
            }
            else    //将输入的数据添加到缓冲区中
            {
                sb.append((char)ch);
                fw.write((char)ch);
            }
        }

        fw.close();

    }
}
