
package Lesson27;

import java.io.*;

public class Test11_3 {
    
    static FileInputStream fis1, fis2;
    
    static void abc(){
    
        try{
            
            fis1 = new FileInputStream("test9.txt");
            try{
                fis2 = new FileInputStream("test10.txt"); // на один файл 2 потока
            }
            catch(FileNotFoundException e) {
                System.out.println("file test10 is not found");
            }
            
        }
        catch(FileNotFoundException e) {
            System.out.println("file test9 is not found");
        }
        finally{ // внутри файнали может располагаться трай кэч
            
            System.out.println("outer finally block");
            try{
            
                fis1.close(); // тк test9.txt не существует
                // метод клоуз будет пытаться закрыть нал, это приведет
                // к NullPointerException
                fis2.close();
                // закрываем потоки
                
            }
            catch(IOException e){
                System.out.println("exception is found in finally vlock");
            }
            
        }
        
        // в нестед трай кэч
    }
    
    public static void main(String[] args) { // тут можно не указывать throws Exception
        // потому что в методе abc эксепшены УЖЕ ОБРАБОТАНЫ, НЕТ НАДОБНОСТИ ДЕЛАТЬ ЭТО ЕЩЕ РАЗ
        
        abc();
        
//            file test9 is not found
//            outer finally block
//            Exception in thread "main" java.lang.NullPointerException
//            at Lesson27.Test11_3.abc(Test11_3.java:31)
//            at Lesson27.Test11_3.main(Test11_3.java:50)
        
    }
    
    // ВНУТРИ КАЖДОГО ТРАЙ КЭЧ ФАЙНАЛИ МОЖЕТ БЫТЬ СКОЛЬКО-УГОДНО ТРАЙ КЭЧ ФАЙНАЛИ БЛОКОВ
    
}
