
package Lesson23;

public class Test8 {

    public static void main(String[] args) {
        // так можно делать потому что любой C - это A
        // потому что С - это потомок пэрэнт класса А
        A c1 = new C();
        c1.abc(new B()); // A
        // всё потому что сигнатура методов разная, разные аргументы, то есть методы 
        // не ОВЕРРАЙДЕД, А ОВЕРЛОДЕД
        
        A c2 = new B();
        c2.abc(new B()); // A
        // тоже самое , потому что методы классов B и С 
        // и метод родетельского класса - не ОВЕРРАЙДЕД, ОНИ ОВЕРЛОДЕД
        
        
        //////////
        
        B c3 = new C();
        c3.abc(new B()); // C
        
        // С потому что void abc(B b1) класса B и  void abc(B b2) класса С
        // ОВЕРРАЙДЕД, то есть компилятор обращается непосредственно к перезаписанному 
        // методу класса С, потому что мы создаем объект класса С
        
        
    }
    
}

class A{
    
    void abc(A a) {
        System.out.println("A");
    }
    
}

class B extends A{

    void abc(B b1){
        System.out.println("B");
    }

}

class C extends B{

    void abc(B b2){
        System.out.println("C");
    }

}
// void abc(B b1) И void abc(B b2) - ОВЕРРАЙДЕД МЕТОДЫ