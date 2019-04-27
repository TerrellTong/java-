package File对象;

import java.io.File;

public class hm_02_删除一个带目录的内容 {
    public static void main(String[] args) {
        //获取demo1的文件对象
        File file = new File("G:\\demo1");
        Delete(file);
    }

    private static void Delete(File file) {
        //获取当前目录的所有目录对象数组
        File[] files = file.listFiles();
        //删除子文件夹目录和文件
        for(int i=0;i<files.length;i++)
        {
            if(files[i].isDirectory())//如果是目录，就继续递归
                Delete(files[i]);
            files[i].delete();
        }
        //删除根
        file.delete();
    }
}
