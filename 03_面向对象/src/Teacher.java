public class Teacher {
    private String name;
    private Computer comp;
    Teacher(String name)
    {
        this.name = name;
        comp = new Computer();
    }
    public void prelect() throws MaoYan
    {
        try {
            comp.run();
            System.out.println("讲课");
        }
        catch (LanPing e)
        {
            System.out.println(e.toString());
            comp.reset();
            prelect();
        }
        catch (MaoYan e)
        {
            System.out.println(e.toString());
            test();
            throw e;
        }
    }
    public void test()
    {
        System.out.println("练习");
    }
}
