package bl_belt.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student>al,Predicate<Student>pr){
        for(Student s: al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList <Student> aL, double grade){
//        for(Student s : aL){
//            if(s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList <Student> aL, int age){
//        for(Student s : aL){
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixConditions(ArrayList <Student> aL,int age, double grade,  char sex){
//        for(Student s : aL){
//            if(s.age > age && s.avgGrade < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        Collections.sort(students, (s1,s2) -> s1.course - s2.course );
//        System.out.println(students);


//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("--------------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });


        System.out.println("--------------------------------");
        info.testStudents(students,(Student s) -> {return s.avgGrade > 8;});
        System.out.println("--------------------------------");
        info.testStudents(students,s -> s.avgGrade > 8.5);

//        StudentChecks sc = (Student s) -> {return s.avgGrade > 8;};
//        info.testStudents(students,sc);

        System.out.println("--------------------------------");
        info.testStudents(students,(Student s) -> {return s.age < 30;});
        System.out.println("--------------------------------");
        info.testStudents(students,(Student s) -> {return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';});



//        info.printStudentsOverGrade(students, 8);
//        System.out.println("--------------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("--------------------------------");
//        info.printStudentsMixConditions(students, 20, 9.5, 'f');
    }
}
//interface StudentChecks{
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}