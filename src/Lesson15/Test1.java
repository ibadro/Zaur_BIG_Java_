
package Lesson15;

public class Test1 {

    public static void main(String[] args) {
        
        int i = 1; // переменная создается вне цикла вайл
        
        while(i <= 10) { // contition = true / условие тру, если да, цикл начинается, как только фолс, он заканчивается
        
            System.out.println(i);
            i++;
        }
        
        System.out.println(i); // 11
        // так как int i - глобальная переменная, она не создана внутри цикла, она создана ВНЕ цикла
        
    }
    
}
