
package Lesson23;

public class Test4 {
    // ПРИМЕРЫ С PRIVATE МЕТОДАМИ
    public static void main(String[] args) {
        
        Employee3 e = new Teatcher3();
        Employee3 e2 = new Employee3();
        Teatcher3 t = new Teatcher3();
        
//        e2.eat(); // не виден , потому что eat() у Employee3 - private
//        t.eat(); // не виден , потому что eat() у Teatcher3 - private
        
        
//        e.eat(); // не виден , потому что eat() у Employee3 - private
        // его просто нет внутри тычера
        // тк eat() - private в Employee3, он не может быть унаследован объектом класса Teatcher3
        // compile time binding
        
        
        
        // поменяли прайват на паблик в классе тычер3
        t.eat(); // Teatcher eats
        // почему же мы его видим???
        // все потому что мы его не оверрайдили, это просто считается НОВЫМ МЕТОДОМ
        // тк в классе емплои он private, то есть сабкласс тычер его не видит
        // ОН НИКАКИМ ОБРАЗОМ НЕ ОТНОСИТСЯ К МЕТОДу ИТ ИЗ СУПЕРКЛАССА
        
    }
    
}

class Employee3 {
    
    int salary = 1000;
    String name;
    int age;
    int experiance;

    private void eat() {
        System.out.println("Employee eats");
    }
    
    void  sleep() {
        System.out.println("Employee wants to sleap");
    }
    
}

class Teatcher3 extends Employee3 {

    public void eat() {
        System.out.println("Teatcher eats");
    }
    
    int pupilsCount;

    void sleep() {
        System.out.println("Teatcher wants to sleap");
    }
    
}