package Reflect_;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 构造函数 {

    public static void main(String[] args) {
        Person p = new Person();

        final Class<? extends Person> pClass = p.getClass();
        try {
            /*
            * 获取含参构造方法
            * */
            final Constructor<? extends Person> constructor1 = pClass.getConstructor(String.class, int.class);
            final Person jack = constructor1.newInstance("Jack", 18);
            System.out.println(jack);
            /*
            * 获取空参构造方法
            * */
            final Constructor<? extends Person> constructor2 = pClass.getConstructor();
            final Person none = constructor2.newInstance();
            System.out.println(none);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
