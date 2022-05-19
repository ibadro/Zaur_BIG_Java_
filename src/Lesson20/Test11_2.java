
package Lesson20;

import java.util.Arrays;

public class Test11_2 {
    
    public static void main(String[] args) {
        
        // метод mismatch класса Arrays
        // находит индекс элемента первого расхождение в массива
        // или -1, если массивы одинаковые
        
        int [] arr1 = {1, 2, 3, 4, 5}; // меньше, тк 4 идет раньше 5-и
        int [] arr2 = {1, 2, 3, 5};
        int [] arr5 = {1, 2, 3, 5};     
        
        char [] arr3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char [] arr6 = {'p', 'r', 'i', 'v', 'e', 't', '0'};
        char [] arr4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
 
        System.out.println(Arrays.mismatch(arr2, arr5)); // -1
        System.out.println(Arrays.mismatch(arr3, arr6)); // 6
        // 6 индекс - '0'
        
    }
    
}
