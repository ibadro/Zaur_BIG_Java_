
package Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Arrays;

public class Test10 {
    
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
        System.out.println("");
        Collections.sort(list1);
        System.out.println(Arrays.asList(list1));
        
        
        // метод iterator класса Iterator выводит все итерации 
        Iterator <String> it = list1.iterator();
        while(it.hasNext()){ // hasNext() - смотрит, есть след элемент или нет
            System.out.print(it.next() + " "); // next - выводит этот элемент
            // a b c d
        }
        System.out.println("");
        // аналог 
        ListIterator <String> itList = list1.listIterator();
        while(itList.hasNext()){ // hasNext() - смотрит, есть след элемент или нет
            System.out.print(itList.next() + " "); // next - выводит этот элемент
            // a b c d
        }
        
        while(it.hasNext()) {
            it.next();
            it.remove();
        } // удаляем итератором строки из ListIterator
        
        System.out.println("**");
        
        while(itList.hasNext()){ 
            System.out.print(itList.next() + " "); 
            
        } //  it пуст
        
    }
    
}
