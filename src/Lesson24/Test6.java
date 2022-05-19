
package Lesson24;

public class Test6 {
    
}

interface I2{

    default void abc(){
        System.out.println("default method");
    }
    
    static void def(){
    
        System.out.println("static method");
        
    }
}

class R2 implements I2{
    // статический метод не наследуется из интерфейса в класс и не дает возможность
    // напрямую обращаться к этому методу
    
    // обращаться же к статическому методу интерфейса можно только с помощью названия интерфейса
    
    public static void main(String[] args) {
        
        I2.def(); // static method
        
    }

}

class R3{ // вызывать статический метод интерфейса можно нее только из класса
    // который имплементит интерфейс, всё дело в обсласти видимости
    
    // если бы  I2 был дефолт и класс находился в другом пакете, то такой трюк бы не прошел

    public static void main(String[] args) {
        
        I2.def(); // static method
        
    }

}