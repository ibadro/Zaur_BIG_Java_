
package Lesson20;

import java.util.ArrayList;
import java.util.Collections; 

public class Test9 {
    
    public static void main(String[] args) {
        
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        
        ArrayList <String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        
        System.out.println(list1); // [c, a, d, b]
        // он несортированный, сейчас отсортируем
        // для этого нужен класс Collections
        
        Collections.sort(list1);
        System.out.println(list1); // [a, b, c, d]
        // list отсортирован!
        
        
        
        // метод equals работает как в классе Стринг
        
        ArrayList <String> list2 = list1; // делаем копию list1
        System.out.println(list2.equals(list1)); // true
        
        ArrayList <String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);
        
        Collections.sort(list3); // отсортировали только созданный листаррей
        
        System.out.println(list3.equals(list1)); // true
        
        
    }
    
}
