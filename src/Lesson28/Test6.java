
package Lesson28;

import java.time.*;

public class Test6 {
    
    public static void main(String[] args) {
        
        // получение информации из LocalDate и LocalDateTime
        
        LocalDate ld = LocalDate.of(2000, Month.MARCH, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.MARCH, 1, 16, 40);
        // getDayOfWeek - возращается имя дня недели
        
        System.out.println(ld.getDayOfWeek()); // WEDNESDAY
        
        // getDayOfMonth - какое число месяца
        
        System.out.println(ldt.getDayOfMonth()); // 1
        
        // getDayOfYear - 1 марта - это 61 день 2016 года
        
        System.out.println(ldt.getDayOfYear()); // 61
        
        
        // getMonth - возвращает название месяца
        
        System.out.println(ldt.getMonth()); // MARCH
        
        // getMonthValue - возвращает инт которое равно месяцу в от 1 до 12
        
        System.out.println(ldt.getMonthValue()); // 3
        // март - это 3 месяц в году
        
        
        // эти методы можно применять на LocalDate и LocalDateTime
        
        
        
    }
    
}
