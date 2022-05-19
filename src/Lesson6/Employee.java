
package Lesson6;

public class Employee { 
    
    Employee (String surname2, int age2) {
    
        surname = surname2;
        age = age2;
    
    }
    
    Employee (int id1, String surname1, int age1) {
    
        this (surname1, age1); // это эквивалетно Employee
        id = id1;
        // внутри конструктора Employee вызываем оверлодед конструктор Employee
    
    }
    
    
    Employee (int id3, String surname3, int age3, int salary2, String department2) {
    
        this (surname3, age3);
        salary = salary2;
        department = department2;
        // внутри конструктора Employee вызываем оверлодед конструктор Employee
    
    }
    // 3 конструктора, выполняющие разные ф-ии
    // параметры в таких случаях должны быть всегда разными!!!!

    
    int id;
    String surname;
    int age;
    int salary;
    String department;
    
}

class EmployeeTest {

    public static void main(String[] args) {
        
        Employee emp = new Employee(1, "Ivanov", 25);
        System.out.println(emp.surname);
        
        Employee emp2 = new Employee ("Baranov", 19);
        System.out.println(emp2.surname);
        
        // то есть мы видим 2 разных конструктора, и компилятор определяет
        // к какому именно обратиться по количеству аргументов, которые мы 
        // задаем в new Employee(...)
        // если 2 аргумента, то идет в Employee (String surname2, int age2)
        // если 3 аргумента, то идет в Employee (int id1, String surname1, int age1)
        
        Employee emp3 = new Employee (32, "Bogdanov", 26, 1200, "qa");
        System.out.println(emp3.department); // qa
        
    }

}

// пример работы с оверлодед конструкторами