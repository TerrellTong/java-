import java.io.IOException;
import java.net.*;

public class hm_02_UDP发送端 {
    /*
     * 创建UDP传输的发送端。
     * 思路：
     * 1，建立udp的socket服务。
     * 2，将要发送的数据封装到数据包中。
     * 3，通过udp的socket服务将数据包发送出去。
     * 4，关闭socket服务。
     */
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动.....");
        //1.UDPSocket服务,使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //2.将要发送的数据封装到数据包中
        String str = "udp传输演示，哥们来了";
            //使用DatagramPacket将数据封装到该对象的数据包中
        byte [] buf = str.getBytes();
        //getByname方法(里面传的是ip地址值，则返回ip地址值，如果是主机名，也会得到对应的ip值)
        DatagramPacket dp
                = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.43.184"),10000);
        //3.通过udp的socket服务将数据包发送出去，使用send方法
        ds.send(dp);
        //4.关闭Socket资源
        ds.close();
    }
}
