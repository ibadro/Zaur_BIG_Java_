
package Java_Dlia_nashin.L06.ПерезагрузкаМетодовИКонструкторов;

public class RunTimeErrors {
    
    public static void main (String [] args) {
    
        int a = 50 / 0;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // но компилятор пропускает, тк синтаксически написано верно
    
    }
    
}
