package Reflect_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 方法 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Person person = new Person();
        /* 类对象 */
        final Class<? extends Person> pClass = person.getClass();

        /* 根据方法名获取方法 */
        final Method eatMethod = pClass.getMethod("eat");
        /* 调用方法 */
        eatMethod.invoke(person);

        /* 根据方法名获取方法，该方法带有1个参数 */
        final Method eatFoodMethod = pClass.getMethod("eat", String.class);
        /* 调用方法 */
        eatFoodMethod.invoke(person, "bread");
    }
}
