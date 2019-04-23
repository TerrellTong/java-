package 集合顶层Collection及其下属分支;

import java.util.HashSet;
import java.util.Iterator;

public class hm_08_HashSet演示 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("hahah");
        hs.add("xixii");
        hs.add("hehe");
        hs.add("heihei");

        Iterator it =hs.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
