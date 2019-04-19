public class Zi extends Fu {
    int num = 8;
    {
        System.out.println("Zi");
    }
    Zi()
    {
        super();
        //显示初始化
        //构造代码块初始化
        show();
    }
    void show ()
    {
        System.out.println("zi show..."+num);
    }

}
