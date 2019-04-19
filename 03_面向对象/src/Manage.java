public class Manage extends Person {
    private  int bounus;
    Manage(String name ,String id,int salary,int bounus)
    {
        super(name,id,salary);
        this.bounus = bounus;
    }
     public void work()
    {
        System.out.println("manage..");
    }
}
