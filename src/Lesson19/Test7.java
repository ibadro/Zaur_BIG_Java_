
package Lesson19;

public class Test7 {
 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};
    
        for(int a:arr) {
            a = 3;  
        }
        
        for(int b:arr) {
            System.out.print(b + " "); // 1 2 3 4
        }
        // при помощи foreach loop мы НЕ можем менять примитивные типы данных
        
        System.out.println("");
        String s1 [] = {"a", "b", "c"};
        
        for(String s:s1) {
            s = "ok";  
        }
        
        for(String s:s1) {
            System.out.print(s + " "); 
        }
        // при помощи foreach loop мы НЕ можем менять String
        
        System.out.println("");
        
        StringBuilder sb1 = new StringBuilder("a1");
        StringBuilder sb2 = new StringBuilder("b1");
        StringBuilder sb3 = new StringBuilder("c1");
        
        StringBuilder sbArr [] = {sb1, sb2, sb3};
        
        for(StringBuilder stringB:sbArr) {
            stringB = new StringBuilder("hello");  
        }
        
        for(StringBuilder stringB:sbArr) {
            System.out.print(stringB + " ");  // a1 b1 c1
        }
        // при помощи foreach loop мы НЕ можем менять StringBuilder
        
        
        
    }
    
}

