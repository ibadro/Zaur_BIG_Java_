
package Lesson25;

public class Test5 {
    
    public static void main(String[] args) {
        
        // primmitive type casting
        
        // byte to short, int, long, float, double
        byte b = 10;
        int a = b;
        
        // short to int, long, float, double
        short sh = 5;
        double db = sh;
        
        // char to int, long, float, double
        char ch = 'b';
        float fl = ch;
        
        // int to long, float, double
        int i = 44;
        long lg = i;
        
        // long to float, double
        long lg2 = 555;
        double db2 = lg2;
        
        // float to double
        float fl2 = 4.3F;
        double db3 = fl2;
        
        
        // numeric promotion
        int i12 = 5;
        long l12 = 10;
        System.out.println(i12+ l12); // 15
        // сначала меньший тип инт конвертируется в больший тип лонг, потом сумирует
        
//        int i13 = i12 * l12;
// КОМПИЛЯТОР НЕ ПОЗВОЛЯЕТ ЭТО ДЕЛАТЬ, ПОТОМУ ЧТО ЛОНГ НЕ МОЖЕТ КОНВЕРТИРОВАТЬСЯ В ИНТ
// ТОЛЬКО НАОБОРОТ
        int i14 = 5;
        i14 *= l12; // а вот так можно
        // сначала умножение, потом приравнивание
        
        // еще один способ объявления переменных
        
        int g1, f = 3, bb, dd = f + 2;
        // почему так dd = f можно писать?
        // компилятор на этом моменте уже знает , чему равна f

        
    }
    
}
