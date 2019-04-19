public class Producer implements Runnable {
    private Resouce02 r;
    Producer(Resouce02 r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
            r.set("烤鸭");
    }
}
