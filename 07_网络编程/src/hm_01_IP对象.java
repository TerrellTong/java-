import java.net.InetAddress;
import java.net.UnknownHostException;

public class hm_01_IP对象 {
    public static void main(String[] args) throws UnknownHostException {
        //获取本地主机ip地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);//ip的地址与实例对象不同，实例对象的地址是存储在堆内存中的
        //获取其他主机的ip地址对象
        ip = InetAddress.getByName("DESKTOP-2I85CMR");
        System.out.println(ip);
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}
