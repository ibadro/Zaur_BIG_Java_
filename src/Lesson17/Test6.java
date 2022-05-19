
package Lesson17;

public class Test6 {
 
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        
        System.out.println(sb1 == sb2); // false
        // потому что это 2 разных объекта
        
        System.out.println(sb1.equals(sb2)); // false
        // в класса StringBuilder метод equals работает как  ==
        // он работает не так , как в классе String 
        
        
    }
    
}
