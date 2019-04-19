public class hm_01_选择排序 {
    public static void main(String[] args) {
        int arr []={6,4,11,3,7,2,5,97,10,12};
        xzsort(arr);
    }
    //选择排序
    public static void  xzsort(int []arr){
        for(int i=0;i<arr.length-1;i++){//每一趟找到一次最小值
            /*把a[i]的值和i后面的值都进行比较，从而把最小的那个值交换到前面*/
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

        }
        //打印输出
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
    }
}
