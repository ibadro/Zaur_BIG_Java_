
package Java_Dlia_nashin.L16.String;

public class Test9 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Hello World");
        String s2 = "      Uraaaaaa!!!";
        
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa", "Ура").substring(6, 10);
        
        System.out.println(s3); // Worl
        
        System.out.println(s1.substring(s1.indexOf('W'))); // World
        
    }
    
}
