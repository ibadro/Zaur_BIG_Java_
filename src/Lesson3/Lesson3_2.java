
package Lesson3;

public class Lesson3_2 {
    
    public static void main (String[] args) {
        
        int c = 3;
        c += 5; // c = c + 5; // сразу прибавь потом присвой
        
        System.out.println(c); // 8
        
        int c1 = 3;
        c1 *= 5; // c = c * 5; // сразу умножь потом присвой
        
        System.out.println(c1); // 15
        
        double c2 = 3;
        c2 /= 5; // c = c / 5; // сразу раздели потом присвой
        
        System.out.println(c2); // 0.6
        
        int c3 = 3;
        c3 -= 5; // c = c / 5; // сразу отними потом присвой
        
        System.out.println(c3); // -2
        
        int a1 = 12;
        int b2 = 14;
        int e2 = -34;
        
        a1 = b2 = e2 = 18; // все значения сверху перезапишутся на 18
        // можно присваивать только одинакового типа данных (только если новый тип больше присваимого long может присвоить int, но не наоборот)
        
        System.out.println(a1);
        System.out.println(b2);
        System.out.println(e2);
        
        
        int h = 100;
        long d = h; 
    }
    
}
