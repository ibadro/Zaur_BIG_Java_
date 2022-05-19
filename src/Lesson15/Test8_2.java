
package Lesson15;

public class Test8_2 {
    
    public static void main(String[] args) {
        
        OUTER: for (int i = 0; i <= 23; i++) {
            
            int k = 0;
            
            INNER: while(k < 60) {
                
                if(i % 2 == 0) {
                    continue OUTER; // все четные часы мы ПРОПУСКАЕМ
                }
                
                System.out.println(i + ":" + k);
                k++;
                
            }

        }
        
    }
    
}
