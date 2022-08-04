
package Java_Dlia_nashin.L16.String;

//  Создайте клавсс, в котором создайте методй емайл. Данный метод должен принимать в инпут 1 String параметр.
//  Данный парпметр должен содеражать в себе емейлы в следующем виде ya@yahoo.com; ona@gmail.com;  т е
// полсе каждого  емайл должен стоять знак препинания ";" Ваш метод должен выводить на экран информацию о том, какой
// почтой пользуются, исходя из параметра , те оутпут должен быть следующего вида:
// yahoo
//mail
//gmail
//Продемонстрируйте метод
public class  HW16Email {

    static void makeEmailPerfect(String email) {
    
        int a = 0; // позиция символа @
        int b = 0; // позиция символа .
        int c = 0; // позиция символа ;
        
        while(c < email.length()   -1) { // cause index is beginning from 0
            
            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1); // to skip the same ; and go ahead
            System.out.println(email.substring(a + 1, b)); // +1 to skip @
            
        }
            
        
    }
    
    public static void main(String[] args) {
        
        makeEmailPerfect("bake@gmail.com; mike@info.ru;");
        
    }
    
}
