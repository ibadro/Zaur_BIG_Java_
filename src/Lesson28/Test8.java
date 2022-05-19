
package Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test8 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.of(2000, Month.MARCH, 1);
        LocalTime lt = LocalTime.of(14, 20, 30, 999999990);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.MARCH, 1, 16, 40);
        
        // создание паттернов форматов
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        // Y - 2016, YY - 16, YYYY - 2016 ----- year
        // M - 3, MM - 03, MMM - мар, MMMM - марта ----month
        // w - 11, ww - 11 ------- week
        // d - 10, dd - 10 --- day
        // h - 3, hh - 03 --- hour
        // m - 20, mm- 20 --- min
        // s - 30 , ss = 30 -- seconds
        // n - 5555, nnnnn - 05555 - nanosec
        System.out.println(ldt); // 2016-03-01T16:40
        System.out.println(ldt.format(f)); // марта 01, 2016, 04:40
        
        
        // метод парсе parse("какая-то строка", формат)
        // делает из строки объект класса LocalDate по ранее созданному паттерну или по дефолту
        
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate date1 = LocalDate.parse("марта 09 2021", f2);
        
        // по ранее созданному паттерну
        System.out.println(date1); // 2021-03-09
        
        // по дефолту
        LocalDate date2 = LocalDate.parse("2021-03-09");
        // когда указывается дефолтное значение локал дейта, то формат использовать необязательно
        System.out.println(date2); // 2021-03-09
        
    }
    
}
