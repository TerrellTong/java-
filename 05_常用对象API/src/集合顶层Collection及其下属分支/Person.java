package 集合顶层Collection及其下属分支;

public class Person implements Comparable {
    private  String name;
    private  int age;
    public Person()
    {
        super();
    }
    public Person(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Object o)
    {
        Person p =(Person)o;
        if(this.age>p.age)
            return 1;
        if(this.age<p.age)
            return -1;
        else
            return this.name.compareTo(p.name);
    }
}
