
package Lesson8;

public class Car {
    
    String color = "blue";
    String engine = "v6";
    
}


class Human{

    String name = "John";
    final Car ford = new Car();
    
    public static void main(String[] args) {
        
        
        Human humanJohn = new Human();
//        humanJohn.ford = new Car();
//        humanJohn.ford = new Car();
// компилятор ругается на то, что мы не можем менять адрес к объекту кар
// тк он стал константным


        humanJohn.ford.engine = "v12";
        // нооооо
        // мотор я поменять могу, тк, я меняю сам объект, а не его адресс
        // константные объекты не дают менять АДРЕС!
        
        
        
        
        
    }

}
