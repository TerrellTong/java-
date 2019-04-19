public class Demo02 implements Runnable {
    public void run()
    {
        for(int x=0;x<10;x++)
        {
            System.out.println(Thread.currentThread().getName()+"..."+x);
        }
    }
}
