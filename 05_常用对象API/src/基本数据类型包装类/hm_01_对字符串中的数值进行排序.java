package 基本数据类型包装类;

public class hm_01_对字符串中的数值进行排序 {
    public static void main(String[] args) {
        String str="20 78 9 -7 88 36 29";
        String []str1=str.split(" ");
        int [] arr =new int [str1.length];
        for(int i=0;i<str1.length;i++)
            arr[i]=Integer.parseInt(str1[i]);
        for(int i=0;i<str1.length-1;i++)
            for(int j=i+1;j<str1.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        for(int i=0;i<str1.length;i++)
            System.out.print(arr[i]+" ");
    }
}
