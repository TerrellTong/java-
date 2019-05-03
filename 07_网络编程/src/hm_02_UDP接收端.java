import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class hm_02_UDP接收端 {
    /*
     * 建立UDP接收端的思路。
     * 1，建立udp socket服务,因为是要接收数据，必须要明确一个端口号。
     * 2，创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据.
     * 3，使用socket服务的receive方法将接收的数据存储到数据包中。
     * 4，通过数据包的方法解析数据包中的数据。
     * 5，关闭资源
     */
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动.....");
        //1.创建一个Socket,并且要绑定端口
        DatagramSocket ds = new DatagramSocket(10000);
        //2.创建数据包，并定义接受数据包的大小，并存储接受的数据
        byte[] buf = new byte[1024];
        DatagramPacket dp =new DatagramPacket(buf,buf.length);
        //3.使用Socket服务的receive方法来接受数
        ds.receive(dp);
        //4.把接受的数据进行解码
        String ip = dp.getAddress().getHostAddress();//获取主机的ip
        int port = dp.getPort();//获取端口
        String text = new String(dp.getData(),0,dp.getLength());//将字符数组从0-尾部转换成String
        System.out.println(ip+":"+":"+text);
        //5.关闭Socket资源
        ds.close();
    }
}
