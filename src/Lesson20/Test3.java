
package Lesson20;

import java.util.ArrayList;
        
public class Test3 {
    
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> listOfSB = new ArrayList <>();
        
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        
        listOfSB.add(sb1);
        listOfSB.add(sb2);
        listOfSB.add(sb3);
        
        for (int i = 0; i < listOfSB.size(); i++) { // size , а не length как в массивах!!!!
            listOfSB.get(i).append("!!!"); // каждому элементу ArrayList добавляем !!! в конец
        }
        
        for(StringBuilder sb:listOfSB){
            System.out.print(sb); // hello!!!ok!!!privet!!!
        } // вывели все элементы ArrayList 
        System.out.println("");
        
        listOfSB.remove(2); // второй индекс в АррейЛисте - privet
        // удаляем из ArrayList listOfSB элемент под индексом 2

        
        for(StringBuilder sb:listOfSB){
            System.out.print(sb); // hello!!!ok!!!
        }
        System.out.println("");
        
                
        listOfSB.remove(sb1); // можно удалять не только по индексу, но и прокидывать в аргумент переменные такого же типа, что и ArrayList, то есть StringBuilder
        for(StringBuilder sb:listOfSB){
            System.out.print(sb); // ok!!!
        }
        System.out.println("");
        
        listOfSB.remove("ok!!!");
        
        for(StringBuilder sb:listOfSB){
            System.out.print(sb); // ok!!!
        } // ПОЧЕМУ ТАК???
        // ДА ПОТОМУ ЧТО ЭТО StringBuilder
        // А МЕТОД EQUALS РАБОТАЕТ КАК == , ОН СРАВНИВАЕТ 2 ОБЪЕКТА, А ТОЧНЕЕ ИХ АДРЕСА
        // ЕСЛИ МЫ СДЕЛАЕМ ТОЖЕ САМОЕ, НО С STRING, ТО ok!!! ИСЧЕЗНЕТ
        
        
    }
    
}
