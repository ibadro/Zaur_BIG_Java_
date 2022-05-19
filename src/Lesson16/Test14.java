
package Lesson16;

public class Test14 {
    
    public static void main(String[] args) {
        
        // isBlank();
        String s1 = "hi";
        System.out.println(s1.isBlank()); // false
        
        String s2 = "  "; // пробелы
        System.out.println(s2.isBlank()); // true
        // пусто?, если да - тру, если нет - фолс
        // пробелы не считаются, если только пробелы внутри, то вернет тру
        
        // isEmpty();
        String s3 = "big";
        String s4 = "    "; // пробелы
        String s5 = "";
        System.out.println(s3.isEmpty()); // false
        System.out.println(s4.isEmpty()); // false
        System.out.println(s5.isEmpty()); // true
        // пусто?, если да - тру, если нет - фолс
        // пробелы СЧИТАЮТСЯ, если только пробелы внутри, то вернет ФОЛС
        

        
    }
    
}
