
package Lesson14;


public class Test9 {
    
    public void time() { // метод вывод времени
    
        OUTER: for (int hour = 0; hour <= 23; hour++) { // лейбел аутер
            
            System.out.println("beginning of inner loop for");
            
            INNER: for (int minute = 0; minute <= 59; minute++) { // лейбл иннер
                
                System.out.println(hour + ":" + minute);
                
                if (minute == 30) {
                    break OUTER; // лейблы ставим для того, чтобы брейком иннер лупа мы могли выходить и оутер лупа
                    // по дефолту брейк внутри иннер лупа сработает на иннер луп, при помощи лейблов мы можем менять этот порядок 
                    
                }
                
            }
            
            System.out.println("the end of inner loop for");
            
        }
        
    }
    
    public static void main(String[] args) {
        
        Test9 t1 = new Test9();
        
        t1.time();
        
    }
    
}
