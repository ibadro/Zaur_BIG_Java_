
package Lesson20;

import java.util.ArrayList;

public class Test4 {
    
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> list = new ArrayList <>();
        
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        
        for(StringBuilder sb1:list) {
            System.out.println(sb1 + " ");
        }
        System.out.println("");
        System.out.println(list.indexOf(new StringBuilder("poka"))); // -1 (-1 = фолс)
        // потому что в new StringBuilder("poka") создается новый StringBuilder
        // разные объекты 
        
        System.out.println("");
        ArrayList <String> list2 = new ArrayList <>();
        
        list2.add(new String("poka"));
        list2.add(new String("privet"));
        list2.add(new String("ok"));
        list2.add(new String("hello"));
        list2.add(new String("poka"));
        
        for(String str1:list2) {
            System.out.println(str1 + " ");
        }
        System.out.println("");
        System.out.println(list2.indexOf(new String("poka"))); // 0
        // индекс new String("poka") находится на 0 индексе
        
        System.out.println(list2.indexOf(new String("ok"))); // 2
        
        // РАЗНИЦА String С StringBuilder
        
        
        System.out.println(list2.lastIndexOf(new String("poka"))); // 4
        // lastIndexOf выводит последний индекс
        
    }
    
}
