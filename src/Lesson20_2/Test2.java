
package Lesson20_2;

import java.util.*;

public class Test2 {
    
    public static void main(String[] args) {
        
        ArrayList <String> arrList1 = new ArrayList <>();
        arrList1.add("23");
        arrList1.add("43");
        arrList1.add("33");
        
        // метод t0String() - делает из ArrayList массив типа Object
        
        Object [] arr1 = arrList1.toArray();
        System.out.println(arrList1); // [23, 43, 33]
        System.out.println(arr1); // [Ljava.lang.Object;@7d417077
        
        // метод t0String(datatype) - делает из ArrayList массив типа указанного в t0String(datatype)
        System.out.println("***");
        String [] s1 = arrList1.toArray(new String [5]);
        
        for(String ss:s1) {
            System.out.print(ss + " "); // 23 43 33 null null
            // null , null - потому что при создании мы указали длинну массива 5, а элемента все 3, таким образом лишние 2 элемента стали дефолтами
        }
        
        
    }
    
}
