
package Lesson5;


public class Human {
    
    String name;
    Car6 car;
    BankAcc bA;
    
    void info() {
    
        System.out.println("Name: " + name + ", color of his car: " + car.color + ", balance of his BA: " + bA.balance);
        
    }
}


class HumanTest {


    public static void main(String[] args) {
    
        Human newHuman = new Human();
        newHuman.name = "Dave";
        newHuman.car = new Car6("black", "v12");
        newHuman.bA = new BankAcc(11, 999.999);
        
        newHuman.info();
    
    }
    

}



class Car6 {
    
    Car6(String c, String e) {
    
        color = c;
        engine = e;
    
    }
    
    String color;
    String engine;

}

class BankAcc {

    BankAcc(int id1, double balance1) {
    
        id = id1;
        balance = balance1;
    
    }
    
    int id;
    double balance;

}