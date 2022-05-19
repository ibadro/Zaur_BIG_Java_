
package Lesson9;

public class HW9_2 {
    
    String name = "Karl";
    
    public static void abc() {
    
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    
    }
    
    public static void main(String[] args) {
        
        HW9_2 obj1 = new HW9_2();
        abc();
        // create 2 object, but it will be delete after execution
        abc();
        // create 2 object, but it will be delete after execution
        String s1 = new String("Mark");
        abc();
        // create 2 object, but it will be delete after execution
        
        System.out.println(obj1.name);
        System.out.println(s1);
        
        // there were created 8 objects, but only 2 stayed alive
    }
    
}
