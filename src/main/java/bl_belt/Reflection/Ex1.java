package bl_belt.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("bl_belt.Reflection.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class empliyeeClass = emp.getClass();

        Field sameField = employeeClass.getField("id");
        System.out.println("Type of id field " + sameField.getType());
        System.out.println("********");

        Field [] fields = employeeClass.getFields();
        for(Field field : fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("********");

        Field [] allFields = employeeClass.getDeclaredFields();
        for(Field field : allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("********");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = "
                + someMethod2.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod2.getParameterTypes()));

        Method[] methods = employeeClass.getMethods();
        for(Method method: methods){
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }
    }
}
