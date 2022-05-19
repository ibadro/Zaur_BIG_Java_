
package Lesson27;

import java.io.*;

public class Test8 {
    
    public static void main(String[] args) {
        
        try{
            File f = new File("test9.txt"); 
            FileInputStream fis = new FileInputStream(f);
        }
        catch(NullPointerException e){ // это ребенок RuntimeException-а
            System.out.println("exception 2 is catched"); 
        }
        catch(FileNotFoundException e){ // это ребенок IOException-а
            System.out.println("exception 1 is catched");
        }
        catch(IOException e){ // это  родитель NullPointerException-а
            System.out.println("exception 3 is catched");
        }
        catch(RuntimeException e){ // это родитель NullPointerException-а и ребенок Exception
            System.out.println("exception 4 is catched");
        }
        catch(Exception e){ // это ребенок Throwable-а
            System.out.println("exception 5 is catched");
        }
        catch(Throwable e){ // это прородитель всех Exception-ов 
            System.out.println("exception 6 is catched");
        }
        
    }
    
}
