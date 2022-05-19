
package Lesson20;

import java.util.Arrays;

public class Test11 {
    
    public static void main(String[] args) {
        
        // метод compare класса Arrays
        // возвращает отрицательное число , когда первый массив меньше второго
        // когда значение первого больше второго, возращается положительное число
        // когда массивы равны, метод compare возвращает 0
        
        int [] arr1 = {1, 2, 3, 4, 5}; // меньше, тк 4 идет раньше 5-и
        int [] arr2 = {1, 2, 3, 5};
        int [] arr5 = {1, 2, 3, 5};
        
        System.out.println(Arrays.compare(arr1, arr2)); // -1
        System.out.println(Arrays.compare(arr2, arr1)); // 1
        System.out.println(Arrays.compare(arr2, arr5)); // 0
        
        char [] arr3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char [] arr6 = {'p', 'r', 'i', 'v', 'e', 't', '0'};
        char [] arr4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        
        System.out.println(Arrays.compare(arr3, arr4)); // -4
        System.out.println(Arrays.compare(arr3, arr6)); // -1
        // null массив - всегда меньше нот нал
        

        
    }
    
}
