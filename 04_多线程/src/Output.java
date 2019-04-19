public class Output implements Runnable {
    Resouce r;
    Output(Resouce r)
    {
        this.r=r;
    }
    public void run()
    {
        while (true)
            r.out();
    }
}
