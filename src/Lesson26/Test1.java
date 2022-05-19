
package Lesson26;

import java.util.ArrayList;

public class Test1 {
 
    public static void main(String[] args) {
        
        Car c1 = new Car("red", "v4");
        Car c2 = new Car("red", "v4");
        Car c3 = new Car("white", "v8");
        
        System.out.println(c1 == c2); // false
        System.out.println(c1.equals(c2)); // true
        // потому что метод иквалс перезаписан
        
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("white", "v8");
        
        
       // перезаписанный вариант метода тустринг
        System.out.println(c3); // Car's color is white, car's engine is v8
        
       // если метод не перезаписать, мы увидим --- Lesson26.Car@7dc36524
        System.out.println(c1.toString()); // Car's color is red, car's engine is v4
       
    }
    
}

class Car{

    Car(String color, String engine){
    
        this.color = color;
        this.engine = engine;
    
    }
    
    String color;
    String engine;
    
//  перезапишем equals
    public boolean equals(Object obj) {
        // проверка является ли Object obj машиной
        if (obj instanceof Car) {
            // кастуем объект obj на Car для того, чтобы иметь возможность достучаться до колор и енджин через с2
            Car c2 = (Car)obj;
            return color.equals(c2.color) && engine.equals(c2.engine);
        } else {
            return false;
        }
        
    }
    
    // перезапишем toString
    public String toString(){
        return "Car's color is " + color + ", car's engine is " + engine;
    }
    
    
}



