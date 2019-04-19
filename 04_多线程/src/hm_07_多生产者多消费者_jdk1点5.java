public class hm_07_多生产者多消费者_jdk1点5 {
    public static void main(String[] args) {
        Resouce02 r02 = new Resouce02();
        //创建两个任务
        Producer pro =  new Producer(r02);
        Consumer con = new Consumer(r02);
        //创建消费者和生产者的进程
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(pro);
        Thread t3 =new Thread(con);
        Thread t4 =new Thread(con);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
