package 集合顶层Collection及其下属分支;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class hm_04_List迭代器的使用 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        //获取列表迭代器，可以实现在迭代过程中完成元素的增删改查
        //注意:只有list集合具备该迭代功能
        ListIterator it = list.listIterator();
        while(it.hasNext())
        {
            Object obj = it.next();
            if(obj.equals("abc2"))
                it.add("abc9");
        }
        System.out.println(list);
    }
}
