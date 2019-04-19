public class hm_06_生产者消费者 {
    public static void main(String[] args) {
        Resouce02 r01 = new Resouce02();
        //创建两个任务
        Producer pro =  new Producer(r01);
        Consumer con = new Consumer(r01);
        //创建消费者和生产者的进程
        Thread t1 = new Thread(pro);
        Thread t2 =new Thread(con);
        t1.start();
        t2.start();
    }
}
