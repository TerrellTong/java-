package com.company;

public class hm_01_函数的格式 {

    public static void main(String[] args) {
	// write your code here
        int a = 3;
        int b = 5;
        int c;
        c = add(a,b);
        System.out.println(c);
    }

   public static int add (int a,int b)
    {
        return  a+b;
    }

}
