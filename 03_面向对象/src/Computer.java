public class Computer {
    private int state = 2;
    public void run() throws LanPing,MaoYan
    {
        if(state == 1)
            throw new LanPing("蓝屏了");
        if(state == 2)
            throw new MaoYan("冒烟了");
        System.out.println("电脑运行");
    }
    public void reset()
    {
        state = 0;
        System.out.println("电脑重启");
    }
}
