
package Lesson28;

import java.time.*;

public class Test4 {
    
    public static void main(String[] args) {
        
        // КОНСТРУКТОР ПЕРИОДА ИМЕЕТ АКСЕСС МОДЕЙФАЕР ПРАЙВАТ, ПОЭТОМУ 
        // ЗНАЧЕНИЕ ЕГО ОБЪЕКТАМ ЗАДАЕМ ТАКЖЕ ПРИ ПОМОЩИ МЕТОДА OF
        
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        Period p = Period.ofDays(10);
        // Period.ofDays(10.ofMonths(1); // так не работает, учитывается только
        // последний ofMonths(1)
        System.out.println(ld.plus(p)); // 2016-09-11
        
        Period p2 = Period.ofDays(10).ofMonths(1);
        System.out.println(ld.plus(p2)); // 2016-10-01
        // сработало только ofMonths(1)
        // метод чейнинг не работает в периоде
        
    }
    
}
