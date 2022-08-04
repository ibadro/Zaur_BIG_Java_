
package Java_Dlia_nashin.L18.Понятие_Массив;

public class HW19SelectionSort {
    
    public static void selectionSort(int[] arr) {
        
        int min;
        int index;
        int swapperNumber;
    
        for (int i = 0; i < arr.length; i++) {
            
            min = arr[i]; // по умолчанию in = первый элемент массива
            index = i; // по умолчанию index = первый индекс массива
            
            for (int j = i + 1 ; j < arr.length; j++) { // j is always more i on 1 index
                
                if (arr[j] < min) { // если следующий элемент массива больше предыдущего
                    
                    min = arr[j]; // min изменяет значение следующего элемента
                    index = j; // индекс изменяет значение на следующем индексе
                    
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
