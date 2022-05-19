
package Lesson3;

public class HW3 {
    
    public static void main (String [] args) {
    
        int i1 = 5;
        int i2 = 11;
        
        double d1 = 5.5;
        double d2 = 1.3;
        
        long l = 20L;
        
        double result = 0;
        
        result = i2 / d1 + d2 % i1 - l;
        
        // сразу i2 / d1 = 2.0
        // потом d2 % i1 = 1.3
        // потом 2.0 + 1.3 - 20L = -16.7
        
        System.out.println(result); // -16.7
        
        
        int a = 5;
        int result2 = 0;
        
        result2 = a-- - --a + ++a + a++ + a;
        
        System.out.println(result2); // 15
        
        
        int b = 8;
        int result3 = 0;
        
        result3 = ++b - b++ + ++b - --b;
        
        System.out.println(result3); // 1
        
    
    }
    
}
