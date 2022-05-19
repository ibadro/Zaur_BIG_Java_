
package Lesson25;

public class Test4 {

    public static void main(String[] args) {
        
        Employee3 emp1 = new Doctor3(); 
        Employee3 emp2 = new Teacher3(); 
        Employee3 emp3 = new Driver3(); 
        Employee3 emp4 = new Employee3(); 
        
        Employee3 [] arr1 = {emp1, emp2, emp3, emp4};
        // при помощи даункастинга мы можем форич лупом выбрать определнного
        // имплои и работать с ним
        for(Employee3 e:arr1){
            if (e instanceof Driver3) {
                System.out.println(((Driver3)e).brandOfCar); // Tesla
                ((Driver3)e).drive(); // i want to drive
            }
        }
        
    }
    
}
class Employee3 {
    
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
class Doctor3 extends Employee3{

    String workingArea = "Surgeon";
    
    void heal() {
        System.out.println("i want to heal ");
    }
    
}
class Teacher3 extends Employee3{

    int pupilsCount = 12;
    
    void teach() {
        System.out.println("i want to teach");
    }
    
}
class Driver3 extends Employee3{

    String brandOfCar = "Tesla";
    
    void drive() {
        System.out.println("i want to drive");
    }
    
}