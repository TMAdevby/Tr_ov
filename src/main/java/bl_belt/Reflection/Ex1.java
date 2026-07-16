package bl_belt.Reflection;

import java.lang.reflect.Field;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
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

    }
}
