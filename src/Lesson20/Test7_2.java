
package Lesson20;

import java.util.ArrayList;

public class Test7_2 {
    
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> list1 = new ArrayList <>();
        
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = new StringBuilder("s3");
        
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        
        // сейчас клонирем наш аррейлист
        
        ArrayList <StringBuilder> list2 = (ArrayList <StringBuilder>)list1.clone(); // clone()
        
        System.out.println(list1.get(0) == list2.get(0)); // true
        // тру , потому что объекты на 0 индексе в аррейлистах одинаковые
        
        System.out.println(list1 == list2); // false
        // НО САМИ ОБЪЕКТЫ КЛАССА АРРЕЙЛИСТ РАЗНЫЕ И ИМЕЮТ РАЗНЫЕ ССЫЛКИ
        
        // ЕСЛИ МЫ ИЗМЕНИМ КАКОЙ-НИБУДЬ ИНДЕКС ОБЪЕКТА list1, ТО ОН ПОМЕНЯЕТСЯ И В list2
        
        list1.get(0).append("!!!"); // станет s1!!!
        
        System.out.println(list1.get(0)); // s1!!!
        System.out.println(list2.get(0)); // s1!!!
        
        // 0 индекс поменялся как в лист1, так и в лист2
        
        
        
        // НО ЕСЛИ МЫ МЕТОДОМ СЕТ ВСТАВИМ НОВЫЙ СТРИНГБИЛДЕР В АРРЕЙЛИСТ, ТО ЗНАЧЕНИЕ ИЗМЕНИТСЯ ТОЛЬКО В ЛИСТ1
        list1.set(0, new StringBuilder("DDD"));
        
        System.out.println(list1.get(0)); // DDD
        System.out.println(list2.get(0)); // s1!!!
        
    }
    
}
