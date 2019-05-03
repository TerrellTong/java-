import java.lang.reflect.Field;

public class hm_03_获取Class中的字段 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取class字节码文件的类
        String name = "Person";
        Class clazz = Class.forName(name);
        //    Field field = clazz.getField("age"); //只能访问公有
        Field field = clazz.getDeclaredField("age");//getDeclaredField所有权限的变量都可以访问,然后field可以表示agele
        //对私有字段的访问取消权限检测。暴力访问
        field.setAccessible(true);
        //生成一个对象
        Object obj = clazz.newInstance();
        //设置值
        field.set(obj,89);//将age赋值
        Object o =field.get(obj);
        System.out.println(o);
    }
}
