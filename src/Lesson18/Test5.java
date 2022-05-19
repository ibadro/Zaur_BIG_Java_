
package Lesson18;

public class Test5 {
    
    static String s1;
    
    public static void main(String[] args) {
        
        // exceptions
        
//        int [] arr = new int[-3]; // компилятор пропустит
//           но вылезит эксепшен - NegativeArraySizeException
        
        int [] arr1 = new int[3];
        
        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;
//      arr[3] = 1; // компилятор пропустит 
// но вылезит эксепшен - ArrayIndexOutOfBoundsException
// вышел за границы массива
        
        int [][] arr3 = new int[3][]; // by defaul arr3[0][0] и прочие значения двухменрного массива - null
        System.out.println(arr3[0][0]); // компилятор пропустит
//           но вылезит эксепшен - NullPointerException
        
        
        System.out.println(s1.length()); // компилятор пропустит
//           но вылезит эксепшен - NullPointerException
// потому что s1 - пустая, то есть по дефолту null
// а длина null - ничто, то есть такого быть не может
        
        
    }
    
}
