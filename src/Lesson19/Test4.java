
package Lesson19;

public class Test4 {
 
    public static void main(String[] args) {
        
        int [] arr = {0, 6, 4, 1};
        
        int summ = 0;
        
        // foreach loop, который складывает все элементы массива arr
        for(int a:arr) {
            summ += a;
        }
        System.out.println(summ);
        
        
    }
    
}
