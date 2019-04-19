public class hm_05_接口类练习 {
    public static void main(String[] args) {
        useUSB(new Upan());
    }
    //使用规则
    public static void useUSB(USB u) //u是接口类型的引用，指向子类的对象
    {
        u.open();
        u.close();
    }
}
