
package Lesson17;

public class Test3 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("hi");
        
        // insert(int a, datatype) - вставляет любой datatype в место, указанное индексом a и возвращает StringBuilder
        System.out.println(sb1.insert(1, "z")); // hzi
        System.out.println(sb1); // hzi /. на 1 индекс поставить z
        // не забываем, что sb1 при всех манипуляциях меняется, в этом и прникол StringBuilder и отличие его от Стринг
        
        System.out.println(sb1.insert(2, 444)); // hz444i
        // на индекс 2 вставляется инт 444 и получается hz444i
        
        
        // delete(int a, int b) - удаляет с а по б индексы и возвращает StringBuilder
        System.out.println(sb1.delete(1, 5)); // hi
        // удаляет из стрингбилдера сб1 hz444i всё с индекса 1 по индекс 5 и возвращает стрингбилдер hi
        
        
        // deleteCharAt(int a) - удаляет символ на позиции а и возвр стрингбилдер
        System.out.println(sb1.deleteCharAt(0)); // i
        
        
    }
    
}
