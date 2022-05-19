
package Lesson9;

public class Car2 {
    
    
    String color;
    String engine;
    static int count; 
    int a = 10;
    
    
    public static void changeA(int b) {

        Car2 carB = new Car2("balck", "v6");
        carB.a = b;

    }
    
    Car2(String color, String engine) {
        

        count++;
 
        this.color = color;
        this.engine = engine;     
 
    }
    
    void abc(int a, int b) {
    
        boolean c = true;
    
    }
    
    void abcd(int a, int b) {
    
        boolean c = true;
    
    }
    // 2 метода имеют одинаковые имена параметров, тк область их видимости разная
    // параметры метода abc никогда не пересекутся с параметрами метода abcd
    
    // внутри этих методов созданы одинаковые переменные boolean c, так делать можно
    // тк у них разная область видимости, и они никогда не пересекуться
    
    
}  
    
