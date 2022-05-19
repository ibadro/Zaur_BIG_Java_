
package Lesson3;

public class Lesson3_5 {
    
    public static void main (String[] args) {
    
        int a = 10;
        int b = 3;
        
        int c = ++a - b * 2;
        // ++a выполняется в первую очередь, потом b*2, а уж потом 11-6
        
        System.out.println(c); // 5
        
        
        char c1 = 'a';
        int cc = c1;
        int a1 = 10;
        
        int b1 = c1 % a1; // переведет чар с1 в числовое значение сивола а по юникоду (97)
    
        System.out.println(cc);  //97
        System.out.println(b1); // c1=97,a1=10 // 97%10=7
        
        double i4 = 1.3;
        int i5 = 5;
        
        System.out.println(i4%i5);
        
    }
    
}
