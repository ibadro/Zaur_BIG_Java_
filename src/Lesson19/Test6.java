
package Lesson19;

public class Test6 {
    
    public static void main(String[] args) {
        
        int arr [][] = { {1, 2, 3}, {4, 5}, {6} };
// вывод всех элементов двумерного массива arr [][]
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " "); // 1 2 3 4 5 6
//            }
//        }
        
        // вывод всех элементов двумерного массива arr [][] foreach лупом
        for(int [] arr2:arr) {
            for(int a:arr2) {
                System.out.print(a + " "); // 1 2 3 4 5 6
            }
        }
        
    }
    
}
