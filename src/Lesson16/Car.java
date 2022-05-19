
package Lesson16;

public class Car {
    
    String color;
    String engine;
    
    Car(String color, String engine) {
    
        this.color = color;
        this.engine = engine;
        
    }
    
    final static int a = 5; // константа, которая принадлежит всему классу кар, то есть не надо создавать объект кар, чтобы ее юзать
    
}

class TestCar {

    final static Car c = new Car("red", "v8");
    
    public static void main(String[] args) {
        
//        c = new Car("black", "v3"); нельзя менять ссылку объект с на другую, тк с - файнал, то есть константа

        c.color = "black"; // ссылку менять нельзя, но вот внутренности объекта менять можно
        System.out.println(c.color); // black
        
    }
}