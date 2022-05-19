
package Lesson12;


public class EqualsTest {
    
    String name = "Petr";
    String name2 = "Ivan";
    String name3 = "Petr";
    
    int a = 14;
    int b = 15;
    
    
    public static void main(String[] args) {
        
        EqualsTest executeObject = new EqualsTest();
        
        if(executeObject.name.equals(executeObject.name2)) {
            System.out.println("1");
        } else if(executeObject.name.equals(executeObject.name3)) {
            System.out.println("2"); // true
        } else {
            System.out.println("try again");
        }
        
        
        int max = (executeObject.a > executeObject.b) ? executeObject.a : executeObject.b;
        // присваиваем a or b максу после выполнения тернарного оператора
        
        System.out.println(max);
        
    }
    
}
