
package Lesson8;


public class Test3 {
    
    String name;
    int age;
    
    Test3 (String name1, int age1) {
    
        name = name1;
        age = age1;
    
    }
    
    public static void staticMethod() {
    
        System.out.println("i can exist without object");
    
    }
 
    
}

class Test3Test {

    public static void main(String[] args) {
        // мейн метод запускается в тот момент, когда никаких объектов не существует
        // можно вызывать без создания объектов только статик методы
        
        Test3.staticMethod(); // указываем имя класса Test3
        // при этом не создаем объект      
                
    }

}

