
package Lesson23;


public class Test3 {
    
    void abc(Animal a){
        System.out.println("A");
    }
    
    // overloaded methods - потому что разные параметры
    void abc(Mouse m){
        System.out.println("M");
    }
    
    public static void main(String[] args) {
        
        Test3 execution = new Test3();
        
        Animal a = new Mouse();
        
        execution.abc(a); // A
        // потому что тип данный переменно а - Animal
        
        a.getName(); // Mouse
        // потому что настоящий объект на который ссылается а - это объект класса Mouse
        // именно поэтому вызвался оверрайдед метод именно Mouse
        
        
    }
    
}


class Animal{
    void getName(){
        System.out.println("Animal");
    }   
}

class Mouse extends Animal{
    // overrided method
    void getName(){
        System.out.println("Mouse");
    }     
}

// final, static, private методы не могут быть оверрайдед