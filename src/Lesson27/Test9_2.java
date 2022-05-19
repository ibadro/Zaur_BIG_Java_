
package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9_2 {
    // не стоит просто ловить эксепшен или сруэйбл, потому что он будет перебивать
    // все эксепшены, нужно пытаться конкретизировать эксепшен
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");
        try{
            
            File f = new File("test11.txt"); 
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
        
        // сработал FileNotFoundException, потому что такого файла нет
        
//        file is created
//        exception 1
//        it's final
        

        
        
    }
    
}
