
package Lesson6;

public class Overloading {
    
    void show(int i1) {
    
        System.out.println("data type is int");
    
    }
    
    void show (boolean b1) {
    
        System.out.println("data type is bool");
        
    }
    
    void show (String s1) {
    
        System.out.println("data type is Str");
        
    }
    
    void show (int a, int b) {
    
        System.out.println("data type is int, but there are 2 parameters in method");
        
    }
    
    
    // пример оверлодинга, 3 разных метода шоу, кампилятор понимает сам что нужно вызывать
    // компилятор выбирает нужный метод по имени метода и типу данных, который прописан в самом методе
    // можно создавать только один метод с одним именем и типом данных, но если добавить лишний праметр, то компилятор это пропустит
    // в случае с void show (int a, int b) , похоже на void show(int i1), если бы было одинаковое кол-во параметров, копилятор не пропустил бы
    
    
    void show (String s12, int b12) {
    
        System.out.println("такие же методы, только типы данных в параметрах стоят в другом порядке (стринг и инт)");
        
    }
    
    
    void show (int b13, String s13) {
    
        System.out.println("такие же методы, только типы данных в параметрах стоят в другом порядке (инт и стринг)");
        
    }
    
    
}


class OverloadingTest {

    public static void main(String [] args) {
    
        Overloading over = new Overloading();
        int a = 500;
        over.show(a); // data type is int
        // прокидываем переменную в качестве аргумента
        
        boolean b = true;
        over.show(b); // data type is bool
        // прокидываем переменную в качестве аргумента
        
        String s = "kolyan";
        over.show(s); // data type is Str
        
        over.show(12, 123);
        // data type is int, but there are 2 parameters in method
        
        over.show("ff", 12);
        // такие же методы, только типы данных в параметрах стоят в другом порядке (стринг и инт)
        over.show(12, "ff");
        // такие же методы, только типы данных в параметрах стоят в другом порядке (инт и стринг)
        
        
        
    }

}