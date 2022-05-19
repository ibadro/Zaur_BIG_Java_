
package Lesson21;

public class Test1 {
    
    public static void main(String[] args) {
        
        int a = 4;
        System.out.println(a < 4?  7: "hi");
        // выводи на экран 7 , если а меньше 4
        // выводи на экран hi , если а НЕ меньше 4
        
//        int b = (a < 4)?  7: "hi";
        // так писать нельзя, потому что разные типы данных
        
        int b = 5;
        int c = 5;

        int d = (b < 6)? b++:c++;
        System.out.println(b); // 6
        System.out.println(c); // 5
        // увеличится только b, потому что b < 6
        
        int t = 5;
        int u = 5;
        
        int f = (t > 6)? t++:u++;
        System.out.println(t); // 5
        System.out.println(u); // 6
        // увеличится только u, потому что t НЕ БОЛЬШЕ 6
        
    }
    
}
