import java.util.Scanner;

public class hm_03_折半查找 {
    public static void main(String[] args) {
        int arr[] = {4, 9, 15, 21, 25, 36, 39, 45,50,55,58};
        System.out.print("输入要查找的数值:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        zbsearch(arr, key);
        halfsearch(arr, key, 0, arr.length - 1);
    }

    public static void zbsearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {       //如果low大于high则说明没有继续折半的必要了
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("已找到,位置是:" + mid);
                return;
            } else if (arr[mid] > key)
                high = mid - 1; //如果key<中间的数值，则应该从中间位置的左边再进行查找
            else
                low = mid + 1;//如果key>中间的数值，则应该从中间位置的右边再进行查找
        }
        System.out.println("不存在");
    }

    //递归实现
    public static void halfsearch(int[] arr, int key, int low, int high) {
        if (low <= high)//如果low大于high则说明没有继续折半的必要了
        {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.println("已找到,位置是:" + mid);
                return;
            } else if (key < arr[mid])
                /*
                如果key<中间的数值，则应该从中间位置的左边再进行查找
                而且low的值不能设置为0，因为如果查找的路径是先key的右边
                然后key的左边则会导致所要查找的范围增大会出现mid的值计算不准确从而导致报错
                因此在进行递归是low所传进去的参数还是low
                */
                halfsearch(arr, key, low, mid - 1);
            else
                /*
                如果key>中间的数值，则应该从中间位置的左边再进行查找
                而且high的值不能设置为arr.length-1，因为如果查找的路径是先key的左边
                然后key的右边则会导致所要查找的范围增大会出现mid的值计算不准确从而导致报错
                因此在进行递归是high所传进去的参数还是high
                */
                halfsearch(arr, key, mid + 1, high);
        } else
            System.out.println("不存在");
        return;
    }
}

