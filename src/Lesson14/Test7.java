
package Lesson14;


public class Test7 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 10; i++) {
            if (i == 7) {
                break; // break говорит о том, что мы покидаем for loop
            }
            
            System.out.println(i);  
        }
        
        System.out.println("it was break");
        
        for (int j = 1; j < 10; j++) {
            if (j == 7) {
                continue; // continue говорит о том, что мы пропускаем это условие и не выполняем его
            }
            
            System.out.println(j);
        }
        
        System.out.println("it was continue");
        
    }
    
}
