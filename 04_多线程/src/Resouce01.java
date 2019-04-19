public class Resouce01 {
    private String name;
    private int count=1;
    private boolean flag = false;
    public synchronized void set(String name) {
        if(flag)
            try {
                this.wait();
            }
            catch (InterruptedException e)
            {}
        this.name = name + count;
        count++;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
        flag = true;
        notify();
    }
    public synchronized void out()
    {
        if(!flag) //如果是false就进行等待
        try {
            this.wait();
        }
        catch (InterruptedException e)
        {}
        System.out.println(Thread.currentThread().getName()+"...消费者......."+this.name);

        flag = false;
        notify();
    }
}
