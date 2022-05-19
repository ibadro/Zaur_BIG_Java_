
package Lesson29;

public class Tets4_2 {
    
    static void def(TestInter t){
        System.out.println(t.ss("Privet", "poka"));
    }
    
    public static void main(String[] args) {
        
        // лямбда может иметь несколько параметров
        def((x,y)->x.length()); // 6
        
    }
    
}

interface TestInter{
    int ss(String s1, String s2);
}