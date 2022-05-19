
package p4;

import static p1.p2.B.*; // import all of static variables from class B
import p1.*;
import p1.p2.p3.*;
import p4.p5.*;

public class D {
    
    public static void main(String[] args) {
        
        System.out.println("static variables from class B");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("***");
        
        A a1 = new A();
        a1.showDimaA();
        
        System.out.println("***");
        
        C c1 = new C();
        c1.showDimaC();
        
        System.out.println("***");
        
        E e1 = new E();
        e1.showDimaE();
        
    }
    
}
