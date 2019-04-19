public class Single {
    private static Single s = new Single();

    private  Single(){};  //私有化构造函数

    public static Single getInstance() //获取本类对象
    {
        return s;
    }
}
