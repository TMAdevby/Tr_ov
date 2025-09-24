package org.example.Tr_ov.Lambdas;

import java.util.ArrayList;

public class Test2 {

}

class Student1{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo1{
    void printStudent(Student1 st){
        System.out.println("Imya student " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age +
                ", kurs: " + st.course + ", srednyaya ocenka " + st.avgGrade);
    }

    void testStudents(ArrayList<Student1> aL, StudentChecks sc){
        for (Student1 s : aL){
            if (sc.test(s)){
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28,2,6.4);
        Student1 st3 = new Student1("Elena", 'f', 19,1,8.9);
        Student1 st4 = new Student1("Petr", 'm', 35,4,7);
        Student1 st5 = new Student1("Mariya", 'f', 23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo1 si = new StudentInfo1();

        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();


        si.testStudents(list,fsog);
        System.out.println("----------------------------------------");
        si.testStudents(list,fsug);
        System.out.println("----------------------------------------");
        si.testStudents(list,fsoa);
        System.out.println("----------------------------------------");
        si.testStudents(list,fsua);
        System.out.println("----------------------------------------");
        si.testStudents(list,fsbs);
        System.out.println("----------------------------------------");
    }
}

interface StudentChecks{
    boolean test(Student1 s);
}

class FindStudentsOverGrade implements StudentChecks{
    public boolean test(Student1 s){
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks{
    public boolean test(Student1 s){
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentChecks{
    public boolean test(Student1 s){
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentChecks{
    public boolean test(Student1 s){
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentChecks{
    public boolean test(Student1 s){
        return s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentChecks{
    public boolean test(Student1 s){
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}