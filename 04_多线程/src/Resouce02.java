import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resouce02 {
    private String name;
    private int count=1;
    private boolean flag = false;
    //创建一个锁
    Lock lock = new ReentrantLock();
    //通过已有的锁创建两个监视器，一个监视生产者一个监视消费者
    Condition pro_con = lock.newCondition();
    Condition con_con = lock.newCondition();
    public  void set(String name) {
        lock.lock();
        try {
            while (flag)
                try {
                    pro_con.await();
                } catch (InterruptedException e) {
                }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者.1.5..." + this.name);
            flag = true;
            con_con.signal();//唤醒消费者的进程
        }
        finally {
            lock.unlock();
        }
    }
    public synchronized void out()
    {
        lock.lock();
        try {
            if (!flag) //如果是false就进行等待
                try {
                    con_con.await();
                } catch (InterruptedException e) {
                }
            System.out.println(Thread.currentThread().getName() + "...消费者.1.5......." + this.name);

            flag = false;
            pro_con.signal();
        }
        finally {
            lock.unlock();
        }
    }
}
