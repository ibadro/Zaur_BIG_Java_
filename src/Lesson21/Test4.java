
package Lesson21;

public class Test4 {
    
    int abc(){
        return 5;
    }
    
    int abc2(int i){
        if (i < 10) {
            return 5;
        } else {
            return 10;
        }
    }
    
    void abc3(){
        System.out.println("1223444");
        return;
//        System.out.println("dsfgfg"); unreachable 
    }
    
    public static void main(String[] args) {
        
        int a = new Test4().abc();
        System.out.println(a); // 5
        // присвоили переменной а выполнение метода абс
        
    }
    
}
