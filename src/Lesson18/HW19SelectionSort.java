
package Lesson18;

public class HW19SelectionSort {
    
    public static void selectionSort(int[] arr) {
        
        int min;
        int index;
        int swapperNumber;
    
        for (int i = 0; i < arr.length; i++) {
            
            min = arr[i]; // by defaul min = first element of array
            index = i; // by default index = first index of array
            
            for (int j = i + 1 ; j < arr.length; j++) { // j is always more i on 1 index
                
                if (arr[j] < min) { // if the next item from array is more than previous
                    
                    min = arr[j]; // min changes value on the next item
                    index = j; // index chanhes value on next index 
                    
                }
                
            }
            
            if (i != index) {
                
                swapperNumber = arr[i];
                arr[i] = min;
                arr[index] = swapperNumber;
                
            }
            
        }
 
    }
    
    public static void main(String[] args) {
        
        int arr [] = {0, 5, 9, 3};
        selectionSort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        
    }
    
}
