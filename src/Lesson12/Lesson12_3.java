
package Lesson12;

public class Lesson12_3 {
    
    void maxValue(int i1, int i2, int i3) {
        
        if(i1 > i2 && i1 > i3 ) {
//            int a = 5;
            System.out.println("Max value is: " + i1);
        } else if(i2 > i1 && i2 > i3) {
//            a = 10; // ошибка так как а - локальная и видна только внутри каждого из условий, где он прописан
            System.out.println("Max value is: " + i2);
        } else {
            System.out.println("Max value is: " + i3);
        }
        
    }
    
    public static void main(String[] args) {
        
        Lesson12_3 test1 = new Lesson12_3();
        
        test1.maxValue(3, 5, 1);
        
    }
    
}
