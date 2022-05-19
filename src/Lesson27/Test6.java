
package Lesson27;

import java.io.*;

public class Test6 {
    
    public static void main(String[] args) {
        
        try{
            int [] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is catched");
            System.out.println(e.getMessage()); // обращаюсь с объекту класса ArrayIndexOutOfBoundsException 
            e.printStackTrace(); // стэк трейс
//ArrayIndexOutOfBoundsException is catched
//Index 5 out of bounds for length 3
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//at Lesson27.Test6.main(Test6.java:12)

            
        }
        
        
    }
    
}
