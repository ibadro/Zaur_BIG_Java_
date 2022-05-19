
package Lesson5;


public class Car3 {
    
    Car3(String cvet, String motor) {
    
        color = cvet;
        engine = motor;
        
    }
    // создаем конструктор
    
    
    String color;
    String engine;
    
}


class Car3Test {

    public static void main(String[] args) {
    
        Car3 newCar = new Car3("yellow", "v4");
        // указываем аргументы ("yellow", "v4")
        // тк в конструкторе Car3(String cvet, String motor) 
        // есть параметры!!!
        System.out.println(newCar.color);
        System.out.println(newCar.engine);
        
    }

}
