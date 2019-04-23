package 集合顶层Collection及其下属分支;

import java.util.Iterator;
import java.util.LinkedList;

public class hm_06_LinkedList演示 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("abc1");
        link.add("abc2");
        link.add("abc3");
        link.add("abc4");
        System.out.println(link);
        System.out.println(link.getFirst()); //获取第一个但是不删除
        System.out.println(link.getFirst());
        Iterator it =link.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
