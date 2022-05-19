
package Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test7 {
    
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2000, Month.MARCH, 1);
        LocalDate ld2 = LocalDate.of(2016, Month.MARCH, 1);
        LocalTime lt = LocalTime.of(14, 20, 30, 999999990);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.MARCH, 1, 16, 40);
        
        // DateTimeFormatter
        
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE; // date format
        System.out.println(ld.format(d1)); // 2000-03-01
        // у LocalDate ld вызываем метод формат и прокидываем формат класса DateTimeFormatter d1 в этот метод
        
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME; // time format
        System.out.println(lt.format(d2)); // 14:20:30.99999999
        // у LocalTime lt вызываем метод формат и прокидываем формат класса DateTimeFormatter d2 в этот метод
        
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // datetime format
        System.out.println(ldt.format(d3)); // 2016-03-01T16:40:00
        // у LocalDateTime ldt вызываем метод формат и прокидываем формат класса DateTimeFormatter d3 в этот метод
        
        
        // LocalDateTime ldt можно форматировать как в дату , так и в время
        // 2016-03-01T16:40:00 - первоначальное значение
        System.out.println(ldt.format(d1)); // 2016-03-01
        System.out.println(ldt.format(d2)); // 16:40:00
        
        // так тоже можно
        // напрямую закидываем в параметр
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 16:40:00
        
        
        
        // методы DateTimeFormatter
        // ofLocalizedDate(FormatStyle.SHORT) - позволяет форматить LocalDate и LocalDateTime
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld2); // 2016-03-01
        System.out.println(ld2.format(shortFormat)); // 01.03.2016
        
        System.out.println(ldt); // 2016-03-01T16:40
        System.out.println(ldt.format(shortFormat)); // 01.03.2016
        

        // ofLocalizedTime(FormatStyle.SHORT) - позволяет форматить LocalTime и LocalDateTime
        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        
        System.out.println(lt); // 14:20:30.999999990
        System.out.println(lt.format(shortFormat2)); // 14:20
        
        System.out.println(ldt); // 2016-03-01T16:40
        System.out.println(ldt.format(shortFormat2)); // 16:40
        

        // ofLocalizedDateTime(FormatStyle.SHORT) - позволяет форматить ТОЛЬКО LocalDateTime
        DateTimeFormatter mediumFormat1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(ldt); // 2016-03-01T16:40
        System.out.println(ldt.format(mediumFormat1)); // 1 мар. 2016 г., 16:40:00
        
        // есть short, medium и др. варианты форматов
        
    }
    
}
