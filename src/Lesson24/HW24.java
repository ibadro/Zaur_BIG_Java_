
package Lesson24;

public class HW24 {
    
    public static void main(String[] args) {
        
        Mechenosec2 mechenosec = new Mechenosec2("Mechenosec Rex");
        System.out.println(mechenosec.name); // Mechenosec Rex
        mechenosec.swim(); // Mechenosec swims
        mechenosec.sleep(); // fish sleeps
        mechenosec.eat(); // Mechenosec eats food for fish
        
        
        Speakable speakablePingv = new Pingvin2("Maxik");
        speakablePingv.speak(); // Pingvin can not speak russian
        
        
        Animal2 lionMufasa = new Lion2("Mufasa");
        System.out.println(lionMufasa.name); // Mufasa
        lionMufasa.eat(); // Lion prefers to eat meat
        lionMufasa.sleep(); // Lion prefers to sleep a lot
        
        
        Mammal2 lionSimba = new Lion2("Simba");
        System.out.println(lionSimba.name); // Simba
        lionSimba.run(); // Lion runs like a cat
        lionSimba.eat(); // Lion prefers to eat meat
        lionSimba.sleep(); // Lion prefers to sleep a lot
        lionSimba.speak(); // somebody speaks      
              
    }
    
}

abstract class Animal2{

    Animal2(String name) {
        this.name = name;
    }
    
    String name; 
    
    abstract void eat();
    abstract void sleep(); 

}

abstract class Fish2 extends Animal2{

    Fish2(String name){
    
        super(name);
        this.name = name;
    
    }

    abstract void swim();
    
@Override    
    public void sleep(){
        System.out.println("fish sleeps");
    }

}

abstract class Bird2 extends Animal2 implements Speakable{
    
    Bird2(String name){
    
        super(name);
        this.name = name;
    
    }
    
    abstract void fly();
    
@Override    
    public void speak(){
        System.out.println(name + " sings");
    }

}

abstract class Mammal2 extends Animal2 implements Speakable{

    Mammal2(String name){
    
        super(name);
        this.name = name;
    
    }
    
    abstract void run();

}

interface Speakable{

    default void speak(){
        System.out.println("somebody speaks");
    }

}

class Mechenosec2 extends Fish2{

    Mechenosec2(String name){
    
        super(name);
        this.name = name;
    
    }
    
@Override    
    public void swim(){
        System.out.println("Mechenosec swims");
    }
@Override   
    public void eat(){
        System.out.println("Mechenosec eats food for fish");
    }
    
}

class Pingvin2 extends Bird2{

    Pingvin2(String name){
    
        super(name);
        this.name = name;
    
    }
    
@Override    
    public void eat(){
        System.out.println("Pingvin prefers to eat fish");
    }   
@Override    
    public void sleep(){
        System.out.println("Pingvin prefers to sleep a lot");
    }
@Override    
    public void fly(){
        System.out.println("Pingvin can not fly");
    }
@Override    
    public void speak(){
        System.out.println("Pingvin can not speak russian");
    }   
    
}

class Lion2 extends Mammal2{
    
    Lion2(String name){
        
        super(name);
        this.name = name;
        
    }
    
@Override
    public void eat(){
        System.out.println("Lion prefers to eat meat");
    }
@Override    
    public void sleep(){
        System.out.println("Lion prefers to sleep a lot");
    }
@Override    
    public void run(){
        System.out.println("Lion runs like a cat");
    }

}