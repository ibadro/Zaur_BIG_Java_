
package Java_Dlia_nashin.Lesson16;

//  Создайте клавсс, в котором создайте методй емайл. Данный метод должен принимать в инпут 1 String параметр.
//  Данный парпметр должен содеражать в себе емейлы в следующем виде ya@yahoo.com; ona@gmail.com;  т е
// полсе каждого  емайл должен стоять знак препинания ";" Ваш метод должен выводить на экран информацию о том, какой
// почтой пользуются, исходя из параметра , те оутпут должен быть следующего вида:
// yahoo
//mail
//gmail
//Продемонстрируйте метод
public class HW16Email {

    static void makeEmailPerfect(String email) {
    
        int indexDog = 0; // @
        int indexDot = 0; // .
        int indexSem = 0; // ;
        
        for(; indexSem < email.length() - 1; indexSem++) { // cause index is beginning from 0
            
            indexDog = email.indexOf('@', indexSem);
            indexDot = email.indexOf('.', indexSem);
            indexSem = email.indexOf(';', indexSem + 1); // to skip the same ; and go ahead
            System.out.println(email.substring(indexDog + 1, indexDot)); // +1 to skip @
            
        }
            
        
    }
    
    public static void main(String[] args) {
        
        makeEmailPerfect("bake@gmail.com; mike@info.ru;");
        
    }
    
}
