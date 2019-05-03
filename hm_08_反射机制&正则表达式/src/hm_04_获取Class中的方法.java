import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class hm_04_获取Class中的方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        getMethodDemo_3();
    }

    //获取多个有参方法
    private static void getMethodDemo_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //创建类对象
        Class clazz = Class.forName("Person");
        //传参数名+参数类型名
        Method method = clazz.getMethod("paramMethod",String.class,int.class);
        Object obj = clazz.newInstance();
        //invoke方法开始调用
        method.invoke(obj,"xiangwang",13);
    }

    //获取单个无参方法
    private static void getMethodDemo_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //创建类对象
        Class clazz = Class.forName("Person");
        Method method = clazz.getMethod("show",null);
//        //创建对象
//        Object obj = clazz.newInstance();
        //创建一个带有参数的对象
        Constructor constructor = clazz.getConstructor(String.class,int.class);
        //通过构造器的对象进行对象初始化
        Object obj = constructor.newInstance("zhangsan",18);
        //调用方法
        method.invoke(obj,null);
    }

    //获取指定Class中的所有公共函数
    private static void getMethodDemo() throws ClassNotFoundException {
        //创建类对象
        Class clazz = Class.forName("Person");
        //得到所有方法
       // Method[] methods = clazz.getMethods();//获取的都是公有方法
        Method[] methods = clazz.getDeclaredMethods();//只获取本类的所有方法，包括私有
        for(Method method : methods)
            System.out.println(method);
    }
}
