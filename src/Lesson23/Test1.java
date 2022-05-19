
package Lesson23;

public class Test1 {
    
    // ПЕРЕМЕННАЯ СУПЕРКЛАССА МОЖЕТ ССЫЛАТЬСЯ НА ОБЪЕКТ САБКЛАССА, НО НЕ НАООБОРОТ

    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Doctor doc1 = new Doctor();
        Surgeon surg1 = new Surgeon();

        // референс переменная типа Employee может ссылать на объект типа Surgeon
        Employee emp2 = new Surgeon();
        // референс переменная типа Employee может ссылать на объект типа Teatcher
        Employee emp3 = new Teatcher();
        // референс переменная типа Employee может ссылать на объект типа Doctor
        Employee emp4 = new Doctor();
        
        
        System.out.println(emp4.age);
        System.out.println(emp4.experiance);
        System.out.println(emp4.name);
        System.out.println(emp4.salary);
        
        // компилятор этого не видит, потому что он смотрит на тип данной переменной
        // emp4, ее тип данных Employee, не смотря на то, что она создает объект типа Doctor
        // emp4 не видит его методы и параметры
//        System.out.println(emp4.workingArea);
//        System.out.println(emp4.heal());


        // референс переменная типа Doctor может ссылать на объект типа Surgeon 
        Doctor d12 = new Surgeon();
        // он видит все элементы пэрент класса емплои
        System.out.println(d12.age);
        // также видит все элементы класса Doctor
        System.out.println(d12.workingArea);
        d12.heal();
        // но не видит элементы класса Surgeon
//        System.out.println(d12.instrument);
        
        
        
    }   
    
}


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

class Teatcher extends Employee {

    int pupilsCount;
    
    void teach() {
        System.out.println("i want to teach");
    }
    
}
