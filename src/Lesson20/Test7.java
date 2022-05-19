
package Lesson20;

import java.util.ArrayList;

public class Test7 {
    
    public static void main(String[] args) {
        
        // clone() - клонирование
        
        ArrayList <StringBuilder> list = new ArrayList <>();
        
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        
        
        
        ArrayList <StringBuilder> list2 = (ArrayList <StringBuilder>)list.clone();
        // таким образом мы клонируем лист и присваиваем его копию лист2
        
        for (StringBuilder s:list2) {
            System.out.println(s);
        }
        
        // содержимое у них одинаковое, но ССЫЛАЮТСЯ ОНИ НА РАЗНЫЕ ОБЪЕКТЫ
        System.out.println(list==list2); // false
        
        
        ArrayList <StringBuilder> list3 = list;
        // А ВОТ В ЭТОМ СЛУЧАЕ, Я СОЗДАЛ ЛИСТ3, КОТОРЫЙ ССЫЛАЕТСЯ НА ТОТ ЖЕ ОБЪЕКТ , ЧТО И ЛИСТ
        
        System.out.println(list==list3); // true
        
        
        
        
        
    }
    
}
