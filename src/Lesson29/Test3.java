
package Lesson29;

import java.util.ArrayList;

public class Test3 {
    
    public static void main(String[] args) {
        
        ArrayList <Student3> list = new ArrayList <>();
        Student3 st1 = new Student3("Ivan", 'm', 22 , 3, 8.3);
        Student3 st2 = new Student3("Nikolai", 'm', 28 , 2, 6.4);
        Student3 st3 = new Student3("Elena", 'f', 19 , 1, 8.9);
        Student3 st4 = new Student3("Petr", 'm', 35 , 4, 7);
        Student3 st5 = new Student3("Maria", 'f', 23 , 3, 9.1);       
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        StrudentInfo3 si = new StrudentInfo3();
        
        // лямбда, используется для того, чтобы не оверрайдить методы и не создавать классы
        // лямбду можно использовать только с интерфейсом, который имеет ТОЛЬКО 1 МЕТОД
        // В НАШЕМ СЛУЧАЕ ИНТЕРФЕЙС StudentChecks3 ИМЕЕТ ТОЛЬКО 1 МЕТОД boolean test(Student3 s)
        // ПО СУТИ ЛЯМБДА - ЭТО ОВЕРРАЙД МЕТОДА ВНУТРИ ПАРАМЕТРА
        // лямбда выражение - анонимное выражение, потому что не имеет имени
        si.testStudents(list, (Student3 s) -> {return s.avgGrade > 8.5;});
        System.out.println("****");
        si.testStudents(list,  s -> s.avgGrade < 9); // аналогичное значение
        // но другой вид записи
        System.out.println("****");
        si.testStudents(list, (Student3 s) -> {return s.age > 25;});
        System.out.println("****");
        si.testStudents(list, (Student3 s) -> {return s.age < 27;});
        System.out.println("****");
        si.testStudents(list, (Student3 s) -> {return s.sex == 'm';});
        System.out.println("****");
        si.testStudents(list, (Student3 s) -> {return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');});
        System.out.println("****");
        
    }
    
}

class Student3{

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;   
    
    Student3(String name, char sex, int age, int course, double avgGrade){
    
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    
    }

}

class StrudentInfo3{
    void printStudent(Student3 st){
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " + st.course + ", average grade: " + st.avgGrade);
    }
    void testStudents(ArrayList <Student3> aL, StudentChecks3 sc){
        
        for(Student3 s:aL){
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    
    }
}

interface StudentChecks3{
    boolean test(Student3 s);
}
