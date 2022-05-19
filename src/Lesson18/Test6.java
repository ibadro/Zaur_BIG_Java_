
package Lesson18;

import java.util.Arrays; // импортируем класс Arrays с нужными методами

public class Test6 {
    
    public static void main(String[] args) {
        
        int arr1[] = {1,9,3,-8,0,5,4,1}; // самый удобный способ создания и инициализации массива
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // 1 9 3 -8 0 5 4 1
            // вывели все элементы массива
        }
        
        System.out.println("***");
        
        Arrays.sort(arr1);
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // -8 0 1 1 3 4 5 9
            // вывели все элементы массива после сортировки методом sort класса Arrays
        }
        
    }
    
}
