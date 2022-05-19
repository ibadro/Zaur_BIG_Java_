
package Lesson27;

import java.io.*;

public class Test10_3 {
    
    static StringBuilder abc(){
        
        StringBuilder a = new StringBuilder("privet");
        try{
            File f = new File("test10.txt"); 
            FileInputStream fis = new FileInputStream(f);

        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException is catched " + a);
            return a;
        }
        finally{
            a.append("!!!");
            System.out.println("it's finally block " + a);

        }
        return a;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(abc());
//        it's finally block privet!!!
//        privet!!!
        

    }
    
    
}
