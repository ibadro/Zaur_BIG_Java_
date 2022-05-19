
package Lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class HW28 {
    
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
    
    void change(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d){
    
        LocalDateTime data = ldt1;
        while(data.isBefore(ldt2)){
        
            System.out.println("Работаем с: " + ldt1.format(format1));
            data = data.plus(p);
            System.out.println("До: " + data.format(format1));
            System.out.println("Отдыхаем с: " + data.format(format2));
            data = data.plus(d);
            System.out.println("До: " + data.format(format2));
        
        }
    
    }
    
    public static void main(String[] args) {
        
        HW28 execution = new HW28();
        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.JANUARY, 1, 10, 20);
        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.MARCH, 1, 10, 20);
        Period p = Period.ofMonths(1); // каждый месяц
        Duration d = Duration.ofHours(1); // каждый час

        execution.change(ldt1, ldt2, p, d);
        
    }
    
}
