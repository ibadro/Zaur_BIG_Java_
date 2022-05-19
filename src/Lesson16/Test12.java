
package Lesson16;

public class Test12 {
    
    public static void main(String[] args) {
        
        String s1 = "Kak Dela?";
        String s2 = "kak dela?";
  
        System.out.println(s1.equals(s2)); // false
        // конечно же, так как они не одинаковые
        
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        // equalsIgnoreCase() не важен регистр, он возвращает тру, если строки одинаковые, не смотя на регистр 
        
    }
    
}
