public class hm_01_获取字节码文件对象的三个方法 {
    public static void main(String[] args) throws ClassNotFoundException {
        getClassObject_3();
    }
    //通过给定的类的字符串名称就可以获取该类，调用Class类中的静态方法forName完成
    private static void getClassObject_3() throws ClassNotFoundException {
        String className = "Person";
        Class clazz = Class.forName(className);
        System.out.println(clazz);
    }

    //方法二:通过类的静态属性的.class属性获取class对象
    private static void getClassObject_2() {
        Class clazz = Person.class;
        Class clazz1 = Person.class;
        System.out.println(clazz==clazz1);
    }

    //方法一:通过Object类中的getClass()方法获取字节码对象
    private static void getClassObject_1() {
        Person p = new Person();
        Class clazz = p.getClass();
        Person p1 = new Person();
        Class clazz1 = p1.getClass();
        System.out.println(clazz==clazz1);

    }
}
