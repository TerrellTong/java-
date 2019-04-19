public class hm_02_冒泡排序 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 11, 3, 7, 2, 5, 97, 10, 12};
        mpsort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

    }
    //冒泡排序
    public static void mpsort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++) //最外层的圈数
        {
            for(int j=0;j<arr.length-1-i;j++)//-1是为了避免越界，-i为了让外循环增加一次，内循环的参数随着外循环的增加而改变
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
