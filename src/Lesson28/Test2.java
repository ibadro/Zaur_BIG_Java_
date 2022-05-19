
package Lesson28;

import java.time.*;

public class Test2 {
    
    public static void main(String[] args) {
        
        // isBefore // isAfter
        LocalDate ld1 = LocalDate.of(2014, Month.MARCH, 11);
        LocalDate ld2 = LocalDate.of(2014, Month.MARCH, 10);
        System.out.println(ld1.isAfter(ld2)); // true
        // 2014, Month.MARCH, 11 находится после 2014, Month.MARCH, 10 - ответ да
        
        System.out.println(ld1.isBefore(ld2)); // false
        // 2014, Month.MARCH, 11 находится до 2014, Month.MARCH, 10 - ответ да
        
        // такая же логика у локалдейт, у локалтай и у локалДейттайм
        
    }
    
}
