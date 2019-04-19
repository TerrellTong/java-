public class hm_01_多线程实现 {
    public static void main(String[] args) {
//        Demo d1 = new Demo("wangcai");
//        Demo d2 = new Demo("xiaoming");
//        d1.start();
//        d2.start();
        Demo02 d = new Demo02();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}
