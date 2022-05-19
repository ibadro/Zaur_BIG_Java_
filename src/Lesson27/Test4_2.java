
package Lesson27;

import java.io.*;

public class Test4_2 {
    
    public static void main(String[] args) {
        
        File f = new File("test10.txt"); // location - C:\Users\Dima\Documents\NetBeansProjects
        
        try{ // если пишем трай, то пиши кэч или файнали, или кэч и файнали
                
            FileInputStream fis = new FileInputStream(f);
            System.out.println("have a good day");
            
        }
        catch(FileNotFoundException e){ 
            System.out.println("exception was catched");
        } 
        // можно добавлять несколько кэчей
        // хоть NullPointerException тут никогда не сработает
        // данный пример носить иллюстративный характер
        catch(NullPointerException e){ 
            System.out.println("exception was catched");
        } 
        // finally блок можно добавлять, а можно и пропускать
        finally{ 
            System.out.println("it's finally block");
        }
        
        
        
    }
 
}
