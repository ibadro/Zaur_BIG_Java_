
package Lesson11;


public class Employee {
    
    public String name;
    public double salary = 555.66;
    
    Employee(String name, double salary) {
    
        this.name = name;
        this.salary = salary;
    
    }
    
    public double mult(double a) {
    
        a *= 3;
        return a;
        
    }
    
    public double makeSalaryX2() {
    
        salary *= 2;
        return salary;
        
    }
    
}

class EmployeeTest {

    public static void main(String[] args) {
        
        Employee empIvan = new Employee("Ivan", 2200.55);
        
        System.out.println(empIvan.salary); // 2200.55
        double d = empIvan.mult(empIvan.salary); // прокидываем салари объекта емпИван в аргумент ф-ии мулт
        // присваиваем результат выполнения метода переменной д, чтобы потом с ним работать
        // либо system.out.println(empIvan.mult(empIvan.salary));
        System.out.println(d); // 6601.650000000001
        // прокидываем салари объекта емпИван в аргумент ф-ии мулт
        
        
        empIvan.makeSalaryX2();
        System.out.println(empIvan.salary); // 4401.1
        
    }

}
