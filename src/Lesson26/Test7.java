
package Lesson26;

public class Test7 {
    
    public static void main(String[] args) {
        
//        Animal a = new Animal();
        // static init block of animal
        // non-static init block of animal
        // constructor of animal
        
        System.out.println("************");
        
        // статик инит блоки срабатывают только 1 раз в самом начале, если
        // создать несколько объектов класс лаен, то повторится всё кроме статик 
        // инит блоков
        
        Lion l = new Lion(); // сначала вызовутся все статик инит блоки, 
                             // потом инит блок супер класса и его конструктор
                             // потом инит блок родителя лаен класса, то есть маммал и его конструктор
                             // ну а в самом конце инит блок самого класса лаен и его конструктор
        // static init block of animal
        // static init block of Mammal
        // static init block of Lion
        // non-static init block of animal
        // constructor of animal
        // non-static init block of Mammal
        // constructor of Mammal
        // non-static init block of Lion
        // constructor of Lion
        
        
//        Lion l2 = new Lion();
//        ************
//static init block of animal
//static init block of Mammal
//static init block of Lion
//non-static init block of animal
//constructor of animal
//non-static init block of Mammal
//constructor of Mammal
//non-static init block of Lion
//constructor of Lion
//non-static init block of animal
//constructor of animal
//non-static init block of Mammal
//constructor of Mammal
//non-static init block of Lion
//constructor of Lion
        
    }
    
}

class Animal{
// порядок выполнения
Animal(){System.out.println("constructor of animal");} // #3
static {System.out.println("static init block of animal");} // #1
{System.out.println("non-static init block of animal");} // #2

}

class Mammal extends Animal{

Mammal(){System.out.println("constructor of Mammal");}
static {System.out.println("static init block of Mammal");}
{System.out.println("non-static init block of Mammal");}

}

class Lion extends Mammal{

Lion(){System.out.println("constructor of Lion");}
static {System.out.println("static init block of Lion");}
{System.out.println("non-static init block of Lion");}

}