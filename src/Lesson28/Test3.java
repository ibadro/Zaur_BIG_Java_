
package Lesson28;

import java.time.*;

public class Test3 {
    
    static void changeDuty(LocalDate beginning, LocalDate end, Period p){
    
        LocalDate data = beginning;
        
        while(data.isBefore(end)){
            
            System.out.println("Data is comming " + data + ", time to change duty" );
            data = data.plus(p); // добавляю период, который будем прибавлять
            
        }
    
    }
    
    public static void main(String[] args) {
        
        LocalDate beginning = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate end = LocalDate.of(2019, Month.MAY, 31);
        Period p = Period.ofMonths(2);
        Period p2 = Period.of(2, 4, 12); // год, месяц и день одновременно
        
        // у объектов класса пероид есть тоже методы плюс и минус
        
        changeDuty(beginning, end, p2);
//Data is comming 2016-09-01, time to change duty
//Data is comming 2019-01-13, time to change duty

        
    }
    
}
