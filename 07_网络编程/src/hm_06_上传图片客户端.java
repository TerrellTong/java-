import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class hm_06_上传图片客户端 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //1创建Socket
        Socket socket = new Socket("192.168.0.106",10005);
        //2找到图片的资源,并关联
        FileInputStream fin = new FileInputStream("G:\\client.jpg");
        //3用Socket中的out流，将图片资源写入到服务器端
        byte[] buf = new byte[1024];
        int len =0;
        OutputStream out = socket.getOutputStream();
        while ((len=fin.read(buf))!=-1)
            out.write(buf,0,len);
        //告诉服务端，数据发送完毕，让服务端可以停止读数据
        socket.shutdownOutput();

        //读取服务端发回的内容
        InputStream in = socket.getInputStream();
        byte[] bufin = new byte[1024];
        int lenin = in.read(buf);
        String text = new String(bufin,0,lenin);
        System.out.println(text);
        //关流
        fin.close();
        socket.close();
    }
}
