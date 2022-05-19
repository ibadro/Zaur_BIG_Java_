
package Lesson7;


class Employee {
        
    private double salary;
    public String surname;
    int id;
    
    Employee(double salary2, String surname2, int id2) {
    
        salary = salary2;
        surname = surname2;
        id = id2;
        
    }
    
    public void showSalary() {
    
        System.out.println(salary);
        
    }
    
    public void showSurname() {
    
        System.out.println(surname);
        
    }
    
    public void showId() {
    
        System.out.println(id);
        
    }
     
    
}


class EmployeeTest {

    
}