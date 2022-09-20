package Black_Belt.Lamda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }

        }

    /*void printStudentsOverGrade(ArrayList<Student> a1, double grade ){
        for (Student s:a1){
            if (s.avgGrade > grade){
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> a1, int age ){
        for (Student s:a1){
            if (s.age < age){
                System.out.println(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex ){
        for (Student s:a1){
            if (s.avgGrade < grade && s.age > age && s.sex == sex){
                System.out.println(s);
            }
        }
    }*/
        Function<Student, Double> f = student -> student.avgGrade;

    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for (Student st:list){
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 22, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        StudentInfo info = new StudentInfo();
//        Collections.sort(students, (stu1, stu2) -> stu1.course - stu2.course);
//        System.out.println(students);

//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//        System.out.println("-------------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.avgGrade > 8;
//        });

//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students, p1.negate());

//        System.out.println("-------------------------");
//        info.testStudents(students, s -> {
//            int i = 0;
//            System.out.println(i);
//            return s.avgGrade > 8 && s.sex == 'f' && s.age > 20;
//        });
//        System.out.println("-------------------------");
//
//        info.testStudents(students, stud -> stud.name.length() <= 4);
//        System.out.println("-------------------------");

        double res = avgOfSmth(students, std -> (double)std.age);
        System.out.println(res);

    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for (Student st:list){
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }

}

//interface StudentChecks{
//    boolean check(Student s);
//}

/*class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}*/