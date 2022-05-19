
package Lesson19;

public class Test5 {
    
    public static void main(String[] args) {
        
        String students [] = {"ivanov", "petrov", "bogdanov"};
        String exams [] = {"math", "english"};
        
        // nested foreach loop
        for(String a:students) {
        
            for(String b:exams) {
                System.out.println(a + " must pass " + b);
            }
            
        }
        
    }
    
}
