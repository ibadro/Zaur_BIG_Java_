
package Lesson27;

public class Test15 {
    
    // static initializer и ExceptionInInitializerError
    
//    static{
//        int a = Integer.parseInt("12g"); // по идее должен выброситься NumberFormatException
        // но тк он находится в static initializer
        // мы имеем ExceptionInInitializerError
//    }
    
    
    // 2 статические переменные и ExceptionInInitializerError
    
//    static String s = null;
//    static int a = s.length();// по идее должен выброситься NullPointerException
    // но тк мы работаем со статиком - java.lang.ExceptionInInitializerError
        
    
    static String s = abc();
    static String abc(){
        
        String [] arr = {"1", "2"};
        return arr[100]; // по идее должно быть ArrayIndexOutOfBoundsException, НО
        // ТК МЫ РАБОТАЕМ СО СТАТИК - ExceptionInInitializerError
        
    }

    
    public static void main(String[] args) {
        

    }
    
}
