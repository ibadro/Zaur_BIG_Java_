
package Lesson16;

public class Test9 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Hello World");
        String s2 = "      Uraaaaaa!!!";
        
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa", "Ура").substring(6, 11);
        
        System.out.println(s3); // World
        
        System.out.println(s1.substring(s1.indexOf('W'))); // World
        
    }
    
}
