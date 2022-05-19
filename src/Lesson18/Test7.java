
package Lesson18;

import java.util.Arrays;

public class Test7 {
    
    public static void main(String[] args) {
        
        int arr1 [] = {1, 2, 3, -8, 0};
        
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        // Arrays.binarySearch(тут массив, тут то, что мы ищем)
        // возвращает инт индекс найденного элемента в массиве
        // ПРИМЕНЯТЬ ТОЛЬКО НА ОТСОРТИРОВАННЫЙ МАССИВ
        
        System.out.println("***");
        int indexA = Arrays.binarySearch(arr1, -8);
        System.out.println(indexA); // 0
        
        int indexB = Arrays.binarySearch(arr1, 1);
        System.out.println(indexB); // 2
        
    }
    
}
