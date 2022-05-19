
package Lesson27;

import java.io.*;

public class Test5 {
    
    void abc() throws FileNotFoundException{
    
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f); 
        // должны или обработать в трай, кэч, или объявить throws FileNotFoundException
        // но если есть ошибка, она появится, если не обработать в трай, кэч
        
    }
    
    void def() throws IOException{
        // ПОЧЕМУ IOException , А НЕ FileNotFoundException, ПОТОМУ ЧТО IOException - ЭТО
        // ЕГО РОДИТЕЛЬ, МОЖНО ТАКЖЕ УКАЗЫВАТЬ РОДИТЕЛЯ
        System.out.println("throws Exception");
        abc(); // тут должны или обработать в трай, кэч, или объявить throws Exception
        // но если есть ошибка, она появится, если не обработать в трай, кэч
    }
    
    public static void main(String[] args) throws Exception { // такая же логика с throws Exception
        // ПОЧЕМУ Exception , А НЕ IOException, ПОТОМУ ЧТО Exception - ЭТО
        // ЕГО РОДИТЕЛЬ, МОЖНО ТАКЖЕ УКАЗЫВАТЬ РОДИТЕЛЯ
        // НО ВООБЩЕ throws Exception ТУТ ПИСАТЬ НЕ СТОИТ,
        // ПОТОМУ ЧТО ЭКСЕПШЕН ОБРАБОТАН
        
        Test5 exec = new Test5();
//        exec.def(); // throws Exception
        // тк файл действительно лежит в нужной папке
        // если File f = new File("test9.txt");
        // выбросится эксепшен файлнотфаунд 
        
        try{
            exec.def();
        }
        catch(IOException e){ // IOException вместо файлнотфаунд можно писать, ибо IOException - это родитель
            System.out.println("FileNotFoundException was catched");
            System.out.println(e.getMessage()); // test9.txt (Не удается найти указанный файл)
            
//            IOException ioExc = e; // 
            
            e.printStackTrace(); // стек трейс
//            java.io.FileNotFoundException: test9.txt (Не удается найти указанный файл)
//	at java.base/java.io.FileInputStream.open0(Native Method)
//	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//	at Lesson27.Test5.abc(Test5.java:11)
//	at Lesson27.Test5.def(Test5.java:21)
//	at Lesson27.Test5.main(Test5.java:38)
        }
        // обратотали эксепшен, но лучше это делать в самом методе
        
        
    }
    
}

// CHECKED EXCEPTIONS ДОЛЖНЫ ВСЕГДА ЛИБО ОБРАБОТАНЫ, ЛИБО ОБЪЯВЛЕНЫ
// ЛИБО ТРАЙ/КЭЧ, ИЛИ УКАЖИ throws Exception