
package Lesson17;


public class Test7 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuffer sbf1 = new StringBuffer("hi");
        
        String s1 = new String(sb1);
        String s2 = new String(sbf1);
        
        // можно прокидывать StringBuilder и StringBuffer при создании String!!!
        
        System.out.println(s1); // hello
        System.out.println(s2); // hi
        System.out.println(sb1); // hello
        System.out.println(sbf1); // hi
        
    }
    
}
