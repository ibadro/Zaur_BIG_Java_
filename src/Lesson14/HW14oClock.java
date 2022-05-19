
package Lesson14;

public class HW14oClock {
    
    static void showTime() {
    
        OUTER: for (int hour = 0; hour <= 6; hour++) {
            
            MIDDLE: for (int min = 0; min <= 59; min++) {
                
                if ((hour > 1) && (min % 10 == 0)) {
                    break OUTER;   
                }
                
                INNER: for (int sec = 0; sec <= 59; sec++) {
                    
                    if ((sec * hour) > min) {
                        continue MIDDLE; 
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    
                }
                
            }
            
        }
        
    } 
    
    public static void main(String[] args) {
        
        showTime();
        
    }
    
}
