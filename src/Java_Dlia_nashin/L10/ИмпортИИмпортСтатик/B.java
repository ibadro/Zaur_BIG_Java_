
package Java_Dlia_nashin.L10.ИмпортИИмпортСтатик;

// import java.lang.* - это импортируется по дефолту, в этом пакете такие классы , как String и тд, благодаря нему, мы можем обращаться к классу String
import Java_Dlia_nashin.L09.РазновидностиПеременныхИПределыИхВидимости.Student;
//import Java_shernii_poias.Lesson1.Lesson9.*;

// импорт не импортирует подпакеты, подпакеты нужно тоже импортировать!!!


public class B {
    
    public static void main(String[] args) {
        
        Student student1 = new Student("jick");
        
        System.out.println(student1.z); // 10
        System.out.println(Student.c); // 5
        // по названию класса, тк переменная с - статик и принадлежит всему классу Student
    }
    
}
