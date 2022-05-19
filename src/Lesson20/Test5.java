
package Lesson20;

import java.util.ArrayList;

public class Test5 {
    
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> list = new ArrayList <>();
        
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        
        // теперь почистим ArrayList
        
        list.clear();
        
        // проверим пустой ли наш ArrayList методом isEmpty();
        
        System.out.println(list.isEmpty()); // true
        
        
    }
    
}
