
package Lesson16;

public class Test8 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Hi*2");
        
        boolean b1 = s1.contains("*2");
        // переменной b1 присваиваем тру или фолс результата метода контейнс, который проверяет , есть ли такая подстрока в строке s1
        
        System.out.println(b1); // true
        System.out.println(s1.contains("*2")); // true
        // 2 вида вызова
        
    }
    
}
