
package Lesson27;

import java.io.*;

public class Test10 {
    
    static int abc(){
        
        int a = 5;
        try{
            File f = new File("test9.txt"); 
            FileInputStream fis = new FileInputStream(f);

        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException is catched");
            return a;
        }
        finally{
            a = 10;
            System.out.println("it's finally block");

        }
        return a;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(abc());
//        FileNotFoundException is catched
//        it's finally block
//        5
        // сработает return a из кэч


    }
    
}
