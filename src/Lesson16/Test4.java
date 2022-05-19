
package Lesson16;

public class Test4 {
    
    public static void main(String[] args) {
        
        String s1 = new String("Hello");
        
        String s2 = s1.replace('H', 'P'); // меняем чар Н на чар Р, заметим, что чар в одинарный ковычках и присваиваем новые значения для новой переменной строки с2
        
        System.out.println(s1); // Hello
        System.out.println(s2); // Pello
        // строка с1 НИКОГДА НЕ БУДЕТ МЕНЯТЬСЯ, СТРИНГИ АНМЬЮТБЛ
        // МЕТОд string.replace('oldchar', 'newchar') возвращает новую строку и новым значением, старая при этом НЕ МЕНЯЕТСЯ
        
        String s3 = new String("Привет");
        
        String s4 = s3.replace("вет", "вивка");
        
        System.out.println(s3); // Привет
        System.out.println(s4); // Прививка
        // строка с3 НИКОГДА НЕ БУДЕТ МЕНЯТЬСЯ, СТРИНГИ АНМЬЮТБЛ
        // МЕТОд string.replace("old string", "new string") возвращает новую строку и новым значением, старая при этом НЕ МЕНЯЕТСЯ
        
        
        // метод конкат
        // просто принимает строку и складывает ее со стракой указанной в параметре, аналогия со знаком +
        
        String s5 = new String("Hi");
        String s6 = new String("Low");
        String s7 = s5.concat(s6);
        System.out.println(s7); // HiLow
        
        System.out.println(s5.concat(s6)); // HiLow
        // 2 метода вызова метода
        System.out.println(s5+s6); // HiLow
        // абсолютно тоже самое 
        
    }
    
}
