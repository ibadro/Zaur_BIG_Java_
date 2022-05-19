
package Lesson27;

import java.io.*;

public class Test11 {
    
    void abc() throws FileNotFoundException{
       
        try{
            File f = new File("test0.txt"); 
            FileInputStream fis = new FileInputStream(f);

        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException is catched ");
            throw e; // брось эксепшен
        }
        finally{
            System.out.println("it's finally block ");

        }
    
    }
    
    void meth() throws FileNotFoundException{ // в сигнатуре метода нужно указывать
                            // тк abc() может выбросить FileNotFoundException
                            // если в сигнатуре не хочется это указывать, то
                            // можно поместить abc(); в трай кэч
        abc();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
                            // такая же логика, можно указывать в 
                            // сигнатуре throws FileNotFoundException
                            // а можно просто метод поместить в трай кэч
        
        Test11 exec = new Test11();
        exec.meth();
        
        
        // эксепшен вылетает, хоть и перехватывается в кэче за счёт команды throw e;
        // в кэч блоке метода абс()
        
//FileNotFoundException is catched 
//it's finally block 
//Exception in thread "main" java.io.FileNotFoundException: test0.txt (Не удается найти указанный файл)
//	at java.base/java.io.FileInputStream.open0(Native Method)
//	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//	at Lesson27.Test11.abc(Test11.java:12)
//	at Lesson27.Test11.meth(Test11.java:30)
//	at Lesson27.Test11.main(Test11.java:36)
        
    }
    
//    void def(){ // в сигнатуре метода необязательно указывать, что он может выбросить 
//                // ексепшен, так как это рантайм эксепшен
//       
//        try{
//            int [] arr = {1, 2, 3};
//            System.out.println(arr[5]);
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("FileNotFoundException is catched ");
//            throw e;
//        }
//        finally{
//            System.out.println("it's finally block ");
//
//        }
//    
//    }
    

}
