
package Lesson7;


public class HW7Employee {
        
    private double salary;
    public String surname;
    int id;
    
    public void showSalary() {
    
        System.out.println(salary);
        
    }
    
    public void showSurname() {
    
        System.out.println(surname);
        
    }
    
    public void showId() {
    
        System.out.println(id);
        
    }
    
    public HW7Employee (double salary1, String surname1, int id1) {
    
        salary = salary1;
        surname = surname1;
        id = id1;
        
    }
    
    HW7Employee (double salary2, String surname2) {
    
        this(salary2, surname2, 0);
        
    }
    
    private HW7Employee (String surname3) { // never used, тк прайват, я могу его заюзать только внутри класса HW7Employee, не в HW7EmployeeTest
    
        this(0.0, surname3, 0);
        
    }
     
    
}
