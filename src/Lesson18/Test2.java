
package Lesson18;

public class Test2 {
    
    public static void main(String[] args) {
        
        String array1[];
        array1 = new String[3]; // длинна массива - 3
        
        // статическая инициализация массива
        array1[0] = "Hi";
        array1[1] = "Hallo";
        array1[2] = "Привет";
        
        System.out.println(array1.length); // 3
        // array1.length -- не length()
        // потому что length - это переменная массива, а не метод
        
        int [] arr, a; // это значит, что и arr, и а - это массивы, потому что [] стоит до имен этих массивов
        int b [], c; // b - массив типа инт, с- переменная типа инт
        
        int [] d, e[][];
        // d- одномерный массив, е - трехмерный, потому что первые скобки относятся и к е тоже
        
        int d2 [], e2[][];
        // d2- одномерный массив, е - ДВУХМЕРНЫЙ
        
    }
    
}
