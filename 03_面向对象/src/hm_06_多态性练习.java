public class hm_06_多态性练习 {
    public static abstract class Animal
    {
        abstract void eat();
    }
    public static class Dog extends Animal
    {
        void eat()
        {
            System.out.println("啃骨头");
        }
    }
    public static class Cat extends Animal
    {
        void eat()
        {
            System.out.println("吃鱼");
        }
    }

    public static void main(String[] args) {
        Cat c =new Cat();
        Dog d = new Dog();
        method(c);
        method(d);
    }
    public static void method(Animal a)
    {
        a.eat();
    }
}




