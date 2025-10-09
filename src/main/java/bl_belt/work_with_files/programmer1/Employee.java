package bl_belt.work_with_files.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String department;
    int age;
    double salary;
    Car car;

    public Employee(String department, String name, int age, double salary,Car car) {
        this.department = department;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
