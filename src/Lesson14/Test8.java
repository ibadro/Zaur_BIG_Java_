
package Lesson14;

public class Test8 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) { // int i = 0 использовать тут нельзя, тк
            // 0%55=0
            // то есть сразу сработает break и цикл остановится
            if (i == 10) {
                continue;
            }
            
            if (i % 55 == 0) {
                break;
            }
            
            System.out.println(i); // выведет от 1 до 54, пропуская 10
        }
        
    }
    
}

