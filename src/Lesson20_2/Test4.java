
package Lesson20_2;

import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static void main(String[] args) {
        
        // map - key -- value
        Map <Integer, String> map1 = new HashMap<>();
        map1.put(777, "Ivanov Misha");
        map1.put(778, "Tregulov Zaur");
        map1.put(779, "Bashirov Ashot");
        map1.put(780, "Baranov Grisha");
        map1.put(778, "Tregulov Pelmen"); // обавим с таким же интеджер
        // таким образом мы перезапишем значение
        // было {777=Ivanov Misha, 778=Tregulov Zaur, 779=Bashirov Ashot, 780=Baranov Grisha}
        
        // стало
        System.out.println(map1); // {777=Ivanov Misha, 778=Tregulov Pelmen, 779=Bashirov Ashot, 780=Baranov Grisha}
        
        
        // это касается только кей, с одинаковым вэлуе работать можно, только нужно задать ему другой кей
        
        map1.put(111, "Tregulov Pelmen");
        System.out.println(map1);
        // {777=Ivanov Misha, 778=Tregulov Pelmen, 779=Bashirov Ashot, 780=Baranov Grisha, 111=Tregulov Pelmen}
        // 2 одинаковых  Tregulov Pelmen, но с разными кеями
        
        map1.remove(778); // удаляем из Map ПО КЛЮЧУ
        System.out.println(map1);
        // {777=Ivanov Misha, 779=Bashirov Ashot, 780=Baranov Grisha, 111=Tregulov Pelmen}
        
        
    }
    
}
