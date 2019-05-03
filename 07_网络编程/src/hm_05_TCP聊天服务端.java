import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class hm_05_TCP聊天服务端 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动");
        //创建一个服务器端对象,并且绑定端口
        ServerSocket ss = new ServerSocket(10004);
        //获取Socket对象
        Socket s = ss.accept();
        //获取ip地址
        String ip = s.getInetAddress().getHostAddress();
        while (true)
        {
            //获取Socket输出流
            InputStream in =s.getInputStream();
            //读数据
            byte [] buf = new byte[1024];
            //len是返回读取的数据总数
            int len = in.read(buf);
            String text =new String(buf,0,len);
            System.out.println(ip+":"+text);
            //服务端向客户端发送数据
            OutputStream out = s.getOutputStream();
            out.write("服务器收到".getBytes());
//            //关流
//            s.close();
//            ss.close();
        }
    }
}
