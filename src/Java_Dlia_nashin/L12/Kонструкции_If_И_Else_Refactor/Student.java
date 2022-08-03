package Java_Dlia_nashin.L12.Kонструкции_If_И_Else_Refactor;
/* В классе StudentTest написать 2 метода, которые принимают 2 input параметра - 2 объекта класса Student из Lеsson11.
Первый метод сравнивает 2-х студентов, используя 1 if statement и логические операторы внутри него и выводит на экран информацию о том, равны ли студенты.
Второй метод использует пеяед nested if statement, сравнивает все атрибуты студента по отдельности, выводит на экран информацию о том, равны ли студенты,
 а если не равны, то в чём именно было обнаруженно первое неравенство.*/
public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}
class StudentTest {
    public static void method1 (Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println(" одинаковые ");
        } else {
            System.out.println("разные");
        }

    }

    public static void method2 (Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if(st1.grade == st2.grade) {
                    System.out.println("имена студ и курсов одинаковые");
                } else {
                    System.out.println("имена и курсы одинаковые но оценки разные ");
                }
            }else {
                System.out.println("  имена студ один, но курсы различ");
            }
        }else {
            System.out.println(" imena razlish");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("ivan",2,5);
        Student s2 = new Student("iыв",2,5);
        method1(s1,s2);
        method2(s1,s2);

    }

}