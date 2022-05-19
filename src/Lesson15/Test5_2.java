
package Lesson15;

public class Test5_2 {
    
    public static void main(String[] args) {
        
        int a = 5; // 6,7,8,9,10,11,12
        
        while(a++ < 10) {
            a++;
        }
        
        // почему 12, в последнем кейсе мы заходим в кондишен с а = 11, но перед тем как выбить фолс, значение инкрементируется
        // то есть на выходе 11 становится 12
        
        System.out.println(a); // 12
        
    }
    
}
