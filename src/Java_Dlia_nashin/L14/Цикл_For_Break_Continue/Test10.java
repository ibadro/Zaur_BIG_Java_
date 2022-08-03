
package Java_Dlia_nashin.L14.Цикл_For_Break_Continue;


public class Test10 {
    
    public static void main(String[] args) {
        
        OUTER: for (int i = 0; i <= 23; i++) {
            
            System.out.println("start OUTER LOOP");
            
            INNER: for (int j = 0; j <= 59; j++) {
                
                if (j == 20) {
                    continue OUTER;
                }
                
                if (j == 30) {
                    break; // break INNER; если не указываем
                }
                
                System.out.println(i + ":" + j);
                
            }
            
            System.out.println("end OUTER LOOP");
            
        }
        
    }
    
}
