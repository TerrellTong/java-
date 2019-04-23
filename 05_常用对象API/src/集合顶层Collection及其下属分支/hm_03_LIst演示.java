package 集合顶层Collection及其下属分支;

import java.util.List;
import java.util.ArrayList;

public class hm_03_LIst演示 {
    public static void main(String[] args) {
        List list = new ArrayList();
        show(list);
    }
    public static void show(List list)
    {
        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);
        //插入元素
       // list.add(1,"abc9");

        //删除元素
        System.out.println("remove:"+list.remove(2));
        System.out.println(list);


    }

}
