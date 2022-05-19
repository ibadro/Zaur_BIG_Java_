
package Lesson19;

public class Test3 {
    
//    void abc(int[] ... arr) {
//    // int[] ... arr - означает, что в параметре метода abc можно использовать до бесконечности массивов
//        
//        
//    }
    
    public static void main(String[] args) {
        
        int [] arr = {0, 6, 4, 1};
        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
        

        // foreach loop
        for(int a:arr) {
            // foreach сам знает, когда надо остановится, он видит , что 1- последний 
            // элемент массива arr
            System.out.print(a + " ");
        }
        System.out.println("");

    }
    
}
