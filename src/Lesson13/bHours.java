
package Lesson13;

public class bHours {
    
    public static void main(String[] args) {
        
        String workingDays = "work before 18/00";
        
        switch("chetverg") { // char, byte, int, short, String только эти типы данных могут быть внутри скобок
            
//            case null: // так сделать нельзя, тк нал - ничто, логически это неверно
            
            case "ponedelnik":

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "piatnica":
                System.out.println(workingDays);
                break;
                
            // убрали System.out.println(workingDays) и break со всех дней кроме пятницы
            // тк значения одинаковые
            // в любом случае выполняются команды в теле кейсов до первого брейка
            case "subbota":
                System.out.println("work before 14/00");
                break;
            case "voskresenie":
                System.out.println("vihodnoj"); 
                break;
            default:
                System.out.println("takogo dnia ne bivaet");
     
        }
 
        
    }
    
}
