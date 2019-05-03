import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class hm_03_聊天窗口发送端 {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动.....");
        //1.UDPSocket服务,使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //2.将要发送的数据封装到数据包中
        String str="";
        while (!str.equals("886"))
        {
            System.out.println("请输入你要发送的信息:");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            //使用DatagramPacket将数据封装到该对象的数据包中
            byte [] buf = str.getBytes();
            //getByname方法(里面传的是ip地址值，则返回ip地址值，如果是主机名，也会得到对应的ip值)
            DatagramPacket dp
                    = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.0.106"),10001);
            //3.通过udp的socket服务将数据包发送出去，使用send方法
            ds.send(dp);
        }
        //4.关闭Socket资源
        ds.close();
    }
}
