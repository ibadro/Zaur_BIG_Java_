
package Java_Dlia_nashin.L14.Цикл_For_Break_Continue;

public class Test4 {
    
    public static void main(String[] args) {
 
        
        for (int i = 1; i < 11; i++, abc(10)) { // прокидываем метод в цикл в АПДЕЙТ СТЕЙТМЕНТЕ
            // также можно прокидывать метод abc(10) прямо в теле цикла, вот так:
//            abc(10);
            System.out.println("*" + i);
        }
 
        
    }
    
    static void abc(int n) { // СТАТИКОМ ДЕЛАЕМ, ЧТОБЫ НЕ СОЗДАВАТЬ ОБЪЕКТ
            System.out.println(n);
    }
    
}
