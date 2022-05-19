
package Lesson15;

public class Test8 {
    
    public static void main(String[] args) {
        
        int hour = 0;
        
        
        OUTER: do {
            
            int min = 0; // минуты нужно инициализировать внутри цикла ду вайл, чтобы внутри цикла вайл они были доступны
            
            INNER: while(min < 60) {
                System.out.println(hour + ":" + min);
                min++; 
            }
            
            hour++;
   
        }
        while(hour < 24);
        
    } // вайл внутри ду вайла, обозначаем лейблами
    
}
