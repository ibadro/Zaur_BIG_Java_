
package Lesson20;

import java.util.ArrayList;

public class Test2 {
    
    public static void main(String[] args) {
        
        ArrayList <String> list = new ArrayList <>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        // метод add() по умолчанию обавляет элемент в конец ArrayList
        
        list.add(1, "hello"); // добавляем hello на место первого индекса ArrayList
        
        for(String s:list) {
            System.out.print(s + " "); // poka hello privet ok 
        }
        System.out.println("");
        System.out.println("***");
        
        String getItem = list.get(3);
        System.out.println(getItem); // ok
        // метод get() выводи элемент ArrayList согласно его индексу в ()

        for (int i = 0; i < list.size(); i++) { // list.size = length
            System.out.print(list.get(i) + " * "); // выводим все элементы ArrayList
        }
        
        list.set(1, "!!!");
        // метод set(тут индекс элемента, который мы меняем, тут то, что мы вставляем)
        // работает как метод replace()
        
        
        System.out.println("");
        
        for (int i = 0; i < list.size(); i++) { // list.size = length
            System.out.print(list.get(i) + " * "); // выводим все элементы ArrayList
        }
        // поменяли hello на !!!
        // тк hello стояло на 1 индексе ArrayList list
        
        
    }
    
}
