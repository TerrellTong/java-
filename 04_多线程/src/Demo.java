public class Demo extends Thread {
    private String name;
    Demo(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for(int x=0;x<10;x++)
        {
            System.out.println(name+"..."+x);
        }
    }

}
