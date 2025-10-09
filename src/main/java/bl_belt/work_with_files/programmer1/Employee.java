package bl_belt.work_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    //int age;
    transient double salary;
    Car car;

    public Employee(String department, String name,String surname, /*int age,*/ double salary,Car car) {
        this.department = department;
        this.name = name;
        this.surname = surname;
        //this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                //", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
