package 泛型;

public class Person implements Comparable<Person> {
    private  String name;
    private  int age;

    @Override
    public int compareTo(Person o) {
        int temp = this.age-o.age;
        return temp==0?this.name.compareTo(o.name):temp;

    }

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
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
}
