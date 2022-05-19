
package Lesson13;


public class bHoursFinalExeption {
    
    public static void main(String[] args) {
        
        int a = 5;
        final int b; 
        final int c;
        final int g = 22;
        
        b = 10;
        c = 15;
        
        String message = "rabotaet do 18/00";
        
        switch(1) { 
//            case b: 
//
//            case b + c: 
// ошибка, тк, final int b и final int с не сразу имеют значения
            // в кейс это прокидывать НЕЛЬЗЯ
            
            case g: // можно, тк значение 22 сразу присвоено константе g (final int g = 22;)

            case 5:
                System.out.println(message);
                break;
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
