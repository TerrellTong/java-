import java.util.Scanner;

public class hm_04_获取16进制的表现形式 {
    public static void main(String[] args) {
        toHex(26);
        toBinary(5);
        toOcttal(26);
    }

    public static void toOcttal(int i) {
        trans(i,7,3);
    }

    public static void toBinary(int i) {
        trans(i,1,1);
    }

    public static void toHex(int i) {
        trans(i,15,4);
    }

    /*base代表满多少进1，offset代表右移多少位数*/
    public static void trans(int num,int base ,int offset)
    {
        if(num == 0)
        {
                System.out.println("0");
                return;
        }
        //对应关系表
        char chs []={'0','1','2','3','4',
                    '5','6','7','8',
                    '9','A','B','C',
                    'D','E','F'};
        /*定义一个临时容器*/
        char arr []=new char [32];//因为int是4个字节是32位
        int pos = arr.length;
        while (num!=0)
        {
            int temp = num & base; //与当前位数进行‘与’运算求得最后4/3/1位数的结果
            arr[--pos] = chs[temp];
            num = num >>> offset; //右移
        }
        for(int x =pos;x<arr.length;x++)
            System.out.print(arr[x]);
        System.out.println();

    }
}
