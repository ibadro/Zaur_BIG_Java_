
package Lesson20;

import java.util.*;

public class Test8 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("hobo");
        StringBuilder sb2 = new StringBuilder("loco");
        
        // Arrays.asList()
        StringBuilder [] array = {sb1, sb2};
        List <StringBuilder> list = Arrays.asList(array);
        
        System.out.println(list); // [hobo, loco]
        
        array[0] = new StringBuilder("carl");
        
        System.out.println(list); // [carl, loco]
        
        
        
    }
    
}
