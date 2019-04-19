package com.company;

public class hm_03_两个明确练习 {
    public static void main(String[] args){
        boolean c;
        draw(4,6);
        c=PanDuan(3,3);
        System.out.println(c);
        System.out.println(Compare(5,1));
        Pri();
    }

    public static void draw (int row , int col){
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static boolean PanDuan(int a,int b)
    {
        if(a!=b)
            return false;
        else
            return true;
    }
    public static int Compare(int a,int b)
    {
       return (a>b)?a:b;
    }
    public static void Pri()
    {
        for( int row=1;row<=9;row++){
            for(int col=1;col<=row;col++) {
                System.out.print(row + "*" + col + "=" + row * col);
                System.out.print("\t");
            }
            System.out.println();
    }
    }


}
