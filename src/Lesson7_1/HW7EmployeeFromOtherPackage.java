
package Lesson7_1;


public class HW7EmployeeFromOtherPackage {
    
    public static void main(String[] args) {
        
        
//        Lesson7.HW7Employee newEmp = new Lesson7.HW7Employee("Baranov");
// такой объект не создастся, ибо он прайват

           
//          Lesson7.HW7Employee newEmp2 = new Lesson7.HW7Employee(877.55, "Baranov");
// тоже не создается, ибо он дефолтный

        
            Lesson7.HW7Employee newEmp3 = new Lesson7.HW7Employee(588.22, "Ivanov", 777);
            newEmp3.showId();
            newEmp3.showSalary();
            newEmp3.showSurname();
            // а вот такой конструктор сработал, ибо он паблик
            
            System.out.println("---------");
//          System.out.println(newEmp3.salary); // мы не видим, тк оно private
//          System.out.println(newEmp3.id); // мы не видим, тк оно дефолтное, те видно только внутри пакета, в котором создавалось
            System.out.println(newEmp3.surname); // Ivanov, видно, тк паблик
        
    }
    
}
