
package Java_Dlia_nashin.L15.Циклы_While_и_Do_While;

public class Test7 {
    
    public static void main(String[] args) {
        
        int money = 0;
        
        do {
        
            System.out.println("делай ставку");
            System.out.println("ты проиграл");
            money -=10;
        
        }
        while(money > 50);
        // делай ставку
        // ты проиграл
        // как минимум один раз цикл ду вайл заходит в тело цикла и стейтменты осуществляет
        
    }
    
}
