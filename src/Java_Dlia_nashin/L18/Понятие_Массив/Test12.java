
package Java_Dlia_nashin.L18.Понятие_Массив;

public class Test12 {
    
    static void x2Count(int [][] arr) {
    
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                
                System.out.print(arr[i][j]);
                
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        x2Count(arr);
        
        
    }
    
}
