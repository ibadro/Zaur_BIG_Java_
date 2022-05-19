
package Lesson25;

public class Test3 {
    // CASTING
    // Кастинг возможен только при наличие IS - A связи между классами
    public static void main(String[] args) {
        
        Employee2 emp1 = new Doctor2(); // это апкастинг
        Employee2 emp2 = new Teacher2(); // апкастинг -это автоматический кастинг
        Employee2 emp3 = new Driver2(); // кастинг из класса в супер класс происходит автоматически
//        Doctor2 d1 = new Employee2();
// так сделать не могу, потому что НЕЛЮБОЙ ЭМПЛОИ ЯВЛЯЕТСЯ ДОКТОРОМ
        
        // примеры даункастинга
        Doctor2 d2 = (Doctor2)emp1; // кастинг
        // теперь д2 ссылается на тот же объект, что и емп1
        // всё ИЗ-ЗА КАСТИНГА
        System.out.println(d2.workingArea); // Surgeon
        // для чего вообще кастовать переменную?
        // emp1.workingArea мы не видим workingArea, потому что в 
        // Employee2 нет workingArea
        // следовательно нам нужно прокастовать emp1, чтобы иметь доступ
        // к переменным типа Doctor2

        Teacher2 t2 = (Teacher2)emp2; // поверь мне емп2 - это на самом деле тычер
        System.out.println(t2.pupilsCount); // 12
        t2.teach(); // i want to teach
        
        ((Driver2)emp3).drive(); // i want to drive
        // вот так можно кастовать прямо без создания переменной
        
        
        ((Teacher2)emp2).teach(); // i want to teach
        // вот так можно кастовать прямо без создания переменной
        
        // если мы попробуем обмануть компилятор, то увидим ошибку
//        ((Driver2)emp1).drive(); // на самом деле emp1 ссылается на объект типа Doctor2 
        
    }
    
}
class Employee2 {
    
    int salary = 1000;
    String name;
    int age;
    int experiance;
    
    void eat(){
        System.out.println("i want to eat");
    }
    
    void sleep() {
        System.out.println("i want to sleap");
    }
    
}
class Doctor2 extends Employee2 {

    String workingArea = "Surgeon";
    
    void heal() {
        System.out.println("i want to heal ");
    }
    
}
class Teacher2 extends Employee2 {

    int pupilsCount = 12;
    
    void teach() {
        System.out.println("i want to teach");
    }
    
}
class Driver2 extends Employee2 {

    String brandOfCar;
    
    void drive() {
        System.out.println("i want to drive");
    }
    
}