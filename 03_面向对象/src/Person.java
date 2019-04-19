public abstract class Person {
    private String name;
    private String id;
    private int salary;
    Person(String name ,String id ,int salary )
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public  abstract void work();
}
