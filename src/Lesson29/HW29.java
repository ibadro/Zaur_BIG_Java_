
package Lesson29;

import java.util.ArrayList;
import java.util.function.*; // Predicate

public class HW29 {

}

class Employee{

    String name;
    String department;
    int salary;
    
    Employee(String name, String department, int salary){
        
        this.name = name;
        this.department = department;
        this.salary = salary;
        
    }

}

class TestEmployee{

    static void printEmployee(Employee e){
        System.out.println("Name: " + e.name + ", department: " + e.department + ", salary: " + e.salary);
    }
    
    static void filterEmployee(ArrayList <Employee> list, Predicate <Employee> e){ // using of Predicate
        
        for(Employee emp:list){
        
            if (e.test(emp)) { // defaul method test() of interface Predicate
                printEmployee(emp);
            }
        
        }
        
    }
    
    public static void main(String[] args) {
        
        ArrayList <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Victor", "IT", 3400);
        Employee emp2 = new Employee("Egor", "Security", 450);
        Employee emp3 = new Employee("Masha", "Law", 800);
        Employee emp4 = new Employee("Dima", "Marketing", 1400);
        Employee emp5 = new Employee("Vasilij", "IT", 200);
        Employee emp6 = new Employee("Fitness", "Fitness", 2400);
        Employee emp7 = new Employee("Egor", "Security", 550);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        
        // using Lambda
        filterEmployee(list, (Employee e) -> {return (e.department.equals("IT") && e.salary > 200);});
        System.out.println("***");
        filterEmployee(list, (Employee e) -> {return (e.name.startsWith("E") && e.salary != 450);});
        System.out.println("***");
        filterEmployee(list, (Employee e) -> {return e.name.equals(e.department);});
        
        
    }

}