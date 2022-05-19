
package Lesson21;


public class Test5 {
    
    public void abc(int a, double b) {
        System.out.println("hi");
    }
    
    public void abc(double b, int a) {
        System.out.println("poka");
    }
    // оверлодед методы с разным порядком параметров
    
    public static void main(String[] args) {
        
        Test5 exec = new Test5();
        exec.abc(2, 0.2); // hi
        exec.abc(2.3, 0); // poka
        
    }
    
}
