
package Lesson15;

public class Test3 {
    
    public static void main(String[] args) {
        
        boolean b = true;
        int a = 1;
        
        while(b){ // пока тру
        
            if((a % 3 == 0) && (a % 7 == 0)) { // когда число будет без остатка делится и на 3, и на 7 , мы выходим из цикла
//                break;// один из вариантов просто сделать брейк, но мы не получим 21 - так как брейк выкинет нас из цикла на 21
            b = false;    
            }
            
            System.out.println(a);
            a++;
            
        }
                
    }
    
}
