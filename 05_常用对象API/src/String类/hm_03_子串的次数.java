package String类;

/*
    思路：
 * 1，要找的子串是否存在，如果存在获取其出现的位置。这个可以使用indexOf完成。
 * 2，如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该子串，
 * 而剩余字符串的起始位是出现位置+子串的长度.
 * 3,以此类推，通过循环完成查找，如果找不到就是-1，并对 每次找到用计数器记录。
通过indexof()函数来获得目标子串的起始位置
*/

import java.util.Scanner;

public class hm_03_子串的次数 {
    public static void main(String[] args) {
//      String str = "nbaernbatnbaynbauinbaopnba";/
//      String str = "nbaernbatynbauinbaopnba";
        System.out.print("输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.print("输入子串:");
        String key = sc.nextLine();
        //计数器
        int count=0;
        //记录key出现的位置
        int index=0;
        while((index=str.indexOf(key))!=-1)  //indexOf()返回值是第一次出现的位置，判断是否有这个子串
        {
            str = str.substring(index+key.length());//赋给子串
            count++;
        }
        System.out.println(count);
    }
}
