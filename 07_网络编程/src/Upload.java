import java.io.*;
import java.net.Socket;

public class Upload implements Runnable {
    private Socket s ;
    public Upload(Socket s)
    {
        this.s=s;
    }
    public void run()
    {
        int count=0;
        //获取ip地址
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+".....connected");
        try {
            //读取客户端发来的数据
            InputStream in = s.getInputStream();
            //将读取到的数据存储在一个文件夹中
            File dir = new File("G:\\pic");
            if(!dir.exists())
                dir.mkdirs();
            //文件存储在哪个目录以及文件的名字
            File file= new File(dir,ip+".jpg");
            while (file.exists())
                file = new File(dir,ip+"("+(++count)+").jpg");
            //关联文件对象file,并把客户端发送过来的数据写入文件中
            FileOutputStream fos = new FileOutputStream(file);
            byte [] buf = new byte[1024];
            int len = 0;
            while ((len=in.read(buf))!=-1)
                fos.write(buf,0,len);
            //获取Socket输出流,将上传成功的字样发送给客户端
            OutputStream out = s.getOutputStream();
            out.write("上传成功".getBytes());
            //关闭资源
            s.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
