
package Lesson21;

public class Test2 {
    
    Test2(){
        System.out.println("object is created");
    }
    
    // если добавить реторн тайп войд перед Test2(), то конструктор становится методом
    void Test2() {
        System.out.println("it is method");
    }
    
    Test2 Test2; // можно создать переменную с таким же именем как метод
    // создали переменную Test2 класса Test2
    
}

class A {
    
    public static void main(String[] args) {
        
        Test2 t1 = new Test2();
        // object is created
        
        t1.Test2();
        // it is method
        
    }

}
