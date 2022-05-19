
package Lesson23;

public class Test6 {
    
    public static void main(String[] args) {
        
        Animal2 an = new Mouse2();
        
        an.showInfo(); // Name: Mouse
        // run time binding
        // метод showName был оверрайдед
        
        Mouse2 mouse = new Mouse2();
        mouse.showInfo(); // Name: Mouse
        // потому что метод showName оверрайдед
        
    }
    
}


class Animal2{

    String showName(){
        return "some Animal";
    }
    
    void showInfo(){
        System.out.println("Name: " + showName());
    }
    
}

class Mouse2 extends Animal2{

@Override    
    String showName(){
        return "Mouse";
    }
    
}