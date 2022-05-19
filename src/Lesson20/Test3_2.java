
package Lesson20;

import java.util.ArrayList;
        
public class Test3_2 {
    
    public static void main(String[] args) {
        
        ArrayList <String> listOfSB = new ArrayList <>();
        
        String sb1 = new String("hello");
        String sb2 = new String("ok");
        String sb3 = new String("privet");
        
        listOfSB.add(sb1);
        listOfSB.add(sb2);
        listOfSB.add(sb3);
        
        
        for(String sb:listOfSB){
            System.out.print(sb + " "); // hello ok privet
        }

        System.out.println("");
        listOfSB.remove("ok");
        
        for(String sb:listOfSB){
            System.out.print(sb + " "); // hello privet
        } // ПОЧЕМУ ТАК???
        // то есть ok удалился, да всё потому что в классе стринг метод иквалс работает не так, как в стрингбилдере
            
        System.out.println("");
        
        
        // метод clear() очищает содержимое ArrayList
        listOfSB.clear();
        
        for(String sb:listOfSB){
            System.out.print(sb + " ");
        }// пусто

        
    }
    
}
