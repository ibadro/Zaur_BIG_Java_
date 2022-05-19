
package Lesson12;

public class Car {
    
    int engine;
    int doors;
    
    Car(int doors, int engine) {
    
        this.engine = engine;
        this.doors = doors;
        
    }
    
}

class CarTest {

    public static void main(String[] args) {
        
        Car c1 = new Car(5, 3500);
        Car c2 = new Car(7, 2500);
        Car c3 = c1;
        Car c4 = new Car(5, 3500);
        
       
        
        if(c1 == c2) {
            System.out.println("=) - 1");
        }
        
        if(c1 == c4) {
            System.out.println("=) - 2");
        }
        
        if(c1 == c3) {
            System.out.println("yeeeee cause of there is the same object");
        }
        // для рефернс типов данных сравниваются ТОЛЬКО АДРЕСА!
        
        
        if (c1.engine > c2.engine) {
            
            if (c1.doors > c2.doors) {
                System.out.println("c1 has better engine and more doors");
            } else {
                System.out.println("c1 has better engine but less doors");
            }
            
        } else {
            System.out.println("c1 is worse than c2");
        }
        
    }
    
}