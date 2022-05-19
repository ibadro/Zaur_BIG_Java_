
package Lesson18;

public class HW19ShowArray {
    
    static void showArray(String arr[][]) {
    
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print("{ ");
            for (int j = 0; j < arr[i].length; j++) {
                
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }
                
            }
            
            if (i != arr.length - 1) {
                System.out.print(" }, ");
            } else {
                System.out.print(" }");
            }
            
        }
        System.out.println(" }");
        
    }
    
    public static void main(String[] args) {
        
        String arr [][] = {{"apple", "banana"}, {"hi", "world"}, {"car"}}; 
        showArray(arr);
        
    }
    
}
