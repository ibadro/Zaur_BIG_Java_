
package Lesson25;

public class HW25 {
    
    public static void main(String[] args) {
        
        Animal2 a1 = new Mechenosec2("Karl_1");
        Animal2 a2 = new Pingvin2("Kovalski_1");
        Animal2 a3 = new Lion2("Leva_1");
        
        Fish2 f1 = new Mechenosec2("Karl_2");
        Bird2 b1 = new Pingvin2("Kovalski_2");
        
        Mammal2 m1 = new Lion2("Leva_2");
        Mechenosec2 mech1 = new Mechenosec2("Karl_3");
        Pingvin2 p1 = new Pingvin2("Kovalski_3");
        Lion2 l1 = new Lion2("Leva_3");
        
        Speakable s1 = new Pingvin2("Kovalski_4");
        Speakable s2 = new Lion2("Leva_4");
        
        Animal2 [] arr1 = {a1, a2, a3, b1, m1, mech1, p1, l1};
        Speakable [] arr2 = {s1, s2, b1, m1, p1, l1};
        
        for(Animal2 animal:arr1){
            
            if (animal instanceof Mechenosec2) {
                
                Mechenosec2 m = (Mechenosec2)animal;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
                
            } else if (animal instanceof Pingvin2) {
                
                Pingvin2 p = (Pingvin2)animal;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
                
            } else if(animal instanceof Lion2) {
                
                Lion2 l = (Lion2)animal;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
                
            }
            System.out.println("*********");
            
        }
        
        for(Speakable spekable:arr2){
            
            if (spekable instanceof Pingvin2) {
                
                Pingvin2 p = (Pingvin2)spekable;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
                
            } else if(spekable instanceof Lion2) {
                
                Lion2 l = (Lion2)spekable;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
                
            }
            System.out.println("-------------");
            
        }
        
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