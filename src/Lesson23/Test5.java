
package Lesson23;

public class Test5 {
 
    public static void main(String[] args) {
        
        Employee5 emp1 = new Teatcher5();
        Teatcher5 t1 = new Teatcher5();
        
        
        emp1.sleep(); // Employee wants to sleap
        // static методы НЕ ОВЕРРАЙДЯТСЯ
        
        // variable hidding
        System.out.println(t1.salary); // 200
        // это не говорит о том, что переменная сэлэри класса имплои переписана
        // это говорит о том, что переменная сэлэри класса имплои скрыта, то есть
        // variable hidding, а выдается на переменная сэлэри сабкласса тычер
        
    }
    
}

// method hidding

class Employee5 {
    // variable hidding
    int salary = 1000;
    String name;
    int age;
    int experiance;
    
    // acess mod - default
    void eat() {
        System.out.println("Employee eats");
    }
    
    // method hidding - это перекрытие статик метода пэрэнт класса в статик методе сабкласса
    static void sleep() {
        System.out.println("Employee wants to sleap");
    }
    
    final void ggg(){
        System.out.println("ggg");
    }
    
}

class Teatcher5 extends Employee5 {
    // variable hidding
    int salary = 200;
    
@Override  // аннотейшен о том, что метод перезаписан, то есть оверрайдед  
    // в оверрайдед методе аксесс модефаер может быть либо таким же, то есть дефолт, как в классе емплои
    // либо менее строгий, то есть паблик
    // если бы в емплои аксесс мод. был бы паблик, то в тычер только паблик
    public void eat() {
        System.out.println("Teatcher eats");
    }
    
    int pupilsCount;
    
    // METHOD HIDDING
    // sleep() класса имплои закрыт методом sleep() класса тычер
    
    // method hidding - это перекрытие статик метода пэрэнт класса в статик методе сабкласса
    static void sleep() {
        System.out.println("Teatcher wants to sleap");
    }
    
//    void ggg(){
//        System.out.println("ggg");
//    }
    
    // final метод родительского класса Employee5 не может быть перезаписан
    
    
}

// PRIVATE AND FINAL МЕТОДЫ И ПЕРЕМЕННЫЕ НЕЛЬЗЯ НИ ОВЕРРАЙДИТЬ, НИ ХАЙДИТЬ


final class P{}

//class T extends P{} // нельзя 

// ПОТОМУ ЧТО У ФАЙНАЛ КЛАССА НЕ МОЖЕТ БЫТЬ ПОТОМКОВ