
package Lesson28;

import java.time.*;

public class Test6_2 {
    
    public static void main(String[] args) {
        
        // получение информации из LocalTime и LocalDateTime
        
        LocalTime lt = LocalTime.of(14, 20, 30, 999999990);
        LocalDateTime ldt = LocalDateTime.of(2011, Month.MARCH, 10, 10, 20, 20, 20);
        
        
        // getNano - возвращает миллисекунды
        // getSecond - возвращает секунды
        // getMinute - возвращает минуты
        // getHour - возвращает часы
        
        
        System.out.println(lt.getNano()); // 999999990
        System.out.println(lt.getSecond()); // 30
        System.out.println(lt.getHour()); // 14
        
        System.out.println(ldt.getMinute()); // 20
        
        // эти методы можно применять на LocalTime и LocalDateTime

        
    }
    
}
