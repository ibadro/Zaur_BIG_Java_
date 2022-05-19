
package Lesson21;

public class Test3 {
    
    void abc(int i) {
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        
        Test3 t = new Test3();
        char c = 'a';
        t.abc(c); // 97 (это позиция 'a' по юникоду)
        // можно вместо int прокинуть char, потому что в основе char лежит int
        
        System.out.println('b' + 10); // 108
        // 'b' - 98 по юникоду
        
    }
    
}
