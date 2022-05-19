
package Lesson20;

import java.util.ArrayList;

public class Test6 {
    
    public static void main(String[] args) {
        
        // метод contains(object)
        
        ArrayList <StringBuilder> list = new ArrayList <>();
        
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        
        System.out.println(list.contains(new StringBuilder("poka"))); // false
        // см предыдущий пример, дело в том, что сравнение идет через метод иквалс
        // для стринга и стрингбилдера они работают по разному
        
        
        ArrayList <String> listStr = new ArrayList <>();
        
        listStr.add(new String("poka"));
        listStr.add(new String("privet"));
        listStr.add(new String("ok"));
        listStr.add(new String("hello"));
        
        System.out.println(listStr.contains(new String("poka"))); // true
        // см предыдущий пример, дело в том, что сравнение идет через метод иквалс
        // для стринга и стрингбилдера они работают по разному
        
        // метод toString() - показывает как ArrayList выглядит в к-ве строки
        
        System.out.println(list.toString()); // [poka, privet, ok, hello]
        System.out.println(listStr.toString()); // [poka, privet, ok, hello]
        // list arraylist<StringBuilder>
        // listStr arraylist<String>
        
    }
    
}
