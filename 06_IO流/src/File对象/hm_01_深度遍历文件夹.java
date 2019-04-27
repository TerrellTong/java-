package File对象;

import java.io.File;

public class hm_01_深度遍历文件夹 {
    public static void main(String[] args) {
        File dir = new File("G:\\demo");
        ListAll(dir,0);
    }

    private static void ListAll(File dir,int level) {
        System.out.println(dir.getName());
        //获取指定目录下当前的所有文件夹或文件对象
        level++;
        //获取当前目录下的所有文件对象数组
        File[] files = dir.listFiles();

        for(int x=0;x<files.length;x++)
        {
            if(files[x].isDirectory())//判断是否是文件夹
            {
                ListAll(files[x],level);
            }
            else
                System.out.println(files[x].getName());
        }
    }
}
