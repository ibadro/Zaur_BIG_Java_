
package Lesson22;

public class Test4 {
 
}

class Human3 {
    
    // overloaded конструктор
    Human3(String n) {
        this(n, null);
    }

    Human3(String n, String s) {
    
        name = n;
        surname = s;
        
    }
    
    String name; 
    String surname;
    
}

class Student3 extends Human3 { // ошибка no sutaible constructor
    
    // вот так нужно работать с конструкторами детей
    int course;
    
    Student3(String n, String s, int course){
        super(n,s); // таким образом передаются параметры из суперконструктора коструктору студент
        this.course = course;
        // если бы указали всего 1 аргумент, то вызвался бы оверлодед конструктор
        // Human3(String n) {this(n, null);}
        // сернейм было бы нал бай дефолт
    }
    
    public static void main(String[] args) {
        
        Student3 st1 = new Student3("Petr", "Nikolaevich", 3);
        System.out.println(st1.name); // Petr
        System.out.println(st1.surname); // Nikolaevich
        System.out.println(st1.course);
        
    }
    
}