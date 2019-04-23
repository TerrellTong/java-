package 集合顶层Collection及其下属分支;

import java.util.ArrayList;
import java.util.Iterator;

public class hm_07_ArrayList演示 {
    public static void main(String[] args) {
        ArrayList a1 =new ArrayList();
        a1.add(new Person("lisi1",21));
        a1.add(new Person("lisi2",22));
        a1.add(new Person("lisi3",23));
        a1.add(new Person("lisi4",24));

        Iterator it = a1.iterator();
        while(it.hasNext())
        {
            Person p = (Person)it.next(); //强制转换,因为it.next()取出来的对象是Obj类没有.getAge()函数
            System.out.println(p.getName()+".."+p.getAge());
        }
    }
}
