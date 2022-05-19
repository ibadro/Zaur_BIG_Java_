
package Lesson19;

public class Test7_2 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("a1");
        StringBuilder sb2 = new StringBuilder("b1");
        StringBuilder sb3 = new StringBuilder("c1");
        
        StringBuilder sbArr [] = {sb1, sb2, sb3};
        
        for(StringBuilder stringB:sbArr) {
            stringB.append(" java");  
        }
        
        for(StringBuilder stringB:sbArr) {
            System.out.print(stringB + " ");  // a1 b1 c1
        }
        // при помощи foreach loop мы не можем менять сам объек StringBuilder
        // НО ЗНАЧЕНИЕ ЕГО ПРИ ПОМОЩИ МЕТОДОВ МЕНЯТЬ МОЖЕМ!!!
    }
    
}
