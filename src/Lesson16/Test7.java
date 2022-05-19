
package Lesson16;

public class Test7 {
    
    public static void main(String[] args) {
        
        String s1 = new String("PRivet");
        
        String s2 = s1.toLowerCase();
        
        System.out.println(s1); // PRivet
        System.out.println(s2); // privet
        System.out.println(s1.toLowerCase()); // privet
        // toLowerCase возвращает строку с маленькими буквами
        
        
        String s3 = s1.toUpperCase();
        System.out.println(s1); // PRivet
        System.out.println(s3); // PRIVET
        System.out.println(s1.toUpperCase()); // PRIVET
        // toUpperCase возвращает строку с большими буквами
        
        // оригинальная же строка не меняется, запомни
        
        
    }
    
}
