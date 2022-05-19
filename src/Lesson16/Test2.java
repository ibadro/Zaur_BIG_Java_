
package Lesson16;

public class Test2 {
    
    public static void main(String[] args) {
        
        String s1 = new String("abcdefg");
        boolean b1 = s1.startsWith("abc"); // переменной б1 присваиваем тру или фолс(Начинается ли строка с "abc"), если да, то возвращается тру, если нет - false
        System.out.println(b1); // true
        System.out.println(s1.startsWith("abc")); // true
        // 2 разных метода использования метода startsWith()
        
        
        String s2 = new String("abcdefg__abc"); // 
        boolean b2 = s2.startsWith("abc", 9); // возвращаем тру(Строка начинается с abc, начиная с 9 индекса?), да, поэтому тру
        System.out.println(b2); // true
        
        boolean b3 = s2.startsWith("abc", 5); // false , тк начиная с 5 индекса идет fg__abc, чтобы получить тру, нам нужен 9 индекс
        System.out.println(b3); // false
        System.out.println(s2.startsWith("abc", 9)); //   true
        
        
        // это был метода стратсВиз() , такая же логика с ендсВиз
        
        boolean b4 = s1.endsWith("abc"); // s1 имеет значение "abcdefg"
        System.out.println(b4); // false, потому что s1 имеет значение abcdefg и оно не заканчивается на abc
        
        boolean b5 = s2.endsWith("abc");
        System.out.println(b5); // true, тк s2 имеет значение abcdefg__abc, и оно заканчивается на abc
        System.out.println(s2.endsWith("abc")); // true
        
        
        
    }
    
}
