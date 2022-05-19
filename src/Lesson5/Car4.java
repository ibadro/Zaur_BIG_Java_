
package Lesson5;

public class Car4 {
    
    Car4(String cvet, String motor) {
    
        color = cvet;
        engine = motor;
        
        System.out.println("Color: " + color + ", engine: " + engine);
        
    }
    // так можно задать дефолтное значение для цвета и двигателя
    String color;
    String engine;
}

class Car4Test {

    public static void main(String[] args) {
    
        Car4 car1 = new Car4("black", "v8");
        // Color: black, engine: v8  
        Car4 car2 = new Car4("white", "v6");
        // Color: white, engine: v6

        
    }

}