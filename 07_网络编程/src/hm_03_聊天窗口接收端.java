import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class hm_03_聊天窗口接收端 {
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动.....");
        //1.创建一个Socket,并且要绑定端口,不能放入while里面否则会出现端口被占用的情况
        DatagramSocket ds = new DatagramSocket(10001);
        while (true) {
            //2.创建数据包，并定义接受数据包的大小，并存储接受的数据
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            //3.使用Socket服务的receive方法来接受数
            ds.receive(dp);
            //4.把接受的数据进行解码
            String ip = dp.getAddress().getHostAddress();//获取主机的ip
            int port = dp.getPort();//获取端口
            String text = new String(dp.getData(), 0, dp.getLength());//将字符数组从0-尾部转换成String
            System.out.println(ip + ":" + ":" + text);
        }
//            //5.关闭Socket资源
//            ds.close();

    }
}
