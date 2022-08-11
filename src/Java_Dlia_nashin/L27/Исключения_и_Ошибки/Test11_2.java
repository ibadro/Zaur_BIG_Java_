
package Java_Dlia_nashin.L27.Исключения_и_Ошибки;

public class Test11_2 {
    
    public static void main(String[] args) throws Exception {
        
        Exception e = null;
        throw e; // если мы просто ходить выбросить эксепшен, то опять -таки
                // его нужно поместить в трай кэч или указать throws Exception
                // в сигнатуре метода мейн
                
//Exception in thread "main" java.lang.NullPointerException
//	at Java_shernii_poias.Lesson1.Lesson27.Test11_2.main(Test11_2.java:9)
        
    }
    
}
