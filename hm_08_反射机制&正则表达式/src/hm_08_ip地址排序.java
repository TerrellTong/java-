import java.util.TreeSet;

public class hm_08_ip地址排序 {
    /*
    * ip地址排序。
     * 192.168.10.34 127.0.0.1 3.3.3.3  105.70.11.55
     * 由于是对象排序则我们用TreeSet集合
    * */
    public static void main(String[] args) {
        String ip_str = "192.168.10.34 127.0.0.1 3.3.3.3  105.70.11.55";
        //将ip_str中每个字符串都添加两个0,使3变成003
        String str = ip_str.replaceAll("(\\d+)","00$1");
        //保留数字后三位
        str = str.replaceAll("0*(\\d{3})","$1"); //如果是"+"则保留出现一次的
        System.out.println(str);
        //字符串切割成字符串数组
        String [] arr = str.split(" +");
        //定义TreeSet集合来进行对象排序
        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0;i<arr.length;i++)
            ts.add(arr[i]);//将字符串数组添加进集合
        for(String ip:ts )
            System.out.println(ip.replaceAll("0*(\\d+)","$1"));

    }
}
