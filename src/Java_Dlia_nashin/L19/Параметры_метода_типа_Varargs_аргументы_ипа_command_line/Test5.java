
package Java_Dlia_nashin.L19.Параметры_метода_типа_Varargs_аргументы_ипа_command_line;

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
