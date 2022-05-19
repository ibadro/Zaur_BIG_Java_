
package Lesson3;

public class Lesson3_3 {
    
    public static void main (String [] args) {
        
        int a = 3;
        int b = 5;
        int c = 5;
        
        boolean b1 = a > b; // false
        boolean b2 = a < b; // true
        boolean b3 = b >= c; // true
        boolean b4 = b <= c; // true
        
        boolean b5 = a == b; // false
        boolean b6 = c == b; // true
        
        boolean b7 = a != c; // true
        boolean b8 = b != c; // false
        
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        
//        System.out.println(b5);
//        System.out.println(b6);
//        
//        System.out.println(b7);
//        System.out.println(b8);
        
        // AND , OR работают с boolean
        
        
        boolean t = true;
        boolean u = false;
        boolean o = true;
        
        boolean result = t && o && u; // false
        boolean result1 = t || o || u; // true
        
        System.out.println(result1);
               
        
        boolean n1 = false; // false
        boolean n2 = !n1; // true
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(!n1); // true
        
        int a12 = 10;
        int a13 = 5;
        
        boolean c12 = a12 > a13; // true
        boolean c13 = !(a12 > a13); // false
        
        System.out.println(c12);
        System.out.println(c13);
        
        
    }
    
}
