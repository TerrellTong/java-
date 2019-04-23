package 集合顶层Collection及其下属分支;

import java.util.ArrayList;
import java.util.Collection;

public class hm_01_集合方法演示 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();  //多态ArrayList实现了Collection接口
        show(coll);
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        show1(c1,c2);
    }
    public static void show1(Collection c1,Collection c2)
    {
        //给c1添加元素
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        //给c2添加元素
        c2.add("abc2");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println("c1"+c1);
        System.out.println("c2"+c2);
        //演示addAll
        //c1.addAll(c2);
        //演示removeAll
        c1.removeAll(c2);  //将两个集合中相同元素从调用removeAll的集合中删除
        System.out.println(c1);
    }
    public static void show(Collection coll)
    {
        //1.添加元素。add
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        System.out.println(coll);
        //2.删除元素。remove
        coll.remove("abc2");//会改变集合的长度
        System.out.println(coll);
    }
}
