
package Lesson3;

public class Lesson3_4 {
    
    public static void main (String [] args) {
        
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;
        
        boolean res = a < b || ++c == d; // short circuit
        // || замыкается на true, инкрементация с не произойдет
        
//        System.out.println(res);
//        System.out.println(c);
        
        boolean res1 = ++c == d || a < b;
        // сначала инкрементация с, потом true
        
//        System.out.println(res1);
//        System.out.println(c); // 100
        
        
        // |, & операторы выполняют все условия выражения, они не замыкаются на тру или фолс, но правила сравнения те же
        
        int a1 = 10;
        int b1 = 50;
        int c1 = 99;
        int d1 = 100;
        
        
        boolean res2 = a1 < b1 | ++c1 == d; // 100
        
//        System.out.println(res2);
//        System.out.println(c1);
        
        boolean res3 = ++c1 == d1 | a1 < b1; // 100
        
        
//        System.out.println(res3);
//        System.out.println(c1); 
        
        
        
        // &, | - побитовые операторы
        
        int bit1 = 10;
        int bit2 = 5;
        
        System.out.println(bit1 & bit2); // 0 // 10 и 5 переводится в 10тичную систему
        //  1010 
        // &
        //  0101
        //  0000 - результат в двоичной системе, переводим в десятичную равно 0
        
        int bit3 = 10;
        int bit4 = 5;
               
        System.out.println(bit3 | bit4); // 15
        
        //  1010
        // |
        //  0101
        //  1111 - переводим в десятичную = 15
         
    
        // ^ - возвращает тру ТОЛЬКО ТОГДА, КОГДА ТОЛЬКО ОДНА ОПЕРАНДА РАВНА ТРУ
        
        // ^ true true true = false, так как должен быть только один тру
        // ^ false false false = false, так как должен быть только один тру
        // ^ false true true = false, так как должен быть только один тру
        // ^ false false true = true, так как должен быть только один тру!!!!
        
        boolean bol1 = false;
        boolean bol2 = false;
        boolean bol3 = false;
        boolean bol4 = true;
        
        
        System.out.println(bol1 ^ bol2 ^ bol3 ^ bol4); // true
        System.out.println(bol1 ^ bol2); // false
        
    }
    
}
