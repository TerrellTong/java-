package String类;
/*
*  3，两个字符串中最大相同的子串。
 * "qwerabcdtyuiop"
 * "xcabcdvbn"
 *
 * 思路：
 * 1，既然取得是最大子串，先看短的那个字符串是否在长的那个字符串中。
 * 如果存在，短的那个字符串就是最大子串。
 * 2，如果不是呢，那么就将短的那个子串进行长度递减的方式去子串，去长串中判断是否存在。
 * 如果存在就已找到，就不用在找了。
* */

import java.util.Scanner;

public class hm_04_最大相同子串 {
    public static void main(String[] args) {
        System.out.print("输入字符串1:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("输入字符串2:");
        String str2 = sc.nextLine();
        if(str1.length()<str2.length())//如果str1的长度小于str2的长度我们就互换，始终保持str1的长度大于str2的长度
        {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        for(int i=0;i<str2.length();i++)
            for(int j=0,k=str2.length()-i;k!=str2.length()+1;j++,k++)
            {

                if(str1.contains(str2.substring(j,k)))
                {
                    System.out.println(str2.substring(j,k));
                    return;
                }
            }
    }
}
