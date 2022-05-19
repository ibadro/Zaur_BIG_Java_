
package Lesson16;

public class Test3 {
    
    public static void main(String[] args) {
        
        String s1 = new String("abcdefg__abc");
        
        String s2 = s1.substring(9); // присвой String s2 подстроку, которая начинается с 9 индекса строки s1, то есть "abc"
        System.out.println(s2); // abc
         
        
        String s3 = new String("abcdefg__abc__abcdefg");
        
        String s4 = s3.substring(9, 12); // присвой String s4 подстроку, которая начинается с 9 индекса строки s3 и заканчивается на 12 индексе ВКЛЮЧИТЕЛЬНО, то есть "abc"
        System.out.println(s4); // abc
        
        
        // это был метод сабстринг
        // теперь трим
        
        String s5 = new String("     ggg       ");
        
        String s6 = s5.trim(); // присваиваем новой строке результат работы метода трим (метод трим создает новый стринг просто убирает лишние пробелы до и после самой строки и возвращает строку без них)
        System.out.println(s6); // ggg
        
        
    }
    
}
  