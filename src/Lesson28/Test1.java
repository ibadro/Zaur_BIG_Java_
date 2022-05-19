
package Lesson28;

import java.time.*;

public class Test1 {
    
    public static void main(String[] args) {
        // работа с LocalDate, LocalTime, LocalDateTime 
        
        System.out.println(LocalDate.now()); // 2021-03-17
        System.out.println(LocalTime.now()); // 14:30:10.119392500
        System.out.println(LocalDateTime.now()); // 2021-03-17T14:30:25.339782900
        
//        LocalDate ld = new LocalDate(2012, 12, 14);
// Создавать объекты классов LocalDate, LocalTime, LocalDateTime нельзя,
// используя кострукторы, потому что их конструкторы имеют аксесс модефаеры private


        // как же Создавать объекты классов LocalDate, LocalTime, LocalDateTime?
        // LocalDate
        // можно вместо месяца использовать как Month.MARCH
        // так и инт значение 
        LocalDate ld = LocalDate.of(2014, 5, 15);
        System.out.println(ld); // 2014-05-15
        LocalDate ld2 = LocalDate.of(2015, Month.JULY, 29);
        // DateTimeException, если указываем несуществующую дату
        System.out.println(ld2); // 2015-07-29
        
        // plusDays, plusWeeks, plusMonth, plusYears
        
        ld2.plusDays(1);
        System.out.println(ld2); // 2015-07-29
        // из-за того, что этот все объекты классов LocalDate, LocalTime, LocalDateTime
        // immutable, объект ld2 не увеличится на 1 день!!!!!!!!!!!!!!!!
        
        // но plusDays и прочие методы можно использовать для обновления значения этого обхекта
        // или присвоения другого объекта значения этого + нужное кол-во дней, месяцев и тд
        
        LocalDate ld3 = ld2.plusDays(1);
        System.out.println(ld3); // 2015-07-30
        // как мы видим значение увеличилось на 1 день
        
        ld3 = ld3.plusMonths(2);
        System.out.println(ld3); // 2015-09-30
        // как мы видим перезаписывать значение можно
        
        // а вот просто значение менять нельзя
        
        LocalDate ld4 = ld3.plusWeeks(3);
        System.out.println(ld4); // 2015-10-21
        
        ld4 = ld4.plusYears(100);
        System.out.println(ld4); // 2115-10-21
        
        // такая же логика с методами minusDays, minusWeeks, minusMonth, minusYears
        
        LocalDate ld5 = ld4.minusDays(2).minusWeeks(3).minusMonths(4).minusYears(100);
        System.out.println(ld5); // 2015-05-28
        
        // такие же методы есть у LocalTime
        // plus / minus hours, minutes ....
        
        
        // LocalTime имеет оверлодед метод of()
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1); // 15:30
        LocalTime lt2 = LocalTime.of(15, 30, 45);
        System.out.println(lt2); // 15:30:45
        LocalTime lt3 = LocalTime.of(15, 30, 45, 999999999);
        System.out.println(lt3); // 15:30:45.999999999
        
        LocalTime lt4 = lt3.minusHours(1).minusMinutes(1).minusNanos(111111111).minusSeconds(5);
        System.out.println(lt4); // 14:29:40.888888888
        
        lt4 = lt4.plusHours(1).plusMinutes(1).plusNanos(111111111).plusSeconds(5);
        System.out.println(lt4); // 15:30:45.999999999
        
        
        // все эти методы plus / minus можно использовать у LocalDateTime
        
        // LocalDateTime // можно вместо месяца использовать как Month.MARCH
        // так и инт значение 
        LocalDateTime ldt1 = LocalDateTime.of(2011, Month.MARCH, 10, 17, 25);
        System.out.println(ldt1); // 2011-03-10T17:25
        LocalDateTime ldt2 = LocalDateTime.of(2011, 5, 10, 17, 25, 18);
        System.out.println(ldt2); // 2011-05-10T17:25:18
        LocalDateTime ldt3 = LocalDateTime.of(2011, 5, 10, 17, 25, 18, 999999999);
        System.out.println(ldt3); // 2011-05-10T17:25:18.999999999
        
        // просто в LocalDateTime.of прокидываем переменные типа LocalDate и LocalTime
        LocalDateTime ldt4 = LocalDateTime.of(ld2, lt3);
        System.out.println(ldt4); // 2015-07-29T15:30:45.999999999
        
        // ВСЕ ЭТИ ОБЪЕКТЫ IMMUTABLE!!!
        
    }
    
}
