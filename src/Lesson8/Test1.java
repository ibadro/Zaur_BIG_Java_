
package Lesson8;

public class Test1 {
    
    public final int a = 10;
    // final non access modifiier означает, что переменная а меняться НЕ МОЖЕТ, ТО ЕСТЬ ЕЕ ЗНАЧЕНИЕ ВСЕГДА БУДЕТ 10
    // read ONLY
    
    
    
    
    public static void main(String [] args) {
    
        Test1 t1 = new Test1();
//        t1.a *= 2;
// компилятор ругается на то, что мы не можем менять переменную с нон аксесс модифаером файнал
        
        System.out.println(t1.a);
        
        
        
    }
    
}
