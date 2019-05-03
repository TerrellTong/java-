public class SoundCard implements PCI {
    public void run()
    {
        System.out.println("sound open");
    }
    public void close()
    {
        System.out.println("sound close");
    }
}
