
package Lesson7;


public class HWEmployeeTest {

    public static void main(String[] args) {
        
        HW7Employee emp = new HW7Employee(588.22, "Ivanov", 777); // HW7Employee public 
        emp.showId(); // 777
        emp.showSalary(); // 588.22 
        emp.showSurname(); // Ivanov
        // emp.salary - не видно, тк прайват
        System.out.println("---------");
        System.out.println(emp.id);
        System.out.println(emp.surname);
        System.out.println("---------");
        
        HW7Employee emp2 = new HW7Employee(877.55, "Baranov"); // HW7Employee default
        emp2.showId(); // 0
        emp2.showSalary(); // 877.55
        emp2.showSurname(); // Baranov
        System.out.println("---------");
        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        // emp2.salary - не видно, тк прайват
        System.out.println("---------");
        
//        HW7Employee emp3 = new HW7Employee("Private Ivanov"); - не дает создать ибо HW7Employee private
        
    }
  
}

