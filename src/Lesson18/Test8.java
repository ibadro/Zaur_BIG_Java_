
package Lesson18;

public class Test8 {
    
    public static void main(String[] args) {
        
        int arr1 [] = {1, 2, 3, -8, 0};
        int arr2 [] = {1, 2, 3, -8, 0};
        
        System.out.println(arr1 == arr2); // false
        // ссылаются на разные объекты
        
        int arr3 [] = arr2;
        
        System.out.println(arr2 == arr3); // true
        // ссылаются на 1 объект
        
        System.out.println(arr1.equals(arr2)); // false
        // ссылаются на разные объекты // как у StringBuilder
        
        System.out.println(arr2.equals(arr3)); // true
        // ссылаются на 1 объект // как у StringBuilder
        
        
        // 1, 2, 3, -8, 0
        arr1[1] = 0;
        // 1, 0, 3, -8, 0
        
        arr1[5-3] = 0;
        // 1, 0, 0, -8, 0
        
//        arr1[arr1.length] = 10; // компилятор это пропустит но!!!
//        ArrayIndexOutOfBoundsException
//        потому что arr1.length - 5
//        а arr1[5] - не существует, потому что последний индекс номер 4
        
    }
    
}
