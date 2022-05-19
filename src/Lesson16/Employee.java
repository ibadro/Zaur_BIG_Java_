
package Lesson16;


public class Employee {
    
    double salary;
    boolean isManager;
    
    Employee(double salary, boolean isManager) {
    
        this.salary = salary;
        this.isManager = isManager;
    
    }
    
}

class EmployeeTest {

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(555.55, true);
//        System.out.println(emp1.isManager + emp1.salary);
// нельзя какотенировать булеан и дабл
        
        System.out.println("is he manager? " + emp1.isManager + " his salary is " + emp1.salary);
        // is he manager? true his salary is 555.55
        // так канкотенировать можно
        
    }

}