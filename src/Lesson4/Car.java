
package Lesson4;

public class Car {
    
    String color = "red";
    String engine = "V6";
    // String name = new String("Petr");
    // второй способ создания класса стринг
    
}

class CarTest {

    public static void main (String [] args) {
    
        Car car1 = new Car();
        Car car2 = car1; // 2 переменные car ссылаются на один и тот же объект car1
        
        System.out.println(car1.engine); // V6
        System.out.println(car2.engine); // V6
        
        int a;
        Car car3;
        
        System.out.println(new Car().color); // red
        // так как мы не имеем ссылки на этот объект, то есть он не задан переменной
        // мы не можем юзать этот объект (одноразовое использование)
        
        
        car1.color = "black";
        car1.engine = "V8";
        
//        System.out.print("Color: ");
//        System.out.println(car1.color);
//        System.out.print("Engine: ");
//        System.out.println(car1.engine);

            
        System.out.println("Color: " + car1.color);
        System.out.println("Engine: " + car1.engine);
        // канкотенация


    }
    
}