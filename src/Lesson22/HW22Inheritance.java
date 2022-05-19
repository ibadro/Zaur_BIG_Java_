
package Lesson22;

public class HW22Inheritance {
    
}

class Animal{

    Animal(){
        System.out.println("I am animal");
    }
    
    int eyes;
    
    void eat(){
        System.out.println("Animal eats");
    }
    
    void drink(){
        System.out.println("Animal drinks");
    }
    
}

class Pet extends Animal{

    Pet(){
        eyes = 2;
        System.out.println("I am Pet");
    }
    
    String name;
    int tail = 1;
    int paw = 4;
    
    void run(){
        System.out.println("Pet runs");
    }
    
    void jump(){
        System.out.println("Pet jumps");
    }
    
}

class Dog extends Pet{

    Dog(String name) {
    
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    
    }
    
    void play(){
        System.out.println("Dog plays");
    }
    
}

class Cat extends Pet{

    Cat(String name) {
    
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    
    }
    
    void sleep(){
        System.out.println("Cat sleeps");
    }

}


class HWTest{

    public static void main(String[] args) {
        
        Dog doggyDog = new Dog("Scoob");
        System.out.println(doggyDog.paw);
        
        Cat kittyCat = new Cat("Karl");
        kittyCat.sleep();
        
    }
    
}