
package Java_Dlia_nashin.Lesson22.p1;

import Java_Dlia_nashin.Lesson22.Human2;
import Java_shernii_poias.Lesson1.Lesson22.*;

class Student extends Human2 {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        System.out.println(Student.salary); // более правильное написание для статической переменной
        s1.work(); // working
        Student.rest(); // have a rest
//        s1.name = "wefwef"; // private элементы не наследуются

        s1.getName(); // Kolya
        s1.setName("Petya");
        s1.getName(); // Petya
        // при  помощи инкапсуляции изменили сетером имя студента
        
    }
    
}
