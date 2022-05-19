
package Lesson13;

public class bHoursFinal {
    
    public static void main(String[] args) {
        
        int a = 5;
        final int b = 10; // делаем ее константой, чтобы прокинуть в кейс
        final int c = 15;
        String message = "rabotaet do 18/00";
        
        switch(1) { // char, byte, int, short, String только эти типы данных могут быть внутри скобок
        
//            case a: ошибка - НЕЛЬЗЯ ПРОКИДЫВАТЬ ОБЫЧНУЮ ПЕРЕМЕННУЮ В КЕЙС
//
            case b: // можно прокинуть в кейс, тк б - файнал (константа)

            case b + c: // можно прокинуть выражение в кейс, тк б и с - файнал (константа)

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
