package bl_belt.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("bl_belt.Reflection.Employee");

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class,
                String.class, String.class);
        Object obj2 = constructor2.newInstance();

    }
}
