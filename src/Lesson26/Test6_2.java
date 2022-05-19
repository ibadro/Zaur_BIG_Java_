
package Lesson26;     
        
public class Test6_2 {
    
    // static final переменные должны быть определны сразу,НО БЛАГОДАРЯ 
    // static initializer block МОЖНО ПРИСВАИВАТЬ ЕЕ ЗНАЧЕНИЯ ВНУТРИ ЭТОГО БЛОКА
    static final int a;
    static final int b = 5;
    static int d = 5;
    
    // static initializer block всегда срабатывает первым
    static {
        System.out.println("static initializer block");    
        
        a = 10;
//        b = 3; // так делать нельзя потому что static final переменная 
                // уже инициализирована вне, на то это и константа , чтобы быть 
                // НЕИЗМЕННОЙ
                
        d = 3;// можем менять статик переменные внутри инишиалайзер блока
                // нельзя менять только файнал, ибо файнал - КОНсТАНТА
        
    }  
    
}
