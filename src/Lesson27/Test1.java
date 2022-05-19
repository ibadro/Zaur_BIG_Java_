
package Lesson27;

public class Test1 {
    
    public static void main(String[] args) {
        
        Animal an = new Tiger();
        System.out.println(an.a); // 5
        System.out.println(an.b); // 10
        // определяется кампайл тайм
        an.abc(); // non-static method in class Tiger
        // ран тайм оверрайдится метод абс
        an.def(); // static method in class Animal
        
    }
    
}

class Animal{

    int a = 5;
    static int b = 10;
    void abc(){System.out.println("non-static method in class Animal");}
    static void def(){System.out.println("static method in class Animal");}

}

class Tiger extends Animal{

    int a = 15;
    static int b = 20;
    void abc(){System.out.println("non-static method in class Tiger");}
    static void def(){System.out.println("static method in class Tiger");}

}