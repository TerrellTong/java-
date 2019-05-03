import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class hm_07_MyTomcat服务端 {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket
        ServerSocket ss = new ServerSocket(9977);
        //获取Socket
        Socket s = ss.accept();
        //获取输入流，用来读文件
        InputStream in = s.getInputStream();
        byte [] buf = new byte[1024];
        int len=in.read(buf);
        String text = new String(buf,0,len);
        System.out.println(text);
        //给客户端一个反馈信息
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("<font color='red' size='7'>欢迎光临</font>");
        //关流
        s.close();
        ss.close();
    }
}
