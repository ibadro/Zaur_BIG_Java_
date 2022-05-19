
package Lesson20_2;

import java.util.*;

public class Test1 {
    
    public static void main(String[] args) {
        
        // метод removeAll
        ArrayList <String> arrList = new ArrayList <>();
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");
        arrList.add("4");
        arrList.add("5");

        
        System.out.println("arrayList: " + arrList); // arrayList: [1, 2, 3, 4, 5]
        
        ArrayList <String> arrList2 = new ArrayList <>();
        arrList2.add("1");
        arrList2.add("2");
        arrList2.add("3");
        arrList2.add("fff");
        
        // arrList.removeAll(arrList2) - удаляет ArrayList2 из ArrayList,
        // если в ArrayList2 нет ни одного элемента схожего с ArrayList
        // ArrayList не изменится
        
//        arrList.removeAll(arrList2);
//        System.out.println("arrayList: " + arrList); // arrayList: [4, 5]
        
        // метод retainAll
        
        // arrList.retainAll(arrList2) - сохраняет в ArrayList только то, что есть в ArrayList2
 
        arrList.retainAll(arrList2);
        System.out.println("arrayList: " + arrList); // arrayList: [1, 2, 3]
        //  "4", "5" and "fff" не попадают в arrList
        
        
        // containsAll
        // содерижит ли арр1 всё что есть в арр2
        
        boolean b1 = arrList.containsAll(arrList2);
        System.out.println(b1); // false
        // удалим "fff" из arrList2
        
        arrList2.remove(3);
        
        boolean b2 = arrList.containsAll(arrList2);
        System.out.println(b2); // true
        // потому что из аррлист 2 удалили всё ненужное
        
        
        // sublist - возвращает лист из аррейЛиста
        
        List <String> sublist = arrList.subList(0, 2);
        System.out.println(sublist); // [1, 2]
        // отдельно этот sublist НЕ СУЩЕСТВУЕТ БЕЗ arrList
        // ЭТО ВСЕГО ЛИШЬ VIEW АРРЕЙ ЛИСТА arrList
        // ЭТО НЕ ОТДЕЛЬНАЯ СУЩНОСТЬ
        System.out.println("*********");
        sublist.add("ten");
        System.out.println(sublist); // [1, 2, ten]
        System.out.println(arrList); // [1, 2, ten, 3]
        // ten добавился как в аррейлист, так и в саблист
        
        arrList.add("ee");
        System.out.println(arrList); // [1, 2, ten, 3, ee]
//        System.out.println(sublist); // ConcurrentModificationException
        // почему так?
        // потому что sublist - это представление \ вью arrList
        // то есть работать мы можем с sublist
        
    }
    
}
