
package Lesson24;

public class Test7 {
    
}

interface I11{
    // private методы разрешены в интерфейсах в 9 джаве
    private static void method1(){
        System.out.println("static method1");
    }
    
    private void method2(){
        System.out.println("static method2");
    }
    // private интерфейс метод может быть использован только внутри интерфейса
    // в котором он создан
    
    
    // private static методы можно вызывать внутри default методов 
    // В ОДНОМ И ТОМ ЖЕ ИНТЕРФЕЙСЕ
    default void method3(){
        method1();
        // private non-static метод можно вызвать внутри non-static метода
        method2();
        
    }
    
    // private static методы можно вызывать внутри static методов 
    // В ОДНОМ И ТОМ ЖЕ ИНТЕРФЕЙСЕ
    static void method4(){
        method1();
        // private non-static метод нельзя вызвать внутри private static метода
//        method2();
    }
    
}