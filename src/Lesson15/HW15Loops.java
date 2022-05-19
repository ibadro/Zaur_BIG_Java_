
package Lesson15;

public class HW15Loops {
    
    static void showTime() {
        
        int hour = 0;
        
        OUTER: while(hour < 6) {
            
            int min = -1; // если использовать 0, то после 1 часа начнется второй из-за цикла ду вайл
        
            MIDDLE: do {
            
                int sec = 0;
                min++;
                
                if ((hour > 1) && (min % 10 == 0)) {
                    break OUTER;
                }
                
                INNER: while(sec < 60) {
                    
                    if ((sec * hour) > min) {
                        continue MIDDLE; 
                    }
                
                    System.out.println(hour + ":" + min + ":" + sec);
                    
                    sec++;
                
                }

            } while(min < 59);
            
            hour++;
            
        }
        
    } 
    
    public static void main(String[] args) {
        
        showTime();
        
    }
    
}
