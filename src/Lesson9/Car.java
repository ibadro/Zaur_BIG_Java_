
package Lesson9;

public class Car {
    
    
    public String color;
    public String engine;
    static int count; // глобальная, пренадлежит всему классу
    int a = 10;
    
    
    public static void changeA(int b) {
    
//        this.a = b; // this нельзя использовать в static методах
// логика следующая - тк метод статичный, то есть я могу ВЫЗЫВАТЬ ЭТОТ МЕТОД
// ЕЩЕ ДО ТОГО, КАК БУДЕТ СОЗДАН КАКОЙ-ЛИБО ОБЪЕКТ, то есть принадлежит ВСЕМУ КЛАССУ
// а this принадлежит к ТЕКУЩЕМУ ОБЪЕКТУ. то есть использовать зис нельзя

        Car carB = new Car("balck", "v6");
        carB.a = b;
        
       // поменяет int a = 10; только для метода changeA
        
        
    }
    
    public Car(String color, String engine) {
        
//        int x;
//        int y  = x + 10;
// ошибка, тк, х не равно 0, тк у локальных переменных нет ДЕФОЛТНОГО ЗНАЧЕНИЯ.
// ПРЕЖДЕ ЧЕМ С НИМИ РАБОТАТЬ, ИХ НУЖНО ЗАДАТЬ

        count++;
        // this.count++
        // так тоже можно, ибо переменная count - static
        this.color = color;
        this.engine = engine;     
        
        // this - говорит о том, что мы обращаемся к инстанс переменной класса Кар
        // почему так писать можно, тк у них разниые области видимости
        // одни инстанс переменные - видны во всем классе
        // вторые видны только внутри конструктора
        // используем this чтобы можно было использовать одни и те же имена переменных
        
    }
    
    public void showColor() {
    
        System.out.println("Color is: " + color);
        changeColor("red");
    
    }
    
    public void changeColor(String newColor) {
        
        System.out.println("Color is changed");  
        int price = 5000;
        color = newColor;
        price +=1000; // локальная переменная, видна только внутри метода
        
        
    }
    
    
    
}
