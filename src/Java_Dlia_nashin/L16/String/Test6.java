
package Java_Dlia_nashin.L16.String;

public class Test6 {
    
    public static void main(String[] args) {
        
        String s = null; // переменная s не ссылается НИ НА КАКОЙ ОБЪЕКТ КЛАССА СТРИНГ
        s += "ok";
        System.out.println(s); // nullok
        // запомнить!
        // null канкотенировало с ok, стало nullok
        
//        System.out.println(null + true);
//        System.out.println(null + false);
// так делать нельзя! ошибка  

    }
    
}
