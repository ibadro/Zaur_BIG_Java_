
package Lesson6;

public class Employee2 { 
    
    Employee2 (String surname2, int age2) {
    
        this(0, surname2, age2, 0 , null);
        // подставил дефолтные значения в айди, salary и department
        
    }
    
    Employee2 (int id1, String surname1, int age1) {
    
        this(id1, surname1, age1, 0 , null);
        // для salary и department поставили дефолтные значения
        
        
    }
    
    
    Employee2 (int id3, String surname3, int age3, int salary3, String department3) {
    
        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        department = department3;

    }

    int id;
    String surname;
    int age;
    int salary;
    String department;
    
}

class Employee2Test {

    public static void main(String[] args) {
        
        Employee2 emp1 = new Employee2(12, "ff", 22, 1100, "it");
        System.out.println(emp1.salary);
        
    }

}

