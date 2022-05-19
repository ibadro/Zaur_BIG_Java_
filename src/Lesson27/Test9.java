
package Lesson27;

import java.io.*;

public class Test9 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");
        try{
            
            File f = new File("test10.txt"); 
            System.out.println("file is created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("stream is created");
            
            int count = 0;
            while(true){
            
                count++;
                sb.append(fis.read());
                System.out.println("info is reading");
                
                if(count == 3) {
                    fis.close(); // закрываю стрим
                }
            
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("exception 1");  
        }
        catch(IOException e){
            System.out.println("exception 2");  
        }
        finally{
            System.out.println("it's final");
            // finally всегда срабатывает
            // в файнали пишем подчищающий код(например закрываем стримы)
        }
        
        // сработал IOException, потому что в цикле вайл мы закрываем стрим
        
//        file is created
//        stream is created
//        info is reading
//        info is reading
//        info is reading
//        exception 2
//        it's final
        
        
    }
    
}
