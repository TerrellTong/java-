package 其他IO类;

import java.io.*;

public class hm_04_对象序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream cos = new ObjectOutputStream(new FileOutputStream("obj.object"));
//        //对象序列化。被序列化的对象必须实现Serializable接口
//        cos.writeObject(new Person("小乔",30));
//        //关流
//        cos.close();

        //读文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
        //对象反序列化
        Person p =(Person)ois.readObject();
        System.out.println(p.getName()+":"+p.getAge());
    }
}
