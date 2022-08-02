
package Java_Dlia_nashin.L10.ИмпортИИмпортСтатик;

import Java_Dlia_nashin.L09.РазновидностиПеременныхИПределыИхВидимости.Car; // испорт класса, вместо использования полного пути в паблик конструктору Java_shernii_poias.Lesson1.Lesson9.Car
import Java_Dlia_nashin.L09.РазновидностиПеременныхИПределыИхВидимости.Student; // испорт класса, вместо использования полного пути в паблик конструктору Java_shernii_poias.Lesson1.Lesson9.Student

// испорт возможен только если класс - public

// если мы импортим 2 пакета с классами одинакового названия, будет ошибка, тк java не понимает какой именно класс нужно использовать, необходимо указать точный путь к классу

public class A {
    
    public static void main(String[] args) {
        
        Car c1 = new Car("red", "v8");
        Car c2 = new Car("white", "v12");
        // тоже самое, просто Car c2 = new Car("white", "v12"); более удобная запись
        // такое сокращение возможно благодаря import (import Java_shernii_poias.Lesson1.Lesson9.Car;)
        
        System.out.println(c1.color);
        System.out.println(c2.color);
        
        System.out.println("*****");
        
        
        Student stud1 = new Student("Dmitry");
        Student stud2 = new Student("Dzmitry");
        // 2 варианта создания объекта, как мы видим, с импортом удобнее
        
        System.out.println(stud1.fullName);
        System.out.println(stud2.fullName);
        
    }
    
}
