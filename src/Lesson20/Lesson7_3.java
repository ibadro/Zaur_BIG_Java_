
package Lesson20;

import java.util.ArrayList;

public class Lesson7_3 {
    
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> list1 = new ArrayList <>();
        
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = new StringBuilder("s3");
        
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        
        // метод toArray() --> возвращает Object[]
        // переводит ArrayList в Array
        
        Object [] array = list1.toArray();
        for(Object obj:list1) {
            System.out.print(obj + " "); // s1 s2 s3
        }
        
        // метод toArray(datatype [] arr) --> возвращает datatype[]
        
        StringBuilder [] ss = list1.toArray(new StringBuilder[10]);
        // новому массиву стрингбилдер я присваиваю массив стрингбилдер,
        // я его получаю из аррейлиста при помощи метода туаррей
        System.out.println("***");
        for(StringBuilder sb:ss) {
            System.out.print(sb + " "); // s1 s2 s3 null null null null null null null
            
        }
        // откуда взялись 7 нал?
        // я создал массив длинной 10, 3 из который уже были в list1, а еще 7 элементов стрингбилдер имеют дефолтное значение нал
        
    }
    
}
