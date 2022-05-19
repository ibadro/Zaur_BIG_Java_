
package Lesson19;

public class Test8 {
    
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,3};
        int [] arr2 = {-1,-2,-3};
        
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            arr1[i] = 12;
            arr2[i] = 3;
        }// внутри одного фор лупа меняем динамически содержимое двух массивов
        
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            System.out.print(arr1[i] + " ");
            System.out.println(arr2[i] + " ");
        }
        
        
        
        
    }
    
}
