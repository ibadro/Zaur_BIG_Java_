
package Lesson26;

public class Test6 {
    
    String s1;
    
    // initializer block
    {
        System.out.println("Hi");
        s1 = "в initializer block можно менять переменные, которые созданы вне этого блока";
        
        int a = 5;
        System.out.println(a);
        System.out.println(s1);
    }
   
    // initializer block срабатывает каждый раз, когда создается объект
    // соответствующего класса
    
    public static void main(String[] args) {
        
        Test6 exec = new Test6();
        Test6 exec2 = new Test6();
//        Hi
//        5
//        в initializer block можно менять переменные, которые созданы вне этого блока
//        Hi
//        5
//        в initializer block можно менять переменные, которые созданы вне этого блока


    }
    
}
