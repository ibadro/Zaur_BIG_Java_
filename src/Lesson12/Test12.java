
package Lesson12;

public class Test12 {
    
    void abc() {
    
        String str;
        int a = 10;
        
        if(a >= 10) {
            str= "Privet";
        } else if(a < 10) {
            str= "Poka";
        } else {
            str = "shalom";
        }
        
        System.out.println(str); // ничего не выдаст, тк, стр меняется ЛОКАЛЬНО
            
    }
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        int max = (a > b) ? a : b; // тернарный оператор
        // где (a > b) - условие, a - тру, б - фолс
        // а больше б ? если да, выводим а, если нет, выводим б
        
        System.out.println(max);
        
    }
    
}
