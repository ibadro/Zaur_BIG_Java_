
package Lesson18;

public class Test11 {
    
    public static void main(String[] args) {
        
        char [] arr = {'p', 'r', 'i', 'v', 'e', 't'};
        StringBuilder sb = new StringBuilder("Hello world");
        
        sb.insert(2, arr, 1, 3);
        System.out.println(sb); // Herivllo world
        // почему получилось так?
        // вставляем на второй индекс стрингбилдера сб срез массив арр с 1 по 3 индекса
        
    }
    
}
