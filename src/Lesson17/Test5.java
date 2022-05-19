
package Lesson17;

public class Test5 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        // sb1 = 1234567
        // sb2 = 1234567
        
    }
    
}
