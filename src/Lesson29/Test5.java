
package Lesson29;

import java.util.ArrayList;
// импорт предикейт
import java.util.function.*;

public class Test5 {
    
    // использовние лямбы и интерфейса предикейт
    
    public static void main(String[] args) {
        
        ArrayList <Student4> list = new ArrayList <>();
        Student4 st1 = new Student4("Ivan", 'm', 22 , 3, 8.3);
        Student4 st2 = new Student4("Nikolai", 'm', 28 , 2, 6.4);
        Student4 st3 = new Student4("Elena", 'f', 19 , 1, 8.9);
        Student4 st4 = new Student4("Petr", 'm', 35 , 4, 7);
        Student4 st5 = new Student4("Maria", 'f', 23 , 3, 9.1);       
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        StrudentInfo4 si = new StrudentInfo4();
        
        for(Student4 s:list){
            System.out.println(s.name);
        }
        System.out.println("****");
        
        // removeIf - метод ArrayList, который использует Predicate
        list.removeIf((Student4 s)-> s.name.endsWith("a"));
        // лямбда выражение внутри метода removeIf, удаляющие всё, что заканчивается на "a"
        for(Student4 s:list){
            System.out.println(s.name);
        }

//        si.testStudents(list, (Student4 s) -> {return s.avgGrade > 8.5;});
//        System.out.println("****");
//        si.testStudents(list,  s -> s.avgGrade < 9); // аналогичное значение
//        // но другой вид записи
//        System.out.println("****");
//        si.testStudents(list, (Student4 s) -> {return s.age > 25;});
//        System.out.println("****");
//        si.testStudents(list, (Student4 s) -> {return s.age < 27;});
//        System.out.println("****");
//        si.testStudents(list, (Student4 s) -> {return s.sex == 'm';});
//        System.out.println("****");
//        si.testStudents(list, (Student4 s) -> {return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');});
//        System.out.println("****");
        
    }
    
}

class Student4{

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;   
    
    Student4(String name, char sex, int age, int course, double avgGrade){
    
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    
    }

}

class StrudentInfo4{
    void printStudent(Student4 st){
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " + st.course + ", average grade: " + st.avgGrade);
    }
    void testStudents(ArrayList <Student4> aL, Predicate<Student4> t){ // использование Predicate
        
        for(Student4 s:aL){
            if (t.test(s)) { // у интерфейса Predicate есть 1 единственный метод test()
                            // и иммет реторн тайп булеан
                printStudent(s);
            }
        }
    
    }
}


// это заменим на интерфейс предикейт
//interface StudentChecks4{
//    boolean test(Student4 s);
//}