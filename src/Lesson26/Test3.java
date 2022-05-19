
package Lesson26;

public class Test3 {
    
    public static void main(String[] args) {
        
        // Методы парс позволяют из Стринга получить нужный тип данных
        
        // Integer.parseInt(String s1)
        
        String s1 = "50"; // если установим s1 = " 50" - мы получим ошибку
        int i1 = Integer.parseInt(s1);
        System.out.println(i1); // 50
        
        
        // Boolean.parseBoolean(String s1)
        String s2 = "rrr";
        String s3 = "true";
        String s4 = "true11";
        String s5 = "11true";
        
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1); // false
        boolean b2 = Boolean.parseBoolean(s3);
        System.out.println(b2); // true
        boolean b3 = Boolean.parseBoolean(s3);
        System.out.println(b3); // true
        boolean b4 = Boolean.parseBoolean(s4);
        System.out.println(b4); // true
        // все строки начинающиеся на true, будут тру
        
        // Double.parseDouble(String s1)
        
        String s6 = "3.14";
        double d1 = Double.parseDouble(s6);
        System.out.println(d1); // 3.14
        
        
        
        
    }
    
}
