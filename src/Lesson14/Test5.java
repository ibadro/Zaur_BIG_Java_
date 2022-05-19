
package Lesson14;

public class Test5 {
    
    int i = 1;
    
    
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("*" + i);
            showNumber(1); // так делать правильно, ф-ии лучше вызывать в теле, а не в апдейтс
//            i++; апдейт стейтмент можно прописывать и в конце боди
            
            
        }
        
    }
    
    static void showNumber(int n) { // статик - чтобы не создавать объект класса Test5
        System.out.println(n);
    }
    
}
