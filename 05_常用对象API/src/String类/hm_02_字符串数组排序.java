package String类;

public class hm_02_字符串数组排序 {
    public static void main(String[] args) {
        String [] arr = {"nba","abc","cba","zz","qq","haha"};
        for (int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].compareTo(arr[i])<0) //如果j的位置的值比i值小就互换,用CompareTo方法完成字符串比较
                {
                    String temp= "";
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;

                }
            }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
