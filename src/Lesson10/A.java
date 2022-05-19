
package Lesson10;

import Lesson9.Car; // испорт класса, вместо использования полного пути в паблик конструктору Lesson9.Car
import Lesson9.Student; // испорт класса, вместо использования полного пути в паблик конструктору Lesson9.Student
import Lesson9.*; // испорт всех классов пакета лесон 9
// испорт возможен только если класс - public

// если мы импортим 2 пакета с классами одинакового названия, будет ошибка, тк java не понимает какой именно класс нужно использовать, необходимо указать точный путь к классу

public class A {
    
    public static void main(String[] args) {
        
        Lesson9.Car c1 = new Lesson9.Car("red", "v8");
        Car c2 = new Car("white", "v12");
        // тоже самое, просто Car c2 = new Car("white", "v12"); более удобная запись
        // такое сокращение возможно благодаря import (import Lesson9.Car;)
        
        System.out.println(c1.color);
        System.out.println(c2.color);
        
        System.out.println("*****");
        
        
        Lesson9.Student stud1 = new Lesson9.Student("Dmitry");
        Student stud2 = new Student("Dzmitry");
        // 2 варианта создания объекта, как мы видим, с импортом удобнее
        
        System.out.println(stud1.fullName);
        System.out.println(stud2.fullName);
        
    }
    
}
