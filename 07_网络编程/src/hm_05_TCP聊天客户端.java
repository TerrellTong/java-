import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class hm_05_TCP聊天客户端 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //创建一个socket与服务端通信
        Socket socket = new Socket("192.168.0.106",10004);
        //写入待输入的字符串
        String str = "";
        while (!str.equals("88")) {
            //写数据
            System.out.println("输入你要发送的数据");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            //获取Socket中的输出流
            OutputStream out = socket.getOutputStream();
            //写数据
            out.write(str.getBytes());
            //获取服务端发送过来的数据
            InputStream in = socket.getInputStream();
            byte[] buf = new byte[1024];
            in.read(buf);
            System.out.println(new String(buf,0,buf.length));
        }
        //关流
        socket.close();


    }
}
