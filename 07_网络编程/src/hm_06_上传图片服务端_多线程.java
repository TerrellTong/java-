import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class hm_06_上传图片服务端_多线程 {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动");
    //创建SeverSocket的对象,绑定端口号
        ServerSocket ss = new ServerSocket(10005);
        while (true)
        {
            Socket s = ss.accept();
            //创建多线程并启动
            new Thread(new Upload(s)).start();
        }
    }
}
