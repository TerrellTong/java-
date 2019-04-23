package 集合顶层Map及其下属分支;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hm_01_Map常用方法演示 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
      //  show(map);
        method(map);
    }
    public static void method(Map<Integer, String> map)
    {
        map.put(8,"wangwu");
        map.put(2,"zhaoliu");
        map.put(7,"xiaoqiang");
        map.put(6,"wangcai");

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it1 = entrySet.iterator();
        while (it1.hasNext())
        {
            Map.Entry<Integer,String> me =it1.next();
            System.out.println(me.getKey()+":"+me.getValue());
        }



        //取出map中的所有元素
        //原理，通过keySet方法获取map中所有的键所在的Set集合，再通过Set的迭代器获取到每一个键
        //在对每一个键通过map集合的get方法获取其对应的值即可

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> it =  keySet.iterator();

        while (it.hasNext())
        {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }

    private static void show(Map<Integer, String> map) {
        //添加元素
        System.out.println(map.put(8,"wangcai"));
        System.out.println(map.put(8,"xiaoqiang")); //值存在相同的会覆盖
        map.put(7,"zhangssan");
        map.put(2,"zhaosi");
        //删除
        //System.out.println("remove:"+map.remove(2));
        //判断
        System.out.println("contain:"+map.containsKey(3));
        //获取
        System.out.println("get:"+map.get(8));
        System.out.println(map);

    }

}
