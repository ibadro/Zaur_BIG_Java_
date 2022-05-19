
package Lesson28;

import java.time.*;

public class Test5 {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.of(2016, Month.MARCH, 1);
        
//        Duration d = Duration.ofDays(2); // такое большое значение устанавливать
        // не имеет смысла, лучше работать с часами минутами и меньше
        
        // КОНСТРУКТОР Duration ИМЕЕТ АКСЕСС МОДЕЙФАЕР ПРАЙВАТ, ПОЭТОМУ 
        // ЗНАЧЕНИЕ ЕГО ОБЪЕКТАМ ЗАДАЕМ ТАКЖЕ ПРИ ПОМОЩИ МЕТОДА OF
        
        Duration d2 = Duration.ofHours(2);
        
        // метод чейнинг не работает в Duration
        
//        System.out.println(ld.plus(d)); // UnsupportedTemporalTypeException

        // все потому что дюрейшен работает с локал тайм и локал дейт тайм
        
        LocalTime lt = LocalTime.of(2, 15);
        System.out.println(lt.plus(d2)); // 04:15
        
        // LocalDateTime можно изменять при помощи дюрейшен и периода ОДНОВРЕМЕННО
        
        Period p = Period.of(3, 3, 3);
        
        LocalDateTime ldt = LocalDateTime.of(1111, Month.MARCH, 11, 11, 11);
        System.out.println(ldt.minus(p).plus(d2)); // 1107-12-08T13:11
 
        
    }
    
}
