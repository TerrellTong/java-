public class Consumer implements Runnable {
    private Resouce02 r;
    Consumer(Resouce02 r)
    {
        this.r = r;
    }
    public void run()
    {
        while (true)
            r.out();
    }
}
