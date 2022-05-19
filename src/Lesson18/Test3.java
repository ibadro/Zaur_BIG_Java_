
package Lesson18;

public class Test3 {
    
    
    public static void main(String[] args) {
        
        double [] array1;
        array1 = new double[2];
        
        array1[0] = 2.5;
        array1[1] = 3.7;
        
        
        
        double [][] array2;
        array2 = new double[2][2];
        
        array2[0][0] = 3.14;
        array2[0][1] = 1.14;
        
        array2[1] = array1;
        
        // что мы сделали, создали 2 массива
        // один двухмерный, второй одномерный
        // присвоили в двухмерному массиву арр2 с индексом [1] одномерный арр1
        
        System.out.println(array2[1][0]); // 2.5
        System.out.println(array2[1][1]); // 3.7
        
    }
    
}
