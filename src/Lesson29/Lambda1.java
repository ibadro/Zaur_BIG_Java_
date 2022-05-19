
package Lesson29;

import java.util.*;

public class Lambda1 {
    
    // ключевое слово var
    
//    var v = 10;
    // var нельзя использовать вне методов
    
    public static void main(String[] args) { // в методе мейн используем var
        
//        TestInferenceType tip = new TestInferenceType();
        var tip = new TestInferenceType(); // тоже самое что и выше
          // local variable 
        var i = 10; // это Integer
        var w = 1.5f; // это Float
//          String [] arr = new String [] {"a","b"};
        var arr = new String []{"a","b"}; // тоже самое что и выше
        var result = abc(); // локальной переменной result присваиваем значения метода abc()
          
        Object obj1 = "privet";
        var obj2 = obj1; // obj2 будет иметь тип данных - Object
          
        ArrayList <String> aL = new ArrayList<>();
        for (var s:aL) {
            System.out.println(s);
        }
          
//          var h; // ужно сразу задовать значение локальной переменной var

        var var = "var"; // да-да не удивляйтесь, но так лучше не писать
          
    }
    
    static double abc(){ // внутри параметров нельзя использовать var
        return 3.14;
    }
    
}

class TestInferenceType{}


interface I{ // функциональный интерфейс, потому что содержить ТОЛЬКО 1 АБСТРАКТНЫЙ МЕТОД

    void abc();
    
    default void def1(){};
    default void def2(){};
    default void def3(){};
    //  несмотря на то, что тут целыйх 4 метода, абстрактным является только void abc();
    // следовательно interface I является функциональным

}