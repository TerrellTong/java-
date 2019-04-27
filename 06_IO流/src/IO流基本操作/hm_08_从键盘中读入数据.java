package IO流基本操作;

import java.io.IOException;
import java.io.InputStream;

public class hm_08_从键盘中读入数据 {
    public static void main(String[] args) throws IOException {
      //  readkey();
        readkey2();
    }

    private static void readkey2() throws IOException {
        /*录入键盘数据，将输入的数据变成大写显示，自定义结束*/
        //获取键盘读取流,字节流
        InputStream in = System.in;
        //获得存储变量的容器
        StringBuilder sb = new StringBuilder();
        //录入数据
        int ch = 0;
        while ((ch=in.read())!=-1)
        {
            //判断是否是换行标记
            if( ch == '\n')
            {
                String temp = sb.toString();//将StringBuilder容器转换成字符串
                if("over".equals(temp))
                    break;
                System.out.println(temp.toUpperCase());//将输入的变为大写
                //清空容器
                sb.delete(0,sb.length());
            }
            else
                sb.append((char)ch); //将ASCII码转换成字符
        }

    }

    public static void readkey() throws IOException {
        InputStream in = System.in;   //拿到键盘读取流
        int ch = in.read();
        System.out.println(ch);
    }
}
