
package Lesson25;

public class Test2 {
    
}

class Car{
    
    static int a = 5;
    
    public static void main(String[] args) {
        
        Car c = new Car();
        
        System.out.println(c.a); // 5
        
        c = null; // c уже не ссылается на объект класса Car
        
        System.out.println(c.a); // 5
        // все потому что  int a = статик
        // нет разницы с ссылается на какой-то объект или нет
        
    }
    
}