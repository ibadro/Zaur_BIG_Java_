
package Java_Dlia_nashin.L19.Параметры_метода_типа_Varargs_аргументы_ипа_command_line;

public class  Test3 {
    
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
