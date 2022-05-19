
package Lesson3;

public class Lesson3 {
    
    public static void main (String [] ards) {
        
        int a = 5;
        int b = a; // b теперь равно а, то есть 5
        int c = b * 2; // 10
        
        System.out.println(b);
        System.out.println(c);
        
        int x1 = 1, y1 = 2, z1 = 3; // можно записывать и в одну строку
        
        // Арифметические операторы - + - * / ++ -- %        
        
        int a1 = 5;
        int b1 = 10;
        int c1 = a1 + b1;
        
        System.out.println(a1+b1);
        System.out.println(c1);
        
        int a2 = 3;
        int b2 = 11;
        int c2 = b2 / a2;
        
        System.out.println(b2 / a2); // 2 тк вся дробная часть отсекается из-за того, что тип данных int
        System.out.println(c2);
        
        double a3 = 4;
        double b3 = 10;
        double c3 = b3 / a3;
        
        System.out.println(c3); // 2.5 тк тип данных double
        
        
        int celaya = b2 / a2;
        int ostatok = b2 % a2; // остаток от деления
        
        System.out.println(celaya); // 3
        System.out.println(ostatok); // 2
        
        double b5 = 5.5, a5 = 3.5;
        double celaya1 = b5 / a5;
        double ostatok1 = b5 % a5; // остаток от деления для дробных double
         
        System.out.println(celaya1); // 1.5714285714285714
        System.out.println(ostatok1); // 2.0
        
        int x = 5;
        int y = 3;
        int z = x - y++;
        
        System.out.println(z); // 2 тк сразу 5 - 3, а уж потом только y++
        System.out.println(y); // 4 что и следовало ожидать, сразу после выполнение x - y, произошла инкрементация y
        
        int x2 = 5;
        int y2 = 3;
        int z2 = x2 - ++y2;
        
        System.out.println(z2); // 1 перед тем как отнять от x y . y инкрементирует
        System.out.println(y2); // 4
        
    }   
    
}
