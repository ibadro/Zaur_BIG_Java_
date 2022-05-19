
package Lesson26;

import java.util.ArrayList;

public class Test2 {
    
    public static void main(String[] args) {
        // WRAPPER classes
        
        // autoboxing
        ArrayList <Integer> list = new ArrayList<>(); // ArrayList может принимать в дженерик только референс типы данных
        list.add(5);
        
        Long l = 50L; // нужно всегда указывать L, иначе будет ошибка
        // autoboxing - это конвертация примитивов в соответствующий Wrapper class
        
        
        // unboxing
        int a = list.get(0);
        System.out.println(a); // 5
        // присвоили Integer со значением 5 переменной инт а, она сконвертировалась
        // из Integer в инт
        
        Integer b = new Integer(5); // создаем объект враппер класса Интеджер со знач 5
        int bb = b;
        System.out.println(bb); // 5
        // тоже пример unboxing
        
        
        // wrapper class можно прокинуть в свич
        // РОДИТЕЛЬ ВСЕХ ВРАПЕР КЛАССОВ- КЛАСС НАМБЕР
        
        Number bbb = new Integer(5);
        System.out.println(bbb); // 5
        
        // Byte
        
//        Byte by1 = new Byte(1); // так создать нельзя, потому что
                                  // параметр внутри должен быть байт
                                  
        byte by2 = 5;
        Byte by3 = new Byte(by2); // а вот так нужно(внутрь конструктора прокидываем байт)
        Byte by4 = new Byte((byte)5); // закастить байт тоже можно

    }
    
}
