
package Lesson13;

public class bHoursN {
    
    public static void main(String[] args) {
        
        int day = 1;
        String message = "rabotaet do 18/00";
        
        switch(1) { // char, byte, int, short, String только эти типы данных могут быть внутри скобок
        
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println(message);
                break;
                
            // убрали System.out.println(message) и break со всех дней кроме 5
            // тк значения одинаковые
            // в любом случае выполняются команды в теле кейсов до первого брейка
            case 6:
                System.out.println("work before 14/00");
                break;
            case 7:
                System.out.println("vihodnoj"); 
                break;
            default:
                System.out.println("takogo dnia ne bivaet");
     
        }
        
    }
    
    
}
