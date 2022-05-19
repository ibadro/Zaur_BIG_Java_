
package Lesson26;

public class Test4_2 {
    
    // ПРИОРИТЕЗАЦИЯ ВЫЗОВОВ МЕТОДОВ
    void def(Object o){
        System.out.println("Object");
    }
    void def(String s){
        System.out.println("String");
    }
    
//    void abc(int a, int b){ // приоритет номер 1 
//        System.out.println("hello1");
//    }
//    void abc(long a, long b){ // приоритет номер 2 
//        System.out.println("hello2");
//    }
//    void abc(Integer a, Integer b){ // приоритет номер 3 
//        System.out.println("hello3");
//    }
    void abc(int ... a){ // varargs .. // приоритет номер 4 
        System.out.println("hello4");
    }
    
    
    
    public static void main(String[] args) {
        
        Test4_2 exec = new Test4_2();
        exec.def("hi"); // String
        // если закоментить void def(String s)
        // то вызоведтся def(Object o)
        
        // почему так?
        // потому что ищется наибольшее совподение
        
        exec.abc(1, 1); // hello1
        // если закоментить void abc(int a, int b), то сработает hello2
        // если закоментить void abc(long a, long b), то сработает hello3
        // если закоментить void abc(Integer a, Integer b), то сработает hello4
        
        // таким образом на первом месте - полное совпадение по типам данных
        // второе место - поглощающие типы данных(к примеру лонг по отнощению к инту)
        // враппер классы на третьем месте
        // вараргс на последнем
        
        
    }
    
}
