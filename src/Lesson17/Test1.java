
package Lesson17;

public class Test1 {
    
    public static void main(String[] args) {
        
        // создание объектов класса StringBuilder
        StringBuilder sb1 = new StringBuilder(); // пустой/ capacity by default = 16 chars
        StringBuilder sb2 = new StringBuilder("good day");
        StringBuilder sb3 = new StringBuilder(50); // 50 - это вместимость, capacity
        StringBuilder sb4 = new StringBuilder(sb2); // создаем стрбилдер , используя в конструкторе другой стрбилдер
        
        
        // методы класса StringBuilder
        
        // sb2.lenght() - длина
        System.out.println(sb1.length()); // 0
        System.out.println(sb2.length()); // 8
        
        // sb2.charAt(int a) - символ на определенной позиции
        System.out.println(sb2.charAt(0)); // g
        
        // sb2.indexOf(String s) - возвращает индекс символа или строки в стрингбилдере
        System.out.println(sb2.indexOf(" ")); // ищем индекс пробела - ответ 4
        System.out.println(sb2.indexOf("d", 4)); // ищем индекс d, начиная с 4 индекса - ответ 5
        
        // sb2.substring(int a, int b) - возвращает подстроку из стрингбилдера
        String s4 = sb2.substring(5, 8); // строке s4 присваиваем значение sb2 с 5 по 8 индексы
        System.out.println(s4); // day
        
        
        // sb2.subSequence(int a, int b) - работает как сабстринг, но в аутпуте у него не стринг, а CharSequence
        System.out.println(sb2.subSequence(5, 8)); // day
        
        
    }
    
}
