
package Lesson26;

public class Test5 {
    
    static void abc(String s){System.out.println("A");} // приоритет номер 1
    static void abc(String ... s){System.out.println("B");} // приоритет номер 3
    static void abc(Object o){System.out.println("C");} // приоритет номер 2
    static void abc(String s1, String s2){System.out.println("D");} // не вызовется
    
    // конвертация возможна только в 1 этап, поэтому 
    // def(Long a) и def(Long ... a) для exec.def(5) никогда не вызовутся
    static void def(Long a){System.out.println("111");} // не вызовется
    static void def(Long ... a){System.out.println("222");} // не вызовется
    static void def(long a){System.out.println("333");} // приоритет номер 1
    static void def(Object a){System.out.println("111");} // приоритет номер 3
    static void def(Integer a){System.out.println("111");} // приоритет номер 2
    
    public static void main(String[] args) {
        
        Test5 exec = new Test5();
        exec.abc("ok");
        // на первом месте static void abc(String ... s) - потому что полное совпадение
        // ЕСЛИ ЗАКОМЕНТИТЬ 
        // на втором static void abc(Object o)  - потому что ОБЪЕКТ РОДИТЕЛЬ СТРИНГА
        // на третьем месет вараргс
        
        exec.abc("ok" , "ok"); // D
        // на первом месте static void abc(String s1, String s2) - потому что полное совпадение
        // на втором вараргс
        // остальные не вызовутся
        
        exec.abc("10", "sfg", "erg"); // B
        // вызовется только вараргс - потому что только он удовлетворяет требования 
        
        
        
        exec.def(5); // 333
        // на первом месте поглощающие типы данных(к примеру лонг по отнощению к инту)
        // на втором враппер
        // на третьем static void def(Object a) - потому что это прямой родитель
        
        
    }
    
}
