
package Lesson22;

// parent
class Employee {
    
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

// Child - class name extends Parent
class Doctor extends Employee {

    String workingArea;
    
    void heal() {
        System.out.println("i want to heal ");
    }
    
}
 // это сабкласс сабкласса Doctor класса Employee
class Surgeon extends Doctor {

    String instrument;
    
}

 // это сабкласс сабкласса Doctor класса Employee
class Paradont extends Doctor {

    String hobby;
    
}

class Teatcher extends Employee {

    int pupilsCount;
    
    void teach() {
        System.out.println("i want to teach");
    }
    
}


class Driver extends Employee {

    String brandOfCar;
    
    void drive() {
        System.out.println("i want to drive");
    }
    
}

class EmployeeTest {
    
    void doubleSalary(Employee emp1) {
             emp1.salary *= 2;
    }

    public static void main(String[] args) {
        
        Doctor doc1 = new Doctor();
//        doc1.age = 25;
//        doc1.name = "ivan";
//        doc1.experiance = 5;
//        doc1.eat();
//        doc1.workingArea = "surgeon";
//        doc1.sleep();
//        doc1.heal();
        
        
        EmployeeTest execution = new EmployeeTest();
        execution.doubleSalary(doc1);
        
        System.out.println(doc1.salary + "$"); // 2000$
        
    }

}
