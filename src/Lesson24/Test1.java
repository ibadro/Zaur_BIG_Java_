
package Lesson24;

public class Test1 {
    
}

class A{
      
    String s1 = "!!!";
    void abc(){
        System.out.println("hi");
    }
    
}

class B extends A{

    String s1 = "@@@";
    void abc(){
        System.out.println("by");
    }
    
}

class C extends B{

    public static void main(String[] args) {
        
        
        C c = new C();
        c.abc(); // by
        System.out.println(c.s1); // @@@
        
    }

}