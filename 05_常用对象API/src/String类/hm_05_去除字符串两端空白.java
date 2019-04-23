package String类;

/*实现trim函数*/

import java.util.Scanner;

public class hm_05_去除字符串两端空白 {
    public static void main(String[] args) {
        System.out.print("输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        while (str.charAt(i)==' ')
            i++;
        while (str.charAt(j)==' ')
            j--;
        System.out.println(str.substring(i,j+1));
    }
}
