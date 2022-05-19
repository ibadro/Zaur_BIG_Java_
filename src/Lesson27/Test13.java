
package Lesson27;

import java.io.*;

public class Test13 {

    void marafon(int temper, int tempBega) throws PodvertutNoguException{ // указываем в сигнатуре
                                // что может выпасть эксепшен PodvertutNoguException
                                // ведь мы его будет выбрасывать
                                // чтоб не оборачивать его в трай кэч
                                
                                // заметь, что RuntimeException в сигнатуре нет,
                                // все потому, что он рантайм и его не надо обозначать и оборачивать в трай кэч
        if (tempBega > 12) {
            throw new PodvertutNoguException("temp bega bil visokiy:" + tempBega);
        }
        
        if (temper > 32) {
            throw new SvelotNoguException();
        }
        
        System.out.println("you are the champ");
        
    }
    
    
    public static void main(String[] args) {
        
        Test13 t = new Test13();
        
        try{
            t.marafon(40, 0);
        }
        catch(PodvertutNoguException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("anyway you'll get cerificate");
        }
        
//        anyway you'll get cerificate
//        Exception in thread "main" Lesson27.SvelotNoguException
//	at Lesson27.Test13.marafon(Test13.java:20)
//	at Lesson27.Test13.main(Test13.java:33)
        
    }
    
    
}

// СОЗДАНИЕ СОБСТВЕННЫХ ЭКСЕПШЕНОВ

class PodvertutNoguException extends Exception{
    
    PodvertutNoguException(String message){
        super(message); // супер классу передаем то, что будет сетаться во время 
                        // создания конструктора
                        
                        
    }
    PodvertutNoguException(){ // пустой коструктор, если мы не хотим сетать мессач
        
    }
    
}

class SvelotNoguException extends RuntimeException{ // обрати внимание, что это 
                        // RuntimeException, следовательно, его можно не оборачивать
                        // в трай кэч, также можно не добавлять сигнатуру
                        // extends Exception в метод, ведь это RuntimeException
    
    SvelotNoguException(String message){
        super(message); // супер классу передаем то, что будет сетаться во время 
                        // создания конструктора
                        
                        
    }
    SvelotNoguException(){ // пустой коструктор, если мы не хотим сетать мессач
        
    }

}