
package Lesson27;

public class Test12 {

    void abc(){
        
        int [] arr = {1, 2, 3};
        
        try{
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            
            String s = null;
            System.out.println(s.length());
            
        }
        catch(NullPointerException e){ // этот кэч блок не видит эксепшены из 
                                       // предыдущего кэч блока,
                                       // он связан также, как и предудущий кэч блок
                                       // с единственным трай блоком, в котором
                                       // будет ArrayIndexOutOfBoundsException
            System.out.println("NullPointerException is catched");
        }
        
    }
    
    public static void main(String[] args) {
        
        Test12 t = new Test12();
        t.abc();
//        Exception in thread "main" java.lang.NullPointerException
//	at Lesson27.Test12.abc(Test12.java:16)
//	at Lesson27.Test12.main(Test12.java:32)
        
    }
    
}
