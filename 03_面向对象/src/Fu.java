public class Fu {
    int num =9;
    {
        System.out.println("Fu");
    }
    Fu()
    {
        super();
        //显示初始化
        //构造代码块初始化
        show();
        return;
    }
    void show()
    {
        System.out.println("fu show"+num);
    }
}
