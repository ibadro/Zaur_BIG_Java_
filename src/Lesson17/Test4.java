
package Lesson17;

public class Test4 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("qaz123");
        
        // reverse() - переворачивает StringBuilder
        
        System.out.println(sb1.reverse()); // 321zaq
        System.out.println(sb1); // 321zaq
        // не забываем , что сам StringBuilder sb1 МЕНЯЕТСЯ
        
        
        // replace(int start, int end, String s1) - меняет часть стрингбилдера с старт до енд на s1 
        StringBuilder sb2 = new StringBuilder("Hi everyone");
        System.out.println(sb2.replace(3, 8, "no")); // Hi noone
        // поменяли Hi everyone на Hi noone
        
        
        // capacity(); - выводит инт вместимости в массиве для наших символов
        System.out.println(sb2.capacity()); // 27
        StringBuilder sb3 = new StringBuilder(""); // создаем пустой StringBuilder sb3
        System.out.println(sb3.capacity()); // 16
        // для пустых 16 - это дефолтное значение
        
        
        StringBuilder sb11 = new StringBuilder("Hi!");
        System.out.println(sb11.substring(0, 2)); // Hi
        // 2-ой индекс не попадает в StringBuilder
        
        
    }
    
}
