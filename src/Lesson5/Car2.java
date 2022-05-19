
package Lesson5;


public class Car2 {
    
    String color;
    String engine;
    int speed;
     
    int increaseSpeed (int a) {
    
        speed += a;
        return speed;
        
    }
    
    int decreaseSpeed (int a) {
    
        speed -= a;
        return speed;
        
    }
  
    // void - метод, который НИЧЕГО НЕ ВОЗВРАЩАЕТ
    void showInfo() {
    
        System.out.println("Color: " + color + ", engine: " + engine + ", speed: " + speed);
    
    }
            
    
}
// таким образом создаются методы increaseSpeed, decreaseSpeed и showInfo


class Car2Test {

    public static void main(String [] args) {
    
        Car2 volkswagen = new Car2();
        volkswagen.color = "White";
        volkswagen.engine = "V6";
        volkswagen.speed = 60;
        
        volkswagen.showInfo();
        
        volkswagen.increaseSpeed(20);
        
        volkswagen.showInfo();
        
        volkswagen.decreaseSpeed(80);
        
        volkswagen.showInfo();
    
    }

}