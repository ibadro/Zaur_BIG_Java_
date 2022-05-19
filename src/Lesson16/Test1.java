
package Lesson16;

public class Test1 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Hi");
        int a1 = s1.length(); // длину строки присвоили переменной
        System.out.println(a1); // 2
        System.out.println(s1.length()); // можно и так вызвать метод length
        
        
        
        String s2 = new String("Hello");
        char a2 = s2.charAt(0); // H
        System.out.println(a2); // H
        // метод charAt возвращает char, который равен индексу строки, который указан в аргументе метода
        // его можно присвоить переменной типа данных чар
        System.out.println(s2.charAt(0)); // H
        // можно и так вызвать метод чарЭт
        
        
        
        String s3 = new String("привет, как дела д привет?");
        int a3 = s3.indexOf("д"); // узнаем индекс конкретного чара
        System.out.println(a3); // 12
        System.out.println(s3.indexOf("д")); // 12
        // 2 разных способа вызова метода, по аналогии с предыдущими
        
        int a31 = s3.indexOf("привет"); // индекс целой строки
        System.out.println(a31); // 0
        System.out.println(s3.indexOf("привет")); // 0
        // 2 разных способа вызова метода, по аналогии с предыдущими
        
        int a32 = s3.indexOf("z"); // такого чар не существует в нашей строке, следорвательно в инт а 32 присвоится -1
        System.out.println(a32); // -1
        System.out.println(s3.indexOf("z")); // -1
        // 2 разных способа вызова метода, по аналогии с предыдущими
        
        
        // это были 2 вида индексОф - строка и чар, именно первые вхождения, сейчас будут приведены примеры того, если в строке несколько одинаковых строк или чаров и нам нужен индекс не первого вхождения, а начиная ОТ КАКОГО-ТО 
        
        
        int a33 = s3.indexOf("д", 13); // присваиваем переменной а33 значение индекса чара д после 13 индекса
        System.out.println(a33); // 17
        System.out.println(s3.indexOf("д", 13)); // 17
        
        int a34 = s3.indexOf("привет", 1); // присваиваем переменной а34 значение индекса строки привет после 1 индекса, тк первый привет находится на индексе 1
        System.out.println(a34); // 19
        System.out.println(s3.indexOf("привет", 1)); // 19
        
        
    }
    
}
