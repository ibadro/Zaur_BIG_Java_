
package Lesson27;

public class Test7 {
 
    static void abc(){
        System.out.println("abc is working");
        abc(); // abc вызывает abc
        // то есть метод вызывает сам себя - это рекурсия
        // данный пример иллюстративный, он приведет к зацикливанию
    }
    
    public static void main(String[] args) {
        // БУДЕТ ОШИБКА , НО ЕЕ НЕ НУЖНО ОБРАБАТЫВАТЬ, КАК ЭКСЕПШЕН
        abc(); // ERROR ОБРАБАТЫВАТЬ НЕ НАДО
        
    }
    
}

