
package Lesson16;

public class Car2 {
    
    String color;
    String engine;
    
    Car2(String color, String engine) {
    
        this.color = color;
        this.engine = engine;
        
    }
    
    public Car2 abc(String color2) { // создаем метод abc класса кар2, который создает объекта кар2
                                // с цветом, который мы укажем в атрибуте при вызове и с мотором ВСЕГДА В4
        Car2 c10 = new Car2(color2, "v4");
        return c10; // в конце всегда должен быть реторн не забываем
        
    }
    
    public static void main(String[] args) {
        
        Car2 c = new Car2("red", "v12");
        c.abc("blue");
        
        System.out.println(c.color); // red
        // потому что внутри метода abc создается новый объект класса кар, ссылки разные, меняются разные объекты
        
        
    }

}

