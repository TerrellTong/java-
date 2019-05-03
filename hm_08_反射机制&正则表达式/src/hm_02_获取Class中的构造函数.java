import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class hm_02_获取Class中的构造函数 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        createNewObject_2();
    }
    //用带参数的构造函数来创造对象
    private static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String name = "Person";
        //获取字节码对象
        Class clazz = Class.forName(name);
        Constructor constructor = clazz.getConstructor(String.class,int.class);
        //创建对象
        Object obj = constructor.newInstance("小强",39);
    }

    //用无参的构造函数来创造对象
    private static void createNewObject() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = "Person";
        //获取字节码对象
        Class clazz = Class.forName(name);
        //用字节码对象的newInstance方法来创造一个Object对象
        Object obj = clazz.newInstance();  //这个构造函数必须是公有的，以及无参构造函数必须存在
    }
}
