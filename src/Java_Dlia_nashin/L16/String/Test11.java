
package Java_Dlia_nashin.L16.String;

public class  Test11 {
    
    public static void main(String[] args) {
        
        String s1 = new String("ok");
        String s2 = new String("ok");
        
        System.out.println(s1 == s2); // false
        // разные объекты , поэтому фолс
        // почему они разные??? все потому что при new String всегда создается новый объект
        // класса стринг, даже если содержимое одинаковое, они не попадают в стринг пул
        
        System.out.println(s1.equals(s2)); // true
        // equals() - специальный метод строк для сравнения содержимого в строках
        // этот метод возвращает тру только тогда, когда сожержимое ДВУХ СТРОК ОДИНАКОВОЕ
        
        
        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        // почему так??
        // в первом примере создался объект hello и попал в стринг пул
        // потом s4 при создании hello, прежде, чем создать новый объект hello
        // зашла в стринг пул и нашла там готовый объект hello
        // таким образом s3 и s4 ссылаются на один и тот же объект и имеют одинаковые ссылки
        // во втором же примере содержимое строк одинаково, поэтому нам вернулся тру
        
        
        System.out.println(s1 != s4); // true
        // s1 не равен s4 ? да
        
    }
    
}
