package 集合顶层Collection及其下属分支;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class hm_02_迭代器使用 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        //使用Collection中的iterator()方法。调用集合中的迭代器方法，是为了获取迭代器对象
        Iterator it = coll.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }
}
