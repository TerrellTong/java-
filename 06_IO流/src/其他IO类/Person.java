package 其他IO类;

import java.io.Serializable;

/*Serializable:用于给被序列化的类加入ID号*/

public class Person implements Serializable {   //这个class对象要实现Serializable接口
    private  String name;
    private  int age;
    public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
