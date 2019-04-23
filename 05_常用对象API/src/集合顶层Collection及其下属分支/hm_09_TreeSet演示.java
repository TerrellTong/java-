package 集合顶层Collection及其下属分支;

import java.util.Iterator;
import java.util.TreeSet;

public class hm_09_TreeSet演示 {
    public static void main(String[] args) {
        /*CompareToBylength实现了Comparator的compare完成了根据字符串长度进行比较*/
        TreeSet ts = new TreeSet();

        /*以Person的年龄进行排序*/

        ts.add(new Person("wangwu",29));
        ts.add(new Person("zhangsan",28));
        ts.add(new Person("lisi",21));
        ts.add(new Person("zhouqi",29));
        ts.add(new Person("zhaoliu",25));

        Iterator it = ts.iterator();
        while (it.hasNext())
        {
            Person p =(Person)it.next();
            System.out.println(p.getName()+":"+p.getAge());
        }
    }
}
