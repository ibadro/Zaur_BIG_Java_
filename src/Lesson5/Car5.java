
package Lesson5;

public class Car5 {
    
    void Car5(String cvet, String motor) {
    
        color = cvet;
        engine = motor;
        
        System.out.println("Color: " + color + ", engine: " + engine);
        
    }
    // из конструктора сделали методы, который ничего не возвращает, те void
    String color;
    String engine;
}

class Car5Test {

    public static void main(String[] args) {
    
        Car5 car1 = new Car5();
        car1.Car5("green", "v2");
        // Color: green, engine: v2
        
        Car5 car2 = new Car5();
        car2.Car5("violet", "v12");
        // Color: violet, engine: v12
        

        
    }

}