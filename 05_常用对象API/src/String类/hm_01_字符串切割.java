package String类;

public class hm_01_字符串切割 {
    public static void main(String[] args) {
        String s = "张三,李四,王五";
        String [] arr = s.split("李四");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
}
