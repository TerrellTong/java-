package 泛型;

import java.util.Iterator;
import java.util.TreeSet;

public class hm_01_泛型实例 {
    public static void main(String[] args) {
        TreeSet<Person> ts =new TreeSet<Person>();
        ts.add(new Person("lisi",21));
        ts.add(new Person("lisi3",23));
        ts.add(new Person("lisi",21));
        ts.add(new Person("lis0",20));

        Iterator<Person> it = ts.iterator();
        while(it.hasNext())
        {
            Person p =it.next();
            System.out.println(p.getName()+":"+p.getAge());
        }
    }
}
