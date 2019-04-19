package com.company;

public class hm_02_无返回值函数 {
    public static void main(String[] args) {
        // write your code here
        int a = 3;
        int b = 1;
        int c;
        c = add(a,b);
        Print(c);
    }

    public static int add (int a,int b)
    {
        return  a+b;
    }
    public  static  void Print(int c)
    {
        System.out.println(c);
    }
}
