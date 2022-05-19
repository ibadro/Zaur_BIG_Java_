
package Lesson23;

public class Test2 {
   
    public static void main(String[] args) {
        
        Teatcher2 t2 = new Teatcher2();
        t2.eat(); // Teatcher eats
        t2.sleep(); // Teatcher wants to sleap
        t2.dig(); // Teatcher digs
        
        Employee2 emp2 = new Employee2();
        emp2.eat(); // Employee eats
        emp2.sleep(); // Employee wants to sleap
        emp2.dig(); // Employee digs
        
        // run time binding
        Employee2 emp3 = new Teatcher2();
        emp3.eat(); // Teatcher eats
        // потому что настоящий объект на который ссылается емп3 - это объект класса Teatcher2
        // именно поэтому вызвался оверрайдед метод именно тычера
        
        
        
        // OVERRIDED METHODs
        // МЫ ПЕРЕЗАПИСАЛИ ЕГО В САБКЛАССЕ ТЫЧЕР2
        
    }
    
}

class Eda{}
class Fruct extends Eda{}


class Employee2 {
    
    int salary = 1000;
    String name;
    int age;
    int experiance;
    // метод класса Еда
    Eda eat() {
        System.out.println("Employee eats");
        Eda e = new Eda();
        return e;
    }
    
    Eda sleep() {
        System.out.println("Employee wants to sleap");
        Eda e1 = new Eda();
        return e1;
    }
    
    void dig(){
        System.out.println("Employee digs");
    }
    
}

class Teatcher2 extends Employee2 {
    
    // overrided method
    // перезаписываем метод eat из родительского класса Employee2
    // в дочернем классе Teatcher2, меняем его
    // ТУТ ОДИНАКОВЫЙ РЕТУРН ТАЙП
    Eda eat() {
        System.out.println("Teatcher eats");
        Eda e = new Eda();
        return e;
    }
    
    int pupilsCount;
    
    // overrided method
    // перезаписываем метод eat из родительского класса Employee2
    // в дочернем классе Teatcher2, меняем его
    // ТУТ разный РЕТУРН ТАЙП
    // так можно делать если этот реторн тайп - сабкласс родительского
    // в любой случае должна быть связь между Fruct и Eda
    Fruct sleep() {
        System.out.println("Teatcher wants to sleap");
        Fruct f1 = new Fruct();
        return f1;
    }
    // overrided method
    // перезаписываем метод eat из родительского класса Employee2
    // в дочернем классе Teatcher2, меняем его
    void dig(){
        System.out.println("Teatcher digs");
    }
    
}
