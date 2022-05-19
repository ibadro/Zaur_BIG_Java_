
package Lesson9;

public class Car3 {
    
    
    String color;
    String engine;
    static int count; // глобальная, пренадлежит всему классу
    int a = 10;
    
    
    
    Car3(String color, String engine) {
        

        count++;
       
        this.color = color;
        this.engine = engine;     
 
    }
    
    void changeColor(String color) {
    
        this.color = color;
        // this показывает, что я обращаюсь к инстанс переменной String color класса Кар3
        System.out.println(color);
    
    }
    
    void changeColor(String color, int b) {
    
        System.out.println(color);
    
    }
        
    
    public static void main(String[] args) {
        
        Car3 newCar = new Car3("white", "diesel");
        System.out.println(newCar.color);
        
        newCar.changeColor("black");
        
        System.out.println(newCar.color);
        System.out.println("*****************");
        
        Car3 newCar2 = new Car3("white", "diesel");
        System.out.println(newCar2.color);
        
        newCar2.changeColor("black", 12);
        
        System.out.println(newCar2.color);
        
        // что мы видим, перед ***************** мы работаем с методом, который меняет объект при помощи
        // ключевого слова this обращается к инстанс переменной color
        
        // во втором случае метод просто выводит параметр с одноименным именем color
        // не меняя сам объект, тк имя параметра может быть таким же, как и имя инстанс переменной
        
    }
    
    
}
