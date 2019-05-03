import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class hm_04_TCP服务端 {
    /*
     * 建立tcp服务端的思路：
     * 1，创建服务端socket服务。通过ServerSocket对象。
     * 2，服务端必须对外提供一个端口，否则客户端无法连接。
     * 3，获取连接过来的客户端对象。
     * 4，通过客户端对象获取socket流读取客户端发来的数据
     * 		并打印在控制台上。
     * 5，关闭资源。关客户端，关服务端。
     */
    public static void main(String[] args) throws IOException {
        System.out.println("TCP服务端启动");
        //1.创建服务端对象,并绑定到指定的端口
        ServerSocket ss = new ServerSocket(10002);
        //2.获取连接过来的客户端对象
        Socket s = ss.accept();
        //获取ip地址
        String ip = s.getInetAddress().getHostAddress();
        //3.通过socket对象获取输入流，要读取客户端发送的数据
        InputStream in =s.getInputStream();
        byte[] buf = new byte[1024];
        in.read(buf,0,buf.length);
        String text = new String(buf,0,buf.length);
        System.out.println(ip+":"+text);
        //4.关闭资源
        s.close();
        ss.close();
    }
}
