
package Lesson23;

public class Test9 {

    public static void main(String[] args) {
        
        A1 c1 = new C1();
        c1.abc(new A()); // ССССС
        // Почему???
        
        // в сабклассе Б1 метод абс(А а) - перезаписан
        // От А1 мы создаем новый объект класса С1, КОТОРЫЙ НАСЛЕДУЕТ ВСЕ МЕТОДЫ КЛАССА Б1
        // и метод void abc(A a) тоже
        
    }
    
}

class A1{
    
    void abc(A a) {
        System.out.println("A");
    }
    
}

class B1 extends A1{
    
    void abc(A a) {
        System.out.println("ССССС");
    }
    
    void abc(B b1){
        System.out.println("B");
    }

}

class C1 extends B1{

    void abc(B b2){
        System.out.println("C");
    }

}
