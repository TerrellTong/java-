package 集合顶层Map及其下属分支;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class hm_02_获取字符串中每个字母出现的次数 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            //取出字符串中的每个字符与表进行比较
            if(hm.containsKey(str.charAt(i)))
            {
              int count = hm.get(str.charAt(i));
              count++;
              hm.put(str.charAt(i),count);
            }
            else
                hm.put(str.charAt(i),1);
        }
        //通过迭代来得到题目所要求的格式
        Iterator<Character> it = hm.keySet().iterator();
        while (it.hasNext())
        {
            Character key = it.next();
            Integer value = hm.get(key);
            System.out.print(key+"("+value+")");
        }
    }
}
