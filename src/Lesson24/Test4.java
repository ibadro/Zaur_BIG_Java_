
package Lesson24;

public class Test4 {
    
    // от одного интерфейса можно ссылаться на разные НЕСВЯЗАННЫЕ ДРУГ С ДРУГОМ
    // объуекты разных классов
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
    
}

class Human implements Jumpable{
    
    public void jump(){ // метод должен быть паблик!!!
        System.out.println("Human jumps");
    }
    
}

class Animal implements Jumpable{
    
    public void jump(){ // метод должен быть паблик!!!
        System.out.println("Animal jumps");
    }
    
}

interface Jumpable{
    void jump(); // тк это абстактный метод
}

interface Smellible{
    void smell(); // тк это абстактный метод
}

interface Smileble extends Jumpable, Smellible{ // интефрейсы могут наследовать 1 и более интерфейсов
    void smile(); // тк это абстактный метод
}


abstract class D implements Jumpable, Smellible{ // абстактный класс тоже может имплементировать интерфейс

}