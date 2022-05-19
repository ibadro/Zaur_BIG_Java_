
package Lesson24;

public class Test5 {
    
    public static void main(String[] args) {
        
        Z z1 = new Z();
        z1.def(); // eto method def
        // обращаемся к дефолтному методу интерфейса I1
        
    }
    
}

interface I1{
    
    void abc();
    default void def(){ // default method в джава8 можно не ОВЕРРАЙДИТЬ
    // слово default перед дефолтным методом в интерфейсе -это не АКСЕСС МОДЕФАЕР
    // ЭТО НАМ ГОВОРИТ О ТОМ, ЧТО ОН ИМЕЕТ ДЕФОЛТНОЕ ЗНАЧЕНИЕ
    // ПО УМОЛЧАНИЮ ВСЕ МЕТОДЫ ИНТЕРФЕЙСА ПАБЛИК
        System.out.println("eto method def");
    }
    // DEFAULT МЕТОД БЕЗ ТЕЛЯ МЫ СОЗДАТЬ НЕ МОЖЕМ
    
    // этот дефолтный метод можно оверрайдить под свои нужды
    
}

class Z implements I1{
    // либо оверрайдим методы интерфейса , либо делаем класс абстрактным
    public void abc(){
        System.out.println("eto method abc");
    }
    
}