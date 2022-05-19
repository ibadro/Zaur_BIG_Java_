
package Lesson16;

public class Test15 {
    
    public static void main(String[] args) {
        
        // strip(); - почти как трим, только лучше
        String s1 = "   privet     ";
        
        System.out.println(s1.trim()); // privet - лишние пробелы убрались
        
        System.out.println(s1.strip()); // privet - действие такое же как у метода трим()
        
        System.out.println(s1.stripLeading()); // "privet    " - пробелы после привета сохранились
        
        System.out.println(s1.stripTrailing()); // "   privet" - пробелы перед привета сохранились
        
        
        String s2 = "poka";
        
        String s3 = s2.strip(); // аналогия с тримом
        
        System.out.println(s2 == s3); // true
        // ссылаются на один и тот же объект
       
        
    }
    
}
