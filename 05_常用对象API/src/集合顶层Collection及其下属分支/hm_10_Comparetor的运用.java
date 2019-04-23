package 集合顶层Collection及其下属分支;

import java.util.Iterator;
import java.util.TreeSet;

public class hm_10_Comparetor的运用 {
    public static void main(String[] args) {
        /*CompareToBylength实现了Comparator的compare完成了根据字符串长度进行比较*/
        TreeSet ts = new TreeSet(new CompareToBylength());

        ts.add("cde");
        ts.add("abz");
        ts.add("x");
        ts.add("tz");
        ts.add("gh");

        Iterator it =ts.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
