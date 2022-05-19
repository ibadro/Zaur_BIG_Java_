package Lesson11;
        
public class HW11Car {

    String color;
    String engine;
    int doorsCount;
    
    public HW11Car(String color, String engine, int doorsCount) {
    
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;
        
    }
    
}

class CarTest {

    void changedoorsCount(HW11Car car1, int doorsCount1) {
    
        car1.doorsCount = doorsCount1;
        
    }
    
    void changeColor(HW11Car car1, HW11Car car2) {
    
        String color3 = car1.color;
        car1.color = car2.color;
        car2.color = color3;

        
    }
    
    public static void main(String[] args) {
        
        CarTest cTest = new CarTest();
        
        HW11Car mazda = new HW11Car("silver", "v6", 3);
        HW11Car ford = new HW11Car("blue", "v6", 5);
        
        System.out.println("mazda's doors before " + mazda.doorsCount);
        cTest.changedoorsCount(mazda, 5);
        System.out.println("mazda's doors after " + mazda.doorsCount);
        
        System.out.println("mazda color: " + mazda.color);
        System.out.println("ford color: " + ford.color);
        
        cTest.changeColor(mazda, ford);
        
        System.out.println("after func: mazda color: " + mazda.color);
        System.out.println("after func: ford color: " + ford.color);
        
    }
    
}