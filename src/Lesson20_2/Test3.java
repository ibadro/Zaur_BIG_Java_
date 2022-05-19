
package Lesson20_2;

import java.util.*;

public class Test3 {
    
    public static void main(String[] args) {
        
        // СТАТИЧЕСКИЕ МЕТОДЫ List.of() and List.copyOf()
        ArrayList <String> arrList1 = new ArrayList <>();
        arrList1.add("23");
        arrList1.add("43");
        arrList1.add("33");
        
        // создание листа определенного типа данных при помощи метода List.of()
        // этот лист мы не сможем изменять
        List <String> list = List.of("odin", "dva", "tri");
        System.out.println(list);
        
//        list.add("fff"); // UnsupportedOperationException

        
        List <String> list2 = List.copyOf(arrList1);
        System.out.println(list2); // [23, 43, 33]
//        list2.add("fff"); // UnsupportedOperationException
        
        // ПРИ СОЗДАНИИ ЭТИ ЛИСТЫ НЕ ДОЛЖНЫ СОДЕРЖАТЬ НАЛ, А ТАКЖЕ ЭТИ ЛИСТЫ НЕВОЗМОЖНО БУДЕТ МЕНЯТЬ В ДАЛЬНЕЙШЕМ

        
    }
    
}
